package cw04.task4;

public class ProductApp {
	private Product[] products;

	public ProductApp(Product... product) {
		this.products = new Product[product.length];
		for (int i = 0; i < products.length; i++) {
			this.products[i] = product[i];
		}
	}

	public String mostExpensive() {
		Product tempProduct = new Product();
		for (int i = 0; i < products.length; i++) {
			if (tempProduct.getPrice() < products[i].getPrice()) {
				tempProduct = products[i];
			}
		}
		return "Product[ " + tempProduct.getName() + " ; "
				+ tempProduct.getQuantity() + " ]";
	}
	public String biggestQuantity(){
		Product tempProduct = new Product();
		for (int i = 0; i < products.length; i++) {
			if (tempProduct.getQuantity() < products[i].getQuantity()) {
				tempProduct = products[i];
			}
		}
		return "Product[ " + tempProduct.getName() + " ]";
	}
}
