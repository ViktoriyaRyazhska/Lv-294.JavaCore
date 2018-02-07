package fourth.exercise;

public class ShowProducts {

	private ProductSearch pr;

	public ShowProducts() {

	}

	public ShowProducts(ProductSearch pr) {
		this.pr = pr;
	}

	public void output() {
		Product theMostExpensive = pr.findTheMostExpensiveProduct();
		Product theBiggestQuantity = pr.findTheBiggestQuantity();

		System.out.println("The most expensive item: " + theMostExpensive.getName() + "|| with price: "
				+ theMostExpensive.getPrice() + " || and quantity: " + theMostExpensive.getQuantity());

		System.out.println("The item with the biggest quantity" + " [ " + theBiggestQuantity.getQuantity() + " ]" + ": "
				+ theBiggestQuantity.getName() + "|| with price: " + theBiggestQuantity.getPrice());
	}
}
