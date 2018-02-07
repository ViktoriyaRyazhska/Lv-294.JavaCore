package fourth.exercise;

public class ProductSearch {
	
 private Product [] list;
 
 public ProductSearch(Product [] list) {
	 this.list = list;
 }
 
	public Product findTheMostExpensiveProduct() {
		Product theMostExpensive = list[0];

		for (int i = 0; i < list.length; i++) {
			if (list[i].getPrice() > theMostExpensive.getPrice()) {
				theMostExpensive = list[i];
			}
		}

		return theMostExpensive;
	}
	
	public Product findTheBiggestQuantity() {
		Product theBiggestQuantity = list[0];
		for (int i = 0; i < list.length; i++) {
			if (list[i].getQuantity() > theBiggestQuantity.getQuantity()) {
				theBiggestQuantity = list[i];
			}
		}

		return theBiggestQuantity;
	}
}
