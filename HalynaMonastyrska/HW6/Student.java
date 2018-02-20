import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {
	private String name;
	private int course;

	public Student(String name, int course) {
		this.setName(name);
		this.setCourse(course);
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void printStudents(List<Student> students, Integer course) {
		Iterator<Student> iterator = students.iterator();
		while (iterator.hasNext()) {
			Student student = (Student) iterator.next();
			if (student.getCourse() == course) {
				System.out.println("Student " + student.getName() + " is at " + student.getCourse() + " course.");
			}
		}
	}

	private String getName() {
		return name;
	}

	public class NameComparator implements Comparator<Student> {
		@Override
		public int compare(Student student1, Student student2) {
			return student1.name.compareTo(student2.name);
		}
	}

	public static class NameComparator1 implements Comparator<Student> {
		@Override
		public int compare(Student st1, Student st2) {
			return st1.getName().compareTo(st2.getName());
		}
	}

	public static class CourseComparator implements Comparator<Student> {
		@Override
		public int compare(Student st1, Student st2) {
			return st1.getCourse() - st2.getCourse();
		}
	}

	@Override
	public String toString() {
		return "Student " + name + " at " + course + " course.";
	}
}
