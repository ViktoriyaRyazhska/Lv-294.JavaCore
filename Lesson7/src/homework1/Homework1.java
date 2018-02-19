package homework1;

import java.util.HashSet;
import java.util.Set;

public class Homework1 {

	public static void main(String[] args) {
		
		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(5);
		set1.add(6);
		set1.add(8);
		
		Set<Integer> set2 = new HashSet<Integer>();
		set2.add(2);
		set2.add(4);
		set2.add(6);
		set2.add(7);
		set2.add(10);
		set2.add(9);
		
//		union(set1, set2);
//		System.out.println(set1);
		
		intersect(set1, set2);
		System.out.println(set1);
	
	}
	public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
		set1.addAll(set2);
		return set1;
	}
	
	
	public static Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2) {
		set1.retainAll(set2);
		return set1;
	}
}
