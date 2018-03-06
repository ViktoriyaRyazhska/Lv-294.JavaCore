package notebook.objects;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "persons")
public class ListWrapper {
   private List<Person> persons;

   @XmlElement(name = "person")
   public List<Person> getPersons() {
      return persons;
   }

   public void setPersons(List<Person> persons) {
      this.persons = persons;
   }
}
