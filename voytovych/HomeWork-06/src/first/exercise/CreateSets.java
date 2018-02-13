package first.exercise;

import java.util.HashSet;
import java.util.Set;

public class CreateSets<T> {
	
	
	public Set<T> union(Set<T> t1, Set<T> t2) {
		Set<T> t3 = new HashSet<T>();
		t3.addAll(t1);
		t3.addAll(t2);
		return t3;
	}
	
	public Set<T> intersection(Set<T> t1, Set<T> t2) {
		Set<T> t3 = new HashSet<T>();
		t3.addAll(t1);
		t3.retainAll(t2);
		return t3;
	}
}
