package lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {

	public static void main(String[] args) throws IOException {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Write your surname, name and patronymic ");
		String s = b.readLine();
		String [] arr = s.split(" ");
		
		System.out.println(arr[0]+ " "+arr[1].charAt(0)+"."+ arr[2].charAt(0)+".");
		System.out.println("Your name is "+ arr[1]);
		System.out.println(arr[1]+" "+arr[2]+" "+arr[0]);
		
	}

}
