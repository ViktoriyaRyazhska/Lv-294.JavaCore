package cw07.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MyCollection {
	private List<Integer> list = new ArrayList<Integer>();
	private Random random = new Random();

	public MyCollection() {
	}

	public MyCollection(List<Integer> list) {
		this.list = list;
	}

	public List<Integer> getList() {
		return list;
	}

	public void setList(List<Integer> list) {
		this.list = list;
	}

	public void fillCollection(int num, int max) {
		for (int i = 0; i < num; i++) {
			list.add(random.nextInt(max));
		}
	}

	public void remove(int greaterThen) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > greaterThen) {
				list.remove(i);
				i--;
			}
		}
	}

	public void insert(int[] elements, int[] positions) {
		if (elements.length == positions.length) {
			for (int i = 0; i < positions.length; i++) {
				list.set(positions[i], elements[i]);
			}
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println("position - [" + i + "]" + " value - ["
					+ list.get(i) + "]");
		}
	}

	public void print() {
		for (Integer integer : list) {
			System.out.print(integer + " ; ");
		}
		System.out.println();
	}

	public void sort() {
		Collections.sort(list);
	}
}
