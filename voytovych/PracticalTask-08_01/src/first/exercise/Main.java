package first.exercise;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		/*Declare collection myCollection of 10 integers and fill it (from the console or random). 
		 * Find and save in list newCollection all positions of element more
		   than 5 in the collection. Print newCollection 
		 * Remove from collection myCollection elements, which are greater then 20. Print result 
		 * Insert elements 1, -3, -4 in positions 2, 8, 5. Print result in the format:
		   “position – xxx, value of element – xxx” 
		 * Sort and print collection*/
		//TODO:Check method insert
		List<Integer> list = FillUpList.list();
		System.out.println("Collection before changing");
		PrintCollection.print(list);
		ChangeCollection ch = new ChangeCollection(list);
		System.out.println("Element larger than 5");
		PrintCollection.print(ch.find());
		System.out.println("Remove from collection elements, which are greater then 20");
		PrintCollection.print(ch.remove());
		System.out.println("Insert elements 1, -3, -4 in positions 2, 8, 5");
		ch.insert(2, 1);
		ch.insert(5, -4);
		ch.insert(8, -3);
		PrintCollection.print(ch.getMyCollection());
		System.out.println("Collection after sorting");
		PrintCollection.print(ch.sort());

	}

}
