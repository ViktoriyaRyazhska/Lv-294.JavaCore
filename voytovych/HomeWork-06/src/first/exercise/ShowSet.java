package first.exercise;

import java.util.Iterator;
import java.util.Set;

public class ShowSet<T> {

	public void show(Set<T> set) {
		Iterator<T> itr = set.iterator();
		while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
	}
}
