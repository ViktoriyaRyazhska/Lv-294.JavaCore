import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
	
		
		
		Person  person1 = new Person ("Maria");
		person1.setBirthYear(1998);
		Person  person2 = new Person ("Olga");
		person2.setBirthYear(1997);
		Person  person3 = new Person ("Mykola");
		person3.setBirthYear(2000);
		Person  person4 = new Person ("Vira", 1996);
		input("Slavko",2000);
		//System.out.println("Person5 name = " + person5.getName() + 
		//"birth of year =" + person5.birthYear);
		//чому видає помилку що person5 cannot br resolved?
		age (person1);
		output (person1);
		output (person2);
		output (person3);
		output (person4);
		
	//??????????????????????	питання 1. Чому методи написані нижче не видно в main класі коли
		//вони знаходяться в класі Person
	// питання 2. як виправити помилку в 28 рядку? коли зняти коментар.
	//Чи будуть коректно працювати обидва методи output
//output (person5); 
		
		changeNane(person1,"Isabela");
		output (person1);
		
		}

	
	public static int getCurrentYear()
	{
		java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.TimeZone.getDefault(), java.util.Locale.getDefault());
		calendar.setTime(new java.util.Date());
		return calendar.get(java.util.Calendar.YEAR);
	}
	public static  void age (Person pr) {
		int ageOfPerson = getCurrentYear()-pr.getBirthYear();
		System.out.println("Age of "+ pr.getName() + " = " + ageOfPerson );
		}
	public static void output (Person pr) {	
		System.out.println("Person name = " + pr.getName() + ", birth of year =" + pr.birthYear);
		}
	
	
	public static Person    input (String name,int birthYear) {
		Person person5 = new Person();
		person5.setName(name);
		person5.setBirthYear(birthYear);
		return (person5);
	}
	
/*	public static  void  input()  throws IOException {
	    BufferedReader br = new BufferedReader(	new InputStreamReader(System.in));
	    Person person5 = new Person();
	System.out.println("Input name");
	String name = br.readLine();
	person5.setName(name);
	System.out.println("Input birthYear");
	String birthYear = br.readLine();
	int m1 = Integer.parseInt(birthYear);
	person5.setBirthYear(m1);
	}	
*/	
	public static void changeNane(Person pr, String newPersonName) {
		System.out.println("New name of  " + pr.getName());
		pr.setName(newPersonName);
		System.out.println("is  " + pr.getName());
		
		}
	}


