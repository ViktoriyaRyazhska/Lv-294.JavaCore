package notebook.controllers;

import notebook.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.MenuItem;
import javafx.stage.FileChooser;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class RootController implements Initializable {

   @FXML
   private MenuItem newBookItem;
   @FXML
   private MenuItem openItem;
   @FXML
   private MenuItem saveItem;
   @FXML
   private MenuItem saveAsItem;
   @FXML
   private MenuItem exitItem;
   @FXML
   private MenuItem aboutItem;

   private Main startApp;
   private ResourceBundle resourceBundle;

   public void setInitialize(Main startApp) {
      this.startApp = startApp;
   }

   @Override
   public void initialize(URL location, ResourceBundle resources) {
      this.resourceBundle = resources;
   }
   @FXML
   private void handleNewBook(ActionEvent event) {
      startApp.getPersonList().clear();
      startApp.setPersonFilePath(null);
   }

   @FXML
   private void handleOpenBook(ActionEvent event) {
      FileChooser fileChooser = new FileChooser();
      FileChooser.ExtensionFilter exFilter = new FileChooser.ExtensionFilter("XML files (*.xml)", "*.xml");
      fileChooser.getExtensionFilters().add(exFilter);
      File file = fileChooser.showOpenDialog(startApp.getPrimaryStage());
      if (file != null) {
         startApp.loadPersonDataFromFile(file);
      }
   }

   @FXML
   public void handleSave(ActionEvent event) {
      File personFile = startApp.getPersonFilePath();
      if (personFile != null) {
         startApp.savePersonDataToFile(personFile);
      } else {
         handleSaveAs(event);
      }
   }

   @FXML
   private void handleSaveAs(ActionEvent event) {
      FileChooser fileChooser = new FileChooser();
      FileChooser.ExtensionFilter exFilter = new FileChooser.ExtensionFilter("XML files (*.xml)", "*.xml");
      fileChooser.getExtensionFilters().add(exFilter);
      File file = fileChooser.showOpenDialog(startApp.getPrimaryStage());
      if (file != null) {
         startApp.savePersonDataToFile(file);
      }
   }

   @FXML
   public void handleClose(ActionEvent event) {
      System.exit(0);
   }

   @FXML
   private void handleAbout() {
      Alert alert = new Alert(AlertType.INFORMATION);
      alert.setTitle(resourceBundle.getString("address_app"));
      alert.setHeaderText(resourceBundle.getString("about"));
      alert.setContentText(resourceBundle.getString("author") + "\nvoytovych@gmail.com");
      alert.showAndWait();
   }
}