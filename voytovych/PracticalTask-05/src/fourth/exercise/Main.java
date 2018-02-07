package fourth.exercise;

public class Main {

	public static void main(String[] args) {

		/*
		 * Create class Product with fields name, price and quantity. Create four
		 * instances of type Product. Display the name and quantity of the most
		 * expensive item. Display the name of the items, which has the biggest
		 * quantity.
		 */

		Product p1 = new Product("Laptop", 1250, 45);
		Product p2 = new Product("Washing machine", 300, 12);
		Product p3 = new Product("Vacuum cleaner", 1452, 20);
		Product p4 = new Product("Dishwashers", 100, 78);

		Product[] list = new Product[4];
		list[0] = p1;
		list[1] = p2;
		list[2] = p3;
		list[3] = p4;
		
		ProductSearch pr = new ProductSearch(list);
		ShowProducts show = new ShowProducts(pr);
		show.output();
		


	}

}
