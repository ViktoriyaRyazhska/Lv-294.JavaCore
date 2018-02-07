package Classwork;

public class FourthTask {
	
	public void doTask(Product ...products) {
		Product buffer = null;
		double price = products[0].getPrice();
		for(Product p: products) {
			if(p.getPrice()>price) {
				price = p.getPrice();
				buffer = p;
			}
		}
		System.out.println("Most expensive " + buffer.getName() + " with the price:" + buffer.getPrice());
	}
}
