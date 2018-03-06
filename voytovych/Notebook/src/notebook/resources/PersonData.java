package notebook.resources;

import notebook.objects.Person;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public final class PersonData {
   private static final ObservableList<Person> personData = FXCollections.observableArrayList();

   private PersonData() {
   }

   public static ObservableList<Person> getPersonData() {
      personData.add(new Person("James", "Smith"));
      personData.add(new Person("Michael", "Smith"));
      personData.add(new Person("Robert", "Smith"));
      personData.add(new Person("Maria", "Garcia"));
      personData.add(new Person("David", "Smith"));
      personData.add(new Person("Maria", "Smith"));
      personData.add(new Person("Maria", "Hernandez"));
      personData.add(new Person("Maria", "Martinez"));
      personData.add(new Person("James", "Johnson"));
      return personData;
   }
}
