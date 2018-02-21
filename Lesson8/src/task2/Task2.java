package task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {

	public static void main(String[] args) throws IOException{
		
		System.out.println("Enter surname, name and patronymic");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String snp = br.readLine();
		String[] s = snp.split(" ");
		
		System.out.println(s[0] + " " + s[1].charAt(0) +". " + s[2].charAt(0) + ". ");
		System.out.println(s[1]);
		System.out.println(s[1] + " " + s[2] + " " + s[0]);
	}
}
