import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {
    private String name;
    private int birthYear;
    private int year;

    public Person() {
    }

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setYear(int year) {
        this.year = year;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int age() {
        return year - birthYear;
    }

    public void changeName(String name) {
        this.name = name;
    }

    public void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name");
        name = br.readLine();
        System.out.println("Enter your birth year");
        birthYear = Integer.parseInt(br.readLine());
        System.out.println("Enter current year");
        year = Integer.parseInt(br.readLine());
    }

    public void output() {
        System.out.println("Name is: " + name + ". Person was born in " + birthYear + ". Now is " + year + " year. Age is " + age() + ".");
    }

    public String toString() {
        return "Name is: " + name + ". Person was born in " + birthYear + ". Now is " + year + " year. Age is " + age() + ".";
    }
}

