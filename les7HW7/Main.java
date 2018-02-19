package les7HW7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();

		students.add(new Student("Sudorov", 2));
		students.add(new Student("Smirnov", 5));
		students.add(new Student("Tuhonova", 1));
		students.add(new Student("Kovalova", 5));
		students.add(new Student("Mironova",3));
		
		Student.printStudents(students, 5);
		orderedByName(students);
		orderedByCourse(students);
	}
	public static void orderedByName(List<Student> stu) {
		Comparator cn = new Comparator<Student>() {

			@Override
			public int compare(Student arg0, Student arg1) {				
				return arg0.getName().compareTo(arg1.getName());
			}
		
		};
		stu.sort(cn);
		System.out.println(stu.toString());
		
	}
	public static void orderedByCourse(List<Student> stu) {
		Comparator cc = new Comparator<Student>() {

			@Override
			public int compare(Student arg0, Student arg1) {				
				return ((Integer)arg0.getCourse()).compareTo((Integer)arg1.getCourse());
			}
		
		};
		stu.sort(cc);
		System.out.println(stu.toString());
		
	}
	

}
