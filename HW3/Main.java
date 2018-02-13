package hw03;

public class Main {

	public static void main(String[] args) {
		ConsoleApp app1 = new ConsoleApp(new Person("Yura",1985));
		app1.start();
		ConsoleApp app2 = new ConsoleApp(new Person());
		app2.start();
		ConsoleApp app3 = new ConsoleApp(new Person());
		app3.start();
		ConsoleApp app4 = new ConsoleApp(new Person());
		app4.start();
		ConsoleApp app5 = new ConsoleApp(new Person());
		app5.start();

	}
}
