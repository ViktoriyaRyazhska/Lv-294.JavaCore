package Les4HW4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Les4HW2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Please write 3 integer number");
		int i1 = Integer.parseInt(br.readLine());
		int i2 = Integer.parseInt(br.readLine());
		int i3 = Integer.parseInt(br.readLine());

		int max = i1;
		int min = i1;
		if ((i1 < i2) & (i2 > i3)) {
			max = i2;
		} else if ((i1 > i2) & (i1 > i3)) {
			max = i1;
		} else {
			max = i3;
		}
		System.out.println("Max number is "+max);
		if((i1<i2)&(i1<i3)){
			min=i1;
		}
		else if((i2<i1)&(i2<i3)) {
			min=i2;
		}
		else {min =i3;}
		System.out.println("Min number is " + min);
	}
}
