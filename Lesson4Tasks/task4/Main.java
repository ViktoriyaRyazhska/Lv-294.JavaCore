package task4;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product("Book", 35.6, 10);
		Product product2 = new Product("Magazine", 24.6, 8);
		Product product3 = new Product("Note", 8, 25);
		Product product4 = new Product("Map", 45.9, 5);
		
		
		
		if (product1.getPrice() > product2.getPrice() && product1.getPrice() > product3.getPrice() && product1.getPrice() > product4.getPrice()) {
			System.out.println("The most expensive product is " + product1.getName() + ". We have " + product2.getQuantity() + " units.");
		}  else if (product2.getPrice() > product1.getPrice() && product2.getPrice() > product3.getPrice() && product2.getPrice() > product4.getPrice()) {
			System.out.println("The most expensive product is " + product2.getName() + ". We have " + product2.getQuantity() + " units.");
		}  else if (product3.getPrice() > product1.getPrice() && product3.getPrice() > product2.getPrice() && product3.getPrice() > product4.getPrice()) {
			System.out.println("The most expensive product is " + product3.getName() + ". We have " + product3.getQuantity() + " units.");
		} else  {
			System.out.println("The most expensive product is " + product4.getName() + ". We have " + product4.getQuantity() + " units.");
		}
		
		if (product1.getQuantity() > product2.getQuantity() && product1.getQuantity() > product3.getQuantity() && product1.getQuantity() > product4.getQuantity()) {
			System.out.println("The biggest quantity has " + product1.getName() + ".");
		}  else if (product2.getQuantity() > product1.getQuantity() && product2.getQuantity() > product3.getQuantity() && product2.getQuantity() > product4.getQuantity()) {
			System.out.println("The biggest quantity has " + product2.getName() + ".");
		}  else if (product3.getQuantity() > product1.getQuantity() && product3.getQuantity() > product2.getQuantity() && product3.getQuantity() > product4.getQuantity()) {
			System.out.println("The biggest quantity has " + product3.getName() + ".");
		} else  {
			System.out.println("The biggest quantity has " + product4.getName() + ".");
		}
		
	
	}
}
