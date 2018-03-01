package cw10;



import cw10.task3.FileApplication;

public class Main {
	public static void main(String[] args) {
		FileApplication app = new FileApplication("mytext.txt");
		app.countAllSymbols();
		System.out.println("----------------------------------");
		app.maxMin();
		System.out.println("----------------------------------");
		app.consist("que");
	}
}
