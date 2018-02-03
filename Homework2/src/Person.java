import java.io.BufferedReader;
import java.io.IOException;
import java.time.Year;

public class Person {
	String name;
	int birthYear;
	
	public Person() {}
	
	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}

	public String getName() {return name;}
	
	public void setName(String name) {this.name = name;}
	
	public int getBirthYear() {return birthYear;}
	
	public void setBirthYear(int birthYear) {this.birthYear = birthYear;}
	
	public int Age() {
		
		return  Year.now().getValue()-birthYear;
	}
	
	public void input(BufferedReader reader) {
		if(name!=null && birthYear!=0) {
			System.out.println("Person has been already created!");
			return;
		}
		
		try {
			this.setName(reader.readLine());
			this.setBirthYear(Integer.parseInt(reader.readLine()));
		}catch(NumberFormatException e) {
			System.out.println("Wrong input");
			e.printStackTrace();;
		}
		catch(IOException e) {
			//DO SOMETHING
			e.printStackTrace();
		}
	}
	
	public String Output() {
		return  "Name: " + name + ", Birth year: " + birthYear;

	}
	
	public void changeName(String name) {
		this.name = name;
	}
}
