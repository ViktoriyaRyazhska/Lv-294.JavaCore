package third.exercise;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		/*
		 * Write class Student that provides information about the name of the student
		 * and his course. Class Student should consists of a) properties for access to
		 * these fields constructor with parameters method printStudents (List students,
		 * Integer course), which receives a list of students and the course number and
		 * prints to the console the names of the students from the list, which are
		 * taught in this course (use an iterator) b) methods to compare students by
		 * name and by course e) In the main() method declare List students and add to
		 * the list five different students display the list of students ordered by name
		 * display the list of students ordered by course.
		 */

		Student st1 = new Student("Emily", 101);
		Student st2 = new Student("Ethan", 102);
		Student st3 = new Student("William", 103);
		Student st4 = new Student("Elizabeth", 104);
		Student st5 = new Student("Ava", 105);

		List<Student> list = new ArrayList<>(Arrays.asList(new Student[] { st1, st2, st3, st4, st5 }));
		Student.printStudents(list, Input.inputCourse());

		list.sort(new NameComparator());

		System.out.println("\nThe list of students ordered by name");
		for (Student st : list) {
			System.out.println("Student's name: " + "\"" + st.getName() + "\" " + " Course: " + " " + st.getCourse());
		}

		list.sort(new CourseComparator());

		System.out.println("\nThe list of students ordered by course");
		for (Student st : list) {
			System.out.println("Student's name: " + "\"" + st.getName() + "\"" + " Course: " + " " + st.getCourse());
		}

	}

}
