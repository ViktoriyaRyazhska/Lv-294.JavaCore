package Classwork;

public class Main {

	public static void main(String[] args) {
		
		/*FirstTask task1 = new FirstTask();
		task1.doTask();*/
		
		/*SecondTask task2 = new SecondTask();
		task2.doTask();*/
		
		//Third Task doesn't work.I will try to fix it or ask you what the problem is
		//ThirdTask task3 = new ThirdTask();
		//task3.doTask();
		FourthTask task4 = new FourthTask();
		task4.doTask(new Product("Table",50d,10),new Product("Wardrobe", 100d,5),new Product("Chair",25d,25),new Product("Mirror", 8d,7));
		
	}

}
