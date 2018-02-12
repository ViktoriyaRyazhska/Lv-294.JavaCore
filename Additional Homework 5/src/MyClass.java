import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class MyClass {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//Номер методу = номеру завдання
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		// ___________________________________________________

		// f1();

		// ___________________________________________________

		 //f2();
		 

		// ___________________________________________________

		// f3();

		// ___________________________________________________

		// f4(reader);

		// ___________________________________________________

		// f6(reader);

		// ____________________________________________________

		// f7();

		// ____________________________________________________

		// f8(180, 56);

		// ____________________________________________________

		// f9();

		// _____________________________________________________

		// f10(reader);

		// _____________________________________________________
		
		//f11(reader);
		
		//______________________________________________________
		
		//f12(reader);
		
		//______________________________________________________
	}

	public static void f1() {
		// TO DO
		// SMTH wrong
	}

	public static void f2() {
		double[] array = new double[20];
		array[0] = 0;
		array[1] = 5.0 / 8.0;
		for (int i = 2; i < array.length; i++) {
			array[i] = (array[i - 1]) / 2 + 0.75 * array[i - 2];
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void f3() {
		System.out.println("Array b:");
		double[] b = new double[30]; Random rand = new Random(); 
		for(int i=0;i <b.length;i++) { 
			b[i] = rand.nextInt(10) + 1; System.out.print(b[i] + " ");
		}
		double a = 0;
		double sum = 0;
		for (int i = 0; i < b.length; i++) {
			if (i % 2 != 0) {
				sum += Math.pow((i - b[i]), 2);
			} else {
				sum += Math.pow(((double) ((i / 2)) - b[i]), 2);
			}
		}
		System.out.println("\nThe sum is: " + sum);
	}

	public static void f4(BufferedReader reader) {
		double[] array;
		double[] result;
		System.out.println("Enter the amount:");
		try {
			int n = Integer.parseInt(reader.readLine());
			array = new double[n];
			result = new double[n];
			System.out.println("Enter data in the array:");
			for (int i = 0; i < array.length; i++) {
				array[i] = Double.parseDouble(reader.readLine());
				double sum = 0;
				for (int j = 0; j <= i; j++) {
					sum += array[j];
				}
				result[i] = sum;
			}
			for (int i = 0; i < result.length; i++) {
				System.out.print(result[i] + " ");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void f5(BufferedReader reader) throws NumberFormatException, IOException {
		System.out.println("Enter the length of each side:");
		double[] sides = new double[3];
		for (int i = 0; i < sides.length; i++) {
			double side = Double.parseDouble(reader.readLine());
			if (side > 0) {
				sides[i] = side;
			} else {
				System.out.println("Enter a positive length of the side");
				i--;
			}
		}
		if (sides[0] + sides[1] > sides[2] && sides[1] + sides[2] > sides[0] && sides[0] + sides[2] > sides[1]) {
			int frec = 0;
			for (double temp : sides) {
				int narr = frequensy(sides, temp);
				if (frec < narr) {
					frec = narr;
				}
			}

			if (frec == 2) {
				System.out.println("Isosceles triangle");
			} else if (frec == 3) {
				System.out.println("Equilateral triangle");
			} else {
				System.out.println("Versatile triangle");
			}
		} else {
			System.out.println("0");
		}
	}

	public static int frequensy(double[] arr, double temp2) {
		int n = 0;
		for (double temp : arr) {
			if (temp2 == temp) {
				n++;
			}
		}
		return n;
	}

	public static void f6(BufferedReader reader) throws NumberFormatException, IOException {
		double[] array = new double[4];
		for (int i = 0; i < array.length; i++) {
			array[i] = Double.parseDouble(reader.readLine());
		}

		int index = 0;
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] != array[i + 1]) {
				index = i;
			}
		}
		if (index == array.length - 2) {
			if (array[array.length - 1] != array[array.length - 3]) {
				index = array.length - 1;
			}
		}
		System.out.println(index);
	}

	public static void f7() {
		// TO DO
		// SMTH WRONG
	}

	public static void f8(int a, int b) {
		while (a != 0 && b != 0) {
			if (a > b) {
				a = a % b;
			} else {
				b = b % a;
			}
		}
		a = a + b;
		System.out.println(a);
	}

	public static void f9() {
		double y = 40;
		for (int i = 39; i >= 0; --i) {
			y = i + Math.cos(y);
		}

		System.out.println("y = " + y);

	}

	public static void f10(BufferedReader reader) throws NumberFormatException, IOException {
		System.out.println("Enter n:");
		double[] array = new double[Integer.parseInt(reader.readLine())];
		for (int i = 0; i < array.length; i++) {
			array[i] = Double.parseDouble(reader.readLine());
		}
		System.out.println("Enter the radius:");
		double r = Double.parseDouble(reader.readLine());

		int count = 0;

		// coordinates of the center of the circle are (0;0) then:

		for (int i = 0; i < array.length; i++) {
			if (Math.pow(array[i], 2) + Math.pow(array[array.length - 1 - i], 2) <= Math.pow(r, 2)) {
				count++;
			}
		}
		System.out.println("Count: " + count);
	}

	public static void f11(BufferedReader reader) throws NumberFormatException, IOException {
		System.out.println("Enter the amount of people: ");
		double[] t = new double[Integer.parseInt(reader.readLine())];
		System.out.println("Enter time for each person: ");
		for (int i = 0; i < t.length; i++) {
			t[i] = Double.parseDouble(reader.readLine());
		}

		double[] mass = new double[t.length];
		/*
		 * for(int i=0;i<t.length;i++) { mass[i] = 0; }
		 */
		for (int i = t.length - 1; i >= 0; i--) {
			double sum = 0;
			for (int j = t.length - 1; j >= i; j--) {
				sum += t[j];
			}
			mass[i] = sum;
		}

		System.out.println("Time in the queue: ");
		for (int i = 0; i < t.length; i++) {
			System.out.print(mass[i] + " ");
		}
		System.out.println("\nPerson with the least time of service;");
		System.out.println(min(t));
	}

	public static double min(double[] array) {
		double min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

	public static double max(double[] array) {
		double max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	public static void f12(BufferedReader reader) throws NumberFormatException, IOException {
		System.out.println("Enter the amount of judges.");
		double[] judges = new double[Integer.parseInt(reader.readLine())];
		System.out.println("Input marks for the member");
		for (int i = 0; i < judges.length; i++) {
			judges[i] = Double.parseDouble(reader.readLine());
		}

		double maxMark = max(judges);
		double minMark = min(judges);
		double sum = 0;
		double count = 0;
		for (int i = 0; i < judges.length; i++) {
			if (judges[i] != maxMark && judges[i] != minMark) {
				sum +=judges[i];
				count++;
			}
		}
		System.out.println("Final marks  |" + maxMark + "|" + minMark + "|" + sum/count + "|");
	}
}
