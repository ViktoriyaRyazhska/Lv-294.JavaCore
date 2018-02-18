package hw07.task3;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentApplication {
	private List<Student> students = new ArrayList<Student>();

	public StudentApplication() {

	}

	public StudentApplication(List<Student> students) {
		this.students = students;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public void printStudent(Course course) {
		for (Student student : students) {
			if (student.getCourse().equals(course)) {
				System.out.println(student);
			}
		}
	}

	public void sort(Comparator<Student> comparator) {
		// Collections.sort(students, comparator);
		students.sort(comparator);
	}

	public void display() {
		for (Student student : students) {
			System.out.println(student);
		}
	}
}
