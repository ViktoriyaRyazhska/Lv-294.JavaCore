package hm02;
import java.time.Year;

import java.util.Scanner;

public class Person {
	private String name;
	private int birthYea;
	
public Person() {
	}
	
	public Person(String name, int birthYea) {
		this.name = name;
		this.birthYea = birthYea;
	}
	
public String getName() {
	return name;
	}
	
	public void setName(String name) {
		this.name = name;
		}
public int getBirthYea() {
	return birthYea;
}
	
	public void setBirthYea(int birthYea) {
		this.birthYea = birthYea;
		}
	
public int Age() {
		
		return  Year.now().getValue()-birthYea;
	}

public void changeName(String name) {
	this.name = name;
}

public void input() {
	
	Scanner sc = new Scanner (System.in);
	System.out.println("Input name of person: ");
	name = sc.nextLine();
	System.out.println("Input birth year: ");
	birthYea = sc.nextInt();
	sc.close();
		    
	    
	    System.out.println("input year of birth ");
	   
	}

 @Override
 public String toString() {
	 return "Person [name =" + name + ", year of birth =" + birthYea + " ]";

 }

 



}
