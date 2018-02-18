package hw07.task3;

import java.util.Comparator;

public class Student {
	private String name;
	private Course course;
	private int courseValue;

	public Student(String name, Course course) {
		this.name = name;
		this.course = course;
		this.courseValue = course.getCorse();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public static NameComparator getNameComparator() {
		return new NameComparator();
	}

	public static CourseComparator getCourseComparator() {
		return new CourseComparator();
	}

	private static class NameComparator implements Comparator<Student> {

		@Override
		public int compare(Student o1, Student o2) {
			if(o1.getName().equals(o2.getName())){
				return o1.getCourse().getCorse() - o2.getCourse().getCorse();
			}
			return o1.getName().compareTo(o2.getName());
		}

	}

	private static class CourseComparator implements Comparator<Student> {

		@Override
		public int compare(Student o1, Student o2) {
			if(o1.getCourse().equals(o2.getCourse())){
				return o1.getName().compareTo(o2.getName());
			}
			return o1.getCourse().getCorse() - o2.getCourse().getCorse();
		}

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + courseValue;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (courseValue != other.courseValue)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [ " + name + ", course : " + course + "]";
	}

}
