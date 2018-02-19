package Homework;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {
	private String name;
	private Integer course;
	private static CompareByName SortbyName = new CompareByName();
	private static CompareByCourse SortbyCourse = new CompareByCourse();
	public Student() {
	}

	public Student(String name, Integer course) {
		this.name = name;
		this.course = course;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCourse() {
		return course;
	}

	public void setCourse(Integer course) {
		this.course = course;
	}
	
	public static CompareByName getSortbyName() {
		return SortbyName;
	}

	public static CompareByCourse getSortbyCourse() {
		return SortbyCourse;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((course == null) ? 0 : course.hashCode());
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
		if (course == null) {
			if (other.course != null)
				return false;
		} else if (!course.equals(other.course))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	public String toString() {
		return "[Student name : " + name + " .Course: " +  course + "]";
	}
	
	public static void printStudents(List<Student> list, Integer course) {
		/*Iterator<Student> it = list.iterator();
		while(it.hasNext()) {
			Student st = (Student)it.next();
			if(st.getCourse().equals(course)) {
				System.out.println(st);
			}
		}*/
		
		//А ці лямбда вирази мені подобаються :)
		list.forEach(student -> {
			if(student.getCourse().equals(course)) {
				System.out.println(student);
			}
		});
	}
	
	static class CompareByName implements Comparator{
		@Override
		public int compare(Object obj1 , Object obj2) {
			return ((Student)obj1).getName().compareTo(((Student)obj2).getName());
		}
	}
	
	static class CompareByCourse implements Comparator{
		@Override
		public int compare(Object obj1 , Object obj2) {
			return ((Student)obj1).getCourse().compareTo(((Student)obj2).getCourse());
		}
	}
	
	
	
}
