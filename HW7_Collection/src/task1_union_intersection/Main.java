package task1_union_intersection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
Write parameterized methods union(Set set1, Set set2) 
and intersect(Set set1, Set set2), realizing the operations
of union and intersection of two sets. 
Test the operation of these techniques on two pre-filled sets. 
set1.addAll(set2);
set1. retainAll(set2)
*/
public class Main {

	public static void main(String[] args) {
	
		List listArr1 = new ArrayList(); 
		List listArr2 = new ArrayList(); 
		List listLink1 = new LinkedList();
		List listLink2 = new LinkedList();
		
		listArr1.add("1");
		listArr1.add("2");
		listArr1.add("3");
		listArr1.add("4");
		listArr1.add("5");
		
		listArr2.add("10");
		listArr2.add("20");
		listArr2.add("30");
		listArr2.add("40");
		listArr2.add("50");
		
		listArr1.addAll(listArr2);
		System.out.println(listArr1);
		
		listArr1.retainAll(listArr2);
		System.out.println(listArr1);
	
	}

}
