package notebook.controllers;

import notebook.Main;
import notebook.objects.Person;
import notebook.resources.util.DateUtil;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.Comparator;
import java.util.Observable;
import java.util.ResourceBundle;

public class OverviewController extends Observable implements Initializable {
   @FXML
   private TextField filterField;
   @FXML
   private TableView<Person> personTable;
   @FXML
   private TableColumn<Person, String> firstNameColumn;
   @FXML
   private TableColumn<Person, String> lastNameColumn;
   @FXML
   private Label firstNameLabel;
   @FXML
   private Label lastNameLabel;
   @FXML
   private Label streetLabel;
   @FXML
   private Label postalCodeLabel;
   @FXML
   private Label cityLabel;
   @FXML
   private Label phoneLabel;
   @FXML
   private Label birthdayLabel;
   @FXML
   private Label eMailLabel;
   @FXML
   private Button newButton;
   @FXML
   private Button editButton;
   @FXML
   private Button deleteButton;

   private ResourceBundle resourceBundle;

   private Main startApp;
   private SortedList<Person> sortedData;
   private final Comparator<Person> HOTNESS_COMPARATOR = (person, p) -> person.compareTo(p);
   private final ObjectProperty<Comparator<? super Person>>
      HOTNESS_COMPARATOR_WRAPPER = new SimpleObjectProperty<>(HOTNESS_COMPARATOR);

   @Override
   public void initialize(URL location, ResourceBundle resources) {
      this.resourceBundle = resources;
      firstNameColumn.setCellValueFactory(new PropertyValueFactory<>("firstName"));
      lastNameColumn.setCellValueFactory(new PropertyValueFactory<>("lastName"));
      personTable.getSortOrder().addAll(firstNameColumn, lastNameColumn);
   }

   public void setPersonList(Main startApp) {
      this.startApp = startApp;
      FilteredList<Person> filteredData = new FilteredList<>(
         startApp.getPersonList(), p -> true);
      filterField.textProperty().addListener((o, ov, nv) -> {
         filteredData.setPredicate(person -> {
            if (nv == null || nv.isEmpty()) {
               return true;
            }
            String lowerCaseFilter = nv.toLowerCase();

            if (person.getFirstName().toLowerCase().contains(lowerCaseFilter)) {
               return true;
            } else if (person.getLastName().toLowerCase().contains(lowerCaseFilter)) {
               return true;
            }
            return false;
         });
      });

      sortedData = new SortedList<>(filteredData);
      sortedData.comparatorProperty().bind(HOTNESS_COMPARATOR_WRAPPER);
      personTable.setItems(sortedData);

      this.showPersonDetails(null);
      personTable.getSelectionModel().selectedItemProperty().addListener((o, ov, nv) -> showPersonDetails(nv));
   }

   private void showPersonDetails(Person person) {
      if (person != null) {
         firstNameLabel.setText(person.getFirstName());
         lastNameLabel.setText(person.getLastName());
         streetLabel.setText(person.getStreet());
         postalCodeLabel.setText(Integer.toString(person.getPostalCode()));
         cityLabel.setText(person.getCity());
         phoneLabel.setText(Integer.toString(person.getPhone()));
         birthdayLabel.setText(DateUtil.format(person.getBirthday()));
         eMailLabel.setText(person.getEMail());
      } else {
         firstNameLabel.setText("");
         lastNameLabel.setText("");
         streetLabel.setText("");
         postalCodeLabel.setText("");
         cityLabel.setText("");
         phoneLabel.setText("");
         birthdayLabel.setText("");
         eMailLabel.setText("");
      }
   }

   @FXML
   private void handleDeletePerson(ActionEvent event) {
      Person selectedPerson = personTable.getSelectionModel().getSelectedItem();
      if (selectedPerson != null) {
         startApp.getPersonList().remove(selectedPerson);
      } else {
         alert();
      }
   }

   @FXML
   private void handleNewPerson(ActionEvent event) {
      Person tempPerson = new Person();
      boolean okClicked = startApp.showPersonEditDialog(tempPerson);
      if (okClicked) {
         startApp.getPersonList().add(tempPerson);
      }
   }

   @FXML
   private void handleEditPerson(ActionEvent event) {
      Person selectedPerson = personTable.getSelectionModel().getSelectedItem();
      if (selectedPerson != null) {
         boolean okClicked = startApp.showPersonEditDialog(selectedPerson);
         if (okClicked) {
            showPersonDetails(selectedPerson);
         } else {
            alert();
         }
      }
   }
   private void alert(){
      Alert alert = new Alert(AlertType.WARNING);
      alert.initOwner(startApp.getPrimaryStage());
      alert.setTitle(resourceBundle.getString("no_selection"));
      alert.setHeaderText(resourceBundle.getString("no_person"));
      alert.setContentText(resourceBundle.getString("select_person"));
      alert.showAndWait();
   }
   @FXML
   public void handleSort(Event event) {
      if (personTable.getSortOrder().size() == 0) {
         sortedData.comparatorProperty().bind(HOTNESS_COMPARATOR_WRAPPER);
         personTable.setSortPolicy(param -> true);
      }
   }
}