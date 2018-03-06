package notebook;

import notebook.objects.Person;
import notebook.objects.ListWrapper;
import notebook.resources.PersonData;
import notebook.controllers.EditController;
import notebook.controllers.OverviewController;
import notebook.controllers.RootController;

import java.io.File;
import java.io.IOException;
import java.util.ResourceBundle;
import java.util.prefs.Preferences;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import java.util.Locale;

public class Main extends Application {
  // private static final Locale DEFAULT_LOCALE = new Locale("uk");
   private static final Locale DEFAULT_LOCALE = new Locale("en");
   private Stage primaryStage;
   private BorderPane rootLayout;
   private ObservableList<Person> personList = FXCollections.observableArrayList();
   private Preferences pref;

   public Main() {
      personList = PersonData.getPersonData();
   }

   @Override
   public void start(Stage primaryStage) {
      Locale.setDefault(DEFAULT_LOCALE);
      this.primaryStage = primaryStage;
      this.primaryStage.setTitle("notebook");
      initRootLayout();
      showPersonOverview();
   }

   public void initRootLayout() {
      try {
         FXMLLoader loader = new FXMLLoader();
         loader.setLocation(getClass().getResource("fxml/RootLayout.fxml"));
         loader.setResources(ResourceBundle.getBundle("notebook/bundles/Locale"));
         rootLayout = loader.load();
         Scene scene = new Scene(rootLayout);
         primaryStage.setScene(scene);
         primaryStage.getIcons().add(new Image(Main.class.getResourceAsStream("resources/images/addressBook.png")));
         primaryStage.setResizable(false);
         primaryStage.show();
         RootController controller = loader.getController();
         controller.setInitialize(this);
         if (pref != null) {
            File file = getPersonFilePath();
            if (file != null) {
               loadPersonDataFromFile(file);
            }
         }
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public void showPersonOverview() {
      try {
         FXMLLoader loader = new FXMLLoader();
         loader.setLocation(Main.class.getResource("fxml/Overview.fxml"));
         loader.setResources(ResourceBundle.getBundle("notebook/bundles/Locale"));
         AnchorPane personOverview = (AnchorPane) loader.load();
         rootLayout.setCenter(personOverview);
         OverviewController controller = loader.getController();
         controller.setPersonList(this);
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public Stage getPrimaryStage() {
      return primaryStage;
   }

   public ObservableList<Person> getPersonList() {
      return personList;
   }

   public boolean showPersonEditDialog(Person person) {
      try {
         FXMLLoader loader = new FXMLLoader();
         loader.setLocation(Main.class.getResource("fxml/EditDialog.fxml"));
         loader.setResources(ResourceBundle.getBundle("notebook/bundles/Locale"));
         AnchorPane page = (AnchorPane) loader.load();
         Stage dialogStage = new Stage();
         dialogStage.setTitle("Edit Person");
         dialogStage.initModality(Modality.WINDOW_MODAL);
         dialogStage.initOwner(this.getPrimaryStage());
         Scene scene = new Scene(page);
         dialogStage.setScene(scene);
         EditController controller = loader.getController();
         controller.setDialogStage(dialogStage);
         controller.setPerson(person);
         dialogStage.showAndWait();
         return controller.isOkCliked();
      } catch (IOException e) {
         e.printStackTrace();
         return false;
      }
   }

   public File getPersonFilePath() {
      Preferences pref = Preferences.userNodeForPackage(Main.class);
      String filePath = pref.get("filePath", null);
      if (filePath != null) {
         return new File(filePath);
      } else {
         return null;
      }

   }

   public void setPersonFilePath(File file) {
      Preferences pref = Preferences.userNodeForPackage(Main.class);
      if (file != null) {
         pref.put("filePath", file.getPath());
         primaryStage.setTitle("notebook - " + file.getName());
      } else {
         pref.remove("filePath");
         primaryStage.setTitle("notebook");
      }
   }

   public void loadPersonDataFromFile(File file) {
      try {
         JAXBContext context = JAXBContext.newInstance(ListWrapper.class);
         Unmarshaller um = context.createUnmarshaller();
         ListWrapper wrapper = (ListWrapper) um.unmarshal(file);
         personList.clear();
         personList.addAll(wrapper.getPersons());
         this.setPersonFilePath(file);
      } catch (Exception e) {
         Alert alert = new Alert(AlertType.ERROR);
         alert.setTitle("Error");
         alert.setHeaderText("Could not load data");
         alert.setContentText("Could not load data from file:\n" + file.getPath());
         alert.showAndWait();
      }
   }

   public void savePersonDataToFile(File file) {
      try {
         JAXBContext context = JAXBContext.newInstance(ListWrapper.class);
         Marshaller m = context.createMarshaller();
         m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
         ListWrapper wrapper = new ListWrapper();
         wrapper.setPersons(personList);
         m.marshal(wrapper, file);
         this.setPersonFilePath(file);

      } catch (Exception e) {
         Alert alert = new Alert(AlertType.ERROR);
         alert.setTitle("Error");
         alert.setHeaderText("Could not save data");
         alert.setContentText("Could not save data to file:\n" + file.getPath());
         alert.showAndWait();
      }
   }
   public static void main(String[] args) {
      launch(args);
   }
}        