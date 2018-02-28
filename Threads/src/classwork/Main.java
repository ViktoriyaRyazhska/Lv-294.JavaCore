package classwork;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		System.out.println("First task:");
		Thread t1 = new Thread(new Hello());
		Thread t2 = new Thread(new Peace());
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("My name is ...");
		System.out.println("\nSecond task");
		Output o = new Output();
		try {
			o.outputTXT(10, "I study Java");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(new File("src\\classwork\\file.txt")));
			o.outputFile(reader);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
