import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {
    // declare fields
    private String name;
    private int birthYear;

    // create constructor
    // constructor by default
    public Person() {
    }

    // constructor with 2 parameters
    public Person(String name, int birthYear) {
        this.setName(name);
        this.setBirthYear(birthYear);
    }

    // properties for access
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    // create method age
    public int age() {
        return 2018 - getBirthYear();
    }

    // create method input
    public void input() throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        
        System.out.print("Enter person name: ");
        String name = br.readLine();
        
        System.out.print("Enter person birth year: ");
        int birthYear = Integer.parseInt(br.readLine());
        
        this.setName(name);
        this.setBirthYear(birthYear);
    }

    // create method output
    public void output() {
        System.out.println("Person's name: " + this.getName());       
        System.out.println("Person's birth year: " + this.getBirthYear());
        System.out.println("Person's age: " + this.age());
    }

    @Override
    public String toString() {
        return "Name: " + name + ", birth year" + ", " + this.age() + " years old.";
    }
    
    // created method changeName
    public void changeName(String name) {
        this.setName(name);        
    }
}
