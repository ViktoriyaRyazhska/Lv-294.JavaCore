package les7HW7;
import java.util.HashSet;
import java.util.Set;

public class MainSet {

	public static void main(String[] args) {
		
		Set<Integer> s1 = new HashSet();
		s1.add(1);
		s1.add(8);
		s1.add(16);
		s1.add(5);

		Set<Integer> s2 = new HashSet();
		s2.add(9);
		s2.add(4);
		s2.add(7);
		s2.add(8);
		s2.add(5);
		
		System.out.println(union(s1, s2));
		System.out.println(intersect(s1, s2));
		
		
		Set <String> s3 = new HashSet();
		s3.add("zero");
		s3.add("one");
		s3.add("two");
		s3.add("tree");
		s3.add("five");
		s3.add("six");
		
		
		Set <String> s4 = new HashSet();
		s4.add("ten");
		s4.add("nine");
		s4.add("eight");
		s4.add("seven");
		s4.add("six");
		s4.add("five");
		
		
		System.out.println(union(s3, s4));
		System.out.println(intersect(s3, s4));
	}
	public static <T> Set<T> union(Set<T> set1, Set<T> set2 ) {

		Set<T> set = new HashSet<T>();
		set.addAll(set1);
		set.addAll(set2);
		return set;
}
	public static <T> Set<T> intersect(Set<T> set1, Set<T> set2 ){
		Set<T> s = new HashSet<T>();
		s.addAll(set1);
		s.retainAll(set2);
		return s;
	}
	
}
