package cw09;

import cw09.task2.Plant;
import cw09.task2.exception.ColorException;
import cw09.task2.exception.TypeException;

//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//import cw09.task1.MyException;
//import cw09.task1.Rectangle;

public class Main {

	public static void main(String[] args) {
//		Rectangle rectangle = new Rectangle();
//		Scanner sc = new Scanner(System.in);
//		int a = 0;
//		int b = 0;
//		try {
//			System.out.println("Enter a :");
//			a = sc.nextInt();
//			System.out.println("Enter b :");
//			b = sc.nextInt();
//		} catch (InputMismatchException e) {
//			System.err.println(" Only numbers");
//
//		}finally {
//			sc.close();
//		}
//		try {
//			System.out.println(rectangle.squareRectangle(a, b));
//		} catch (MyException e) {
//
//			e.printStackTrace();
//		}
//		
		try {
			Plant p1 = new Plant(1, "Rose", "Blue");
			Plant p2 = new Plant(1, "Violet", "Blue");
			Plant p3 = new Plant(1, "ROSE", "REd");
			Plant p4 = new Plant(1, "LiLY", "YellOW");
			Plant p5 = new Plant(1, "carnation", "PINK");
		} catch (ColorException | TypeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
