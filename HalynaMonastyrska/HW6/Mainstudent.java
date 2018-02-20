import java.util.LinkedList;
import java.util.List;

public class Mainstudent {
	public static void main(String[] args) {
		List<Student> studentList = new LinkedList<>();
		studentList.add(new Student("Stenly", 10));
		studentList.add(new Student("Smit", 12));
		studentList.add(new Student("Tom", 15));
		studentList.add(new Student("Louisa", 10));
		studentList.add(new Student("Dariel", 17));
		Student.printStudents(studentList, 15);
		System.out.println("Students sorted by name:");
		studentList.sort(new Student.NameComparator1());
		for (Student student : studentList) {
			System.out.println(student.toString());
		}
		System.out.println("Students sorted by course:");
		studentList.sort(new Student.CourseComparator());
		for (Student student : studentList) {
			System.out.println(student.toString());
		}
	}
}
