package hw07;

import hw07.task3.Course;
import hw07.task3.Student;
import hw07.task3.StudentApplication;

import java.util.ArrayList;
import java.util.List;

//import hw07.task2.PersonMap;

//import hw07.task1.SetApplication;
//
//import java.util.HashSet;
//import java.util.Set;
//
//import cw07.task1.MyCollection;

public class Main {

	public static void main(String[] args) {
//
//		MyCollection collection1 = new MyCollection();
//		collection1.fillCollection(15, 30);
//
//		MyCollection collection2 = new MyCollection();
//		collection2.fillCollection(15, 30);
//
//		Set<Integer> set1 = new HashSet<Integer>();
//		Set<Integer> set2 = new HashSet<Integer>();
//
//		set1.addAll(collection1.getList());
//		set2.addAll(collection2.getList());
//
//		SetApplication<Integer> app = new SetApplication<Integer>(set1, set2);
//		app.printSets();
//		app.union();
//		System.out.println("-----------------------------------------");
//		app.intersect();

		
//		PersonMap map = new PersonMap(10);
//		PersonMap map = new PersonMap();
//		map.getPersons().put("Popov","Ivan");
//		map.getPersons().put("Ivanov","Taras");
//		map.getPersons().put("Petrenko","Anton");
//		map.getPersons().put("Koval","Igor");
//		map.getPersons().put("Firman","Ivan");
//		map.getPersons().put("Pulnuk","Olga");
//		map.getPersons().put("Potapenko","Ivan");
//		map.getPersons().put("Polovuy","Stepan");
//		map.getPersons().put("Dovbush","Ivan");
//		map.getPersons().put("Porodko","Taras");
//		map.display();
//		System.out.println("-----------------------------------------");
//		map.isTwoFirstName();
//		System.out.println("-----------------------------------------");
//		map.remove("Taras");
		
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Yura", Course.SIX));
		students.add(new Student("Bogdan", Course.THREE));
		students.add(new Student("Anton", Course.ONE));
		students.add(new Student("Olga", Course.TWO));
		students.add(new Student("Yura", Course.TWO));
		students.add(new Student("Yulia", Course.TWO));
		students.add(new Student("Igor", Course.ONE));
		students.add(new Student("Bogdan", Course.FIVE));
		StudentApplication app = new StudentApplication(students);
		app.display();
		System.out.println("-----------------------------------------");
		app.printStudent(Course.TWO);
		System.out.println("-----------------------------------------");
		app.sort(Student.getNameComparator());
		app.display();
		System.out.println("-----------------------------------------");
		app.sort(Student.getCourseComparator());
		app.display();
	}

}
