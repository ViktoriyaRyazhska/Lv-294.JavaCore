package Classwork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondTask {
	private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private int choice;
	public void doTask() {
		System.out.println("Enter the day");
		try {
			choice = Integer.parseInt(reader.readLine());
			
		}catch(IOException e) {
			System.out.println("Wrong input!");
		}
		switch(choice) {
		case 1: 
			System.out.print("понеділок" + "\n" + "Montag" + "\n" + "Lunae dies");
			break;
		case 2:
			System.out.print("вівторок" + "\n" + "Dienstag" + "\n" + "Martis dies");
			break;
		case 3:
			System.out.print("Середа" + "\n" + "Mittwoch" + "\n" + "Mercūri dies");
			break;
		case 4:
			System.out.print("Четвер" + "\n" + "Donnerstag" + "\n" + "Iovis dies");
			break;
		case 5:
			System.out.print("П'ятниця" + "\n" + "Freitag" + "\n" + "Venēris dies");
			break;
		case 6:
			System.out.print("Субота" + "\n" + "Samstag" + "\n" + "dies Saturni");
			break;
		case 7:
			System.out.print("Неділя" + "\n" + "Sonntag" + "\n" + "dies Solis");
			
		}
	}
}
