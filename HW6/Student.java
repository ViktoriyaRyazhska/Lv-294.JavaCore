package HW6;

import java.util.ArrayList;
import java.util.List;

public class Student {
	String name;
	int corse;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCorse() {
		return corse;
	}

	public void setCorse(int corse) {
		this.corse = corse;
	}

	public Student(String name, int corse) {
		super();
		this.name = name;
		this.corse = corse;
	}

	@Override
	public String toString() {
		return "Student corse=" + corse + ", name=" + name + "]";

	}

	static List<Student> printStudents(ArrayList<Student> list, int c) {

		List<Student> newList = new ArrayList();
		for (Student student : list) {
			if (c == student.getCorse()) {
				newList.add(student);
			}
		}
		return newList;
	}
}
