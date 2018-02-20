import java.util.HashMap;
import java.util.Map;

public class Task2 {

    public static String getDuplicateName(Map<String, String> persons) {
        for (String firstName : persons.values()) {
            int  count = 0;
            for (String checkName : persons.values()) {
                if (firstName == checkName) {
                    count++;
                    
                    if (count == 2) {
                        return checkName;
                    }
                }
            }
        }
        
        return null;
    }
    
    public static void removeByName(String firstName, Map<String, String> persons) {
        for (String lastName : persons.keySet()) {
            if (firstName == persons.get(lastName)) {
                persons.remove(lastName);
                return;
            }
        }
    }

    public static void printPersons(Map<String, String> persons) {
        for (String lastName : persons.keySet()) {
            System.out.println(persons.get(lastName) + " " + lastName);
        }
    }
    
    public static void main(String[] args) {
        Map<String, String> persons =  new HashMap<>();
        persons.put("Petrenko", "Vasyl");
        persons.put("Gupalo", "Vasyl");
        persons.put("Petrenko1", "Omelyan");
        persons.put("Petrenko2", "Haryton"); // MytetS        
        persons.put("Petrenko3", "Nazar");
        persons.put("Petrenko4", "Alfred");
        persons.put("Petrenko5", "Havriysha");
        persons.put("Petrenko6", "Stepan");
        persons.put("Petrenko7", "Shloma");
        persons.put("Prorok", "Orest");
        
        System.out.println("Persons:");
        printPersons(persons);
        
        System.out.println("Duplicate name: " + getDuplicateName(persons));

        removeByName("Orest", persons);
        System.out.println("Persons after remove operation:");
        printPersons(persons);
    }
}
