package HW6;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
			ArrayList<Student> st = new ArrayList<Student>();
			
			st.add(new Student("Vasya", 3));
			st.add(new Student("Anna", 2));
			st.add(new Student("Alina", 4));
			st.add(new Student("Mykola", 3));
			st.add(new Student("Vira", 2));
			st.add(new Student("Andriy", 5));

			
			java.util.Iterator<Student> st6 = st.iterator();
			while (st6.hasNext()) {
							System.out.println(st6.next());
				
			}
			
			System.out.println();
			
			java.util.Iterator<Student> st1 = st.iterator();
			while (st1.hasNext()) {
				Student st2 = (Student) st1.next();
				int cor = st2.getCorse();
				if (cor == 3){
				System.out.println(st1.next());
				}
			}
			System.out.println();
			
			st.sort(new NameComparator());
	        for (Student student : st) {
	            System.out.println(student);
	        }
	        
	        System.out.println();
			
	       
	        
		 st.sort(new CorseComparator());
	        for (Student student : st) {
	            System.out.println(student);
	        }
	        
	        System.out.println(Student.printStudents(st, 2));
	}
}
				
				
				
		   

		
		


