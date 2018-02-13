package first.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChangeCollection {
	private List<Integer> newCollection;
	private List<Integer> myCollection;

	public ChangeCollection(List<Integer> myCollection) {
		this.myCollection = myCollection;
	}

	public List<Integer> find() {
		newCollection = new ArrayList<>();
		for (Integer number : myCollection) {
			if (number.intValue() > 5) {
				newCollection.add(number);
			}
		}
		return newCollection;
	}

	public List<Integer> remove() {
		List<Integer> rm = new ArrayList<>();
		for (Integer number : myCollection) {
			if (number.intValue() > 20) {
				rm.add(number);
			}
		}

		for (Integer r : rm) {
			myCollection.remove(r);
		}

		return myCollection;

	}

	public void insert(int index, int element) {
		myCollection.add(index, element);

	}

	public List<Integer> sort() {
		Collections.sort(myCollection);

		return myCollection;
	}

	public List<Integer> getMyCollection() {
		return myCollection;
	}

}
