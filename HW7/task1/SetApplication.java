package hw07.task1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetApplication<T> {
	private Set<T> set1;
	private Set<T> set2;
	private Set<T> resultSet;

	public SetApplication(Set<T> set1, Set<T> set2) {
		this.set1 = set1;
		this.set2 = set2;
		resultSet = new HashSet<T>();
	}

	public Set<T> getSet1() {
		return set1;
	}

	public void setSet1(Set<T> set1) {
		this.set1 = set1;
	}

	public Set<T> getSet2() {
		return set2;
	}

	public void setSet2(Set<T> set2) {
		this.set2 = set2;
	}

	public Set<T> getResultSet() {
		return resultSet;
	}

	public void setResultSet(Set<T> resultSet) {
		this.resultSet = resultSet;
	}

	public void printSets() {
		System.out.print("set 1 : ");
		for (T t : set1) {
			System.out.print("[" + t + "] ");
		}
		System.out.println();
		System.out.print("set 2 : ");
		for (T t : set2) {
			System.out.print("[" + t + "] ");
		}
		System.out.println();
		System.out.println("----------------------------------------");
	}

	public void print() {
		for (T t : resultSet) {
			System.out.print("[" + t + "] ");
		}
		System.out.println();
	}

	public Set<T> union() {
		resultSet.clear();
		resultSet.addAll(set1);
		resultSet.addAll(set2);
		System.out.print("United set : ");
		print();
		return resultSet;
	}

	public Set<T> intersect() {
		resultSet.clear();
		Iterator<T> iterator = set1.iterator();
		T temp;
		while (iterator.hasNext()) {
			temp = iterator.next();
			if (set2.contains(temp)) {
				resultSet.add(temp);
			}
		}
		System.out.print("Intersected values : ");
		print();
		return resultSet;
	}
}
