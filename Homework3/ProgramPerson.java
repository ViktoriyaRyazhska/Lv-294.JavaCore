import java.io.IOException;

public class ProgramPerson {

    public static void main(String[] args) throws IOException {
        Person person1 = new Person(); // default constructor in use
        person1.setName("Vasya"); // property Name
        person1.setBirthYear(1986); // property birthYear
        
        Person person2 = new Person("Petya", 2000); // constructor with 2 parameters in use
        
        Person person3 = new Person("Kolya", 1990);
        
        Person person4 = new Person("Vova", 1999);
        Person person5 = new Person("Misha", 2000);
        
        System.out.println(person1.toString()); //override and age method in use
        System.out.println(person2.toString());
        System.out.println(person3.toString());
        System.out.println(person4.toString());
        System.out.println(person5.toString());
        
        person4.input(); // method input in use
        person4.output(); //method output in use
        
        person5.changeName("Marisha"); // method changeName in use
        person5.output();
    }
}
