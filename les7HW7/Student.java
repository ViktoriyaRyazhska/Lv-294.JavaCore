package les7HW7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Student {
	private String name;
	private int course;
	
	
	public Student(String name, int course) {		
		this.name = name;
		this.course = course;
		
	}
	public String getName() {
		return name;
	}

	public int getCourse() {
		return course;
	}
	
	public static void printStudents(List <Student> students, Integer courses) {
		Iterator it = students.iterator();
		while(it.hasNext()) {
			Student s =(Student) it.next();
			if(s.getCourse()==courses) {
				System.out.println(s.getName());
			}
			
		}
	
	}
	public void compareByName(Student st) {
	int i=name.compareTo(st.getName());
	
	if(i==0) {
		System.out.println("This students have the same name");
	}
	else if(i>0) {
		System.out.println("The student "+name+ " is the first in the order by name");
		
	}
	else {
		System.out.println("The student "+ st.getName()+ " is the firth in the order by name");
	}
		
	}
	
	public void compareByCourse(Student st) {
		if(course==st.getCourse()) {
			System.out.println("This students on the same course");
		}
		else if(course>st.getCourse()) {
			System.out.println(this.name + " is on the highest course then "+ st.getName());
		}
		else {
			System.out.println(st.name + " is on the highest course then "+ this.name);
		}
		
	}
	@Override
	public String toString() {
		return "Name= "+this.name+" "+ ", course =" + this.course;
	}
	

}
