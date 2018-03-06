package notebook.objects;

import notebook.resources.util.LocalDateAdapter;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Objects;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

public class Person implements Comparable<Person>, Comparator<Person> {

   private StringProperty firstName;
   private StringProperty lastName;
   private StringProperty street;
   private IntegerProperty postalCode;
   private StringProperty city;
   private IntegerProperty phone;
   private ObjectProperty<LocalDate> birthday;
   private StringProperty eMail;

   public Person() {
      this(null, null);
   }

   public Person(String firstName, String lastName) {
      this.firstName = new SimpleStringProperty(firstName);
      this.lastName = new SimpleStringProperty(lastName);
      this.street = new SimpleStringProperty("street");
      this.postalCode = new SimpleIntegerProperty(45678);
      this.city = new SimpleStringProperty("city");
      this.phone = new SimpleIntegerProperty(1234567890);
      this.birthday = new SimpleObjectProperty<>(LocalDate.of(2000, 01, 01));
      this.eMail = new SimpleStringProperty("something@xxxx.xxx");
   }

   public String getFirstName() {
      return firstName.get();
   }

   public void setFirstName(String firstName) {
      this.firstName.set(firstName);
   }

   public StringProperty firstNameProperty() {
      if (firstName == null) {
         firstName = new SimpleStringProperty(this, "firstName");
      }
      return firstName;
   }

   public String getLastName() {
      return lastName.get();
   }

   public void setLastName(String lastName) {
      this.lastName.set(lastName);
   }

   public StringProperty lastNameProperty() {
      if (lastName == null) {
         lastName = new SimpleStringProperty(this, "lastName");
      }
      return lastName;
   }

   public String getStreet() {
      return street.get();
   }

   public void setStreet(String street) {
      this.street.set(street);
   }

   public StringProperty streetProperty() {
      return street;
   }

   public int getPostalCode() {
      return this.postalCode.get();
   }

   public void setPostalCode(int code) {
      this.postalCode.set(code);
   }

   public IntegerProperty postalCodeProperty() {
      return postalCode;
   }

   public String getCity() {
      return this.city.get();
   }

   public void setCity(String city) {
      this.city.set(city);
   }

   public StringProperty cityProperty() {
      return city;
   }

   public int getPhone() {
      return this.phone.get();
   }

   public void setPhone(int code) {
      this.phone.set(code);
   }

   public IntegerProperty phoneProperty() {
      return phone;
   }

   @XmlJavaTypeAdapter(LocalDateAdapter.class)
   public LocalDate getBirthday() {
      return this.birthday.get();
   }

   public void setBirthday(LocalDate birthday) {
      this.birthday.set(birthday);
   }

   public ObjectProperty<LocalDate> birthdayProperty() {
      return birthday;
   }

   public String getEMail() {
      return this.eMail.get();
   }

   public void setEMail(String eMail) {
      this.eMail.set(eMail);
   }

   public StringProperty eMailProperty() {
      return eMail;
   }

   @Override
   public int compareTo(Person p) {
      int diff = this.getFirstName().compareToIgnoreCase(p.getFirstName());
      if (diff == 0) {
         diff = this.getLastName().compareToIgnoreCase(p.getLastName());
      }
      return diff;
   }

   @Override
   public int compare(Person p1, Person p2) {
      return p1.compareTo(p2);
   }

   @Override
   public boolean equals(Object obj) {
      if (obj == this) {
         return true;
      }
      if (!(obj instanceof Person)) {
         return false;
      }
      Person p1 = (Person) obj;
      return this.getFirstName().equalsIgnoreCase(p1.getFirstName()) && this.getLastName().equalsIgnoreCase(p1.getLastName());
   }

   @Override
   public int hashCode() {
      int hash = 5;
      hash = 23 * hash + Objects.hashCode(this.firstName);
      hash = 23 * hash + Objects.hashCode(this.lastName);
      return hash;
   }
}