
public class Main {

	public static void main(String[] args) {
		Person person1 = new Person("Oleg");
		person1.setBirthYear(1999);
		System.out.println(person1);
		Person person2 = new Person("Oksana");
		person1.setBirthYear(1995);
		System.out.println(person2);
		Person person3 = new Person("Kateryna");
		person1.setBirthYear(2001);
		System.out.println(person3);
		Person person4 = new Person("Viktoriya");
		person1.setBirthYear(1998);
		System.out.println(person4);
		Person person5 = new Person("Maxym");
		person5.setBirthYear(1992);
		System.out.println(person5);
		System.out.println();
		person1.changeName("Olexa");
		System.out.println(person1);
		Person person6 = new Person();
		person6.Input();
		System.out.println(person6);
	} 
}