package first.exercise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		/* Write parameterized methods union(Set set1, Set set2) and intersect(Set set1, Set set2), 
		   realizing the operations of union and intersection of two sets. Test the operation of 
		   these techniques on two pre-filled sets.*/
		
//		 Set<Integer> t1 = new HashSet<>(Arrays.asList(new Integer[]{0,2,4,5,6,8,10}));
//		 Set<Integer> t2 = new HashSet<>(Arrays.asList(new Integer[]{4,5,6,7,8,9,10}));
		
		 Set<String> t1 = new HashSet<>(Arrays.asList(new String[]{"Aria","Chloe","Carter","Lillian","Anthony","Anthony","Chloe"}));
		 Set<String> t2 = new HashSet<>(Arrays.asList(new String[]{"Audrey","Chloe","Anthony","Luke","Gabriel","Aria","Jack"}));
		 
//		 ShowSet<Integer> sw = new ShowSet<Integer>();
		 ShowSet<String> sw = new ShowSet<String>();
		
		 System.out.println("First set: ");
		 sw.show(t1);
		 System.out.println("\nSecond set: ");
		 sw.show(t2);
//		 CreateSets<Integer> cr = new CreateSets<>();
//		 Set<Integer> newSet1 = cr.union(t1, t2);
		 CreateSets<String> cr = new CreateSets<>();
		 Set<String> newSet1 = cr.union(t1, t2);
		 System.out.println("\nSet after union");
		 sw.show(newSet1);
//		 Set<Integer> newSet2 = cr.intersection(t1, t2);
		 Set<String> newSet2 = cr.intersection(t1, t2);
		 System.out.println("\nSet after intersection");
		 sw.show(newSet2);
	}

}
