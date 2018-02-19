package homework3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import homework3.CourseComparator;
import homework3.NameComparator;
import homework3.Number;
import homework3.Student;

public class Main {

	
public static void main(String[] args) throws IOException {
		
		Student student1 = new Student("Dragos", 3);
		Student studetn2 = new Student("Petru", 2);
		Student student3 = new Student("Mircea", 2);
		Student student4 = new Student("Anika", 4);
		Student student5 = new Student("Marcu", 3);
		
		List<Student> students = new ArrayList<Student>();
		students.add(student1);
		students.add(studetn2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
		
		Student.printStudents(students, Number.number());
		
		students.sort(new NameComparator());
		for(Student st : students) {
			System.out.println(st);
		}
		
		System.out.println("");

		students.sort(new CourseComparator());
		for(Student st : students) {
			System.out.println(st);
		}
	}
}