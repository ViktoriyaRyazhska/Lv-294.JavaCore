package notebook.controllers;

import notebook.objects.Person;
import notebook.resources.util.DateUtil;
import notebook.resources.util.EMailValidator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class EditController implements Initializable {

   @FXML
   private Button ok;
   @FXML
   private Button cancel;
   @FXML
   private TextField firstNameField;
   @FXML
   private TextField lastNameField;
   @FXML
   private TextField streetField;
   @FXML
   private TextField postalCodeField;
   @FXML
   private TextField cityField;
   @FXML
   private TextField phoneField;
   @FXML
   private TextField birthdayField;
   @FXML
   private TextField eMailField;

   private Stage dialogStage;
   private Person person;
   private boolean okClicked = false;
   private ResourceBundle resourceBundle;

   @Override
   public void initialize(URL location, ResourceBundle resources) {
      this.resourceBundle = resources;
   }

   @FXML
   private void handleOk(ActionEvent event) {
      if (isInputValid()) {
         person.setFirstName(firstNameField.getText());
         person.setLastName(lastNameField.getText());
         person.setStreet(streetField.getText());
         person.setPostalCode(Integer.parseInt(postalCodeField.getText()));
         person.setCity(cityField.getText());
         person.setBirthday(DateUtil.parse(birthdayField.getText()));
         person.setPhone(Integer.parseInt(phoneField.getText()));
         person.setEMail(eMailField.getText());

         okClicked = true;
         dialogStage.close();
      }
   }

   @FXML
   private void handleCancel(ActionEvent event) {
      dialogStage.close();
   }

   public void setDialogStage(Stage dialogStage) {
      this.dialogStage = dialogStage;
   }

   public void setPerson(Person person) {
      this.person = person;

      this.firstNameField.setText(person.getFirstName());
      this.lastNameField.setText(person.getLastName());
      this.streetField.setText(person.getStreet());
      this.postalCodeField.setText(Integer.toString(person.getPostalCode()));
      this.cityField.setText(person.getCity());
      this.phoneField.setText(Integer.toString(person.getPhone()));
      this.birthdayField.setText(DateUtil.format(person.getBirthday()));
      this.birthdayField.setPromptText("dd-mm-yyyy");
      this.eMailField.setText(person.getEMail());
   }

   public boolean isOkCliked() {
      return okClicked;
   }

   private boolean isInputValid() {
      String errorMessage = "";
      if (firstNameField.getText() == null || firstNameField.getText().length() == 0) {
         errorMessage += "No Valid First Name! \n";
      }
      if (lastNameField.getText() == null || lastNameField.getText().length() == 0) {
         errorMessage += "No Valid Last Name! \n";
      }
      if (streetField.getText() == null || streetField.getText().length() == 0) {
         errorMessage += "No Valid street! \n";
      }
      if (postalCodeField.getText() == null || postalCodeField
         .getText().length() == 0) {
         errorMessage += "No Valid Postal Code! \n";
      } else {
         try {
            Integer.parseInt(postalCodeField.getText());
         } catch (NumberFormatException e) {
            errorMessage += "No Valid Postal Code.Use Number not letter!\n";
         }
      }
      if (cityField.getText() == null || cityField.getText().length() == 0) {
         errorMessage += "No Valid City! \n";
      }
      if (birthdayField.getText() == null || birthdayField
         .getText().length() == 0) {
         errorMessage += "No valid birthday!\n";
      } else {
         if (!DateUtil.validDate(birthdayField.getText())) {
            errorMessage += "No valid birthday. Use the format dd-mm-yyyy!\n";
         }
      }
      if (phoneField.getText() == null || phoneField.getText().length() == 0) {
         errorMessage += "No Valid Phone Number! \n";
      } else {
         try {
            Integer.parseInt(phoneField.getText());
         } catch (NumberFormatException e) {
            errorMessage += "No Valid Phone Number.Use Number not letter!\n";
         }
      }
      if (eMailField.getText() == null || eMailField.getText().length() == 0) {
         errorMessage += "No Valid E-Mail! \n";
      } else {
         EMailValidator val = new EMailValidator();
         if (!val.validate(eMailField.getText())) {
            errorMessage += "No Valid E-Mail!Please use user@example.xxx \n";
         }
      }
      if (errorMessage.length() == 0) {
         return true;
      } else {
         Alert alert = new Alert(AlertType.ERROR);
         alert.initOwner(dialogStage);
         alert.setTitle(resourceBundle.getString("inv_fields"));
         alert.setHeaderText(resourceBundle.getString("correct_fields"));
         alert.setContentText(errorMessage);
         alert.showAndWait();
         return false;
      }
   }
}
