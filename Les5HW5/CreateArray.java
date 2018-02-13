package Les5HW5;

import java.io.BufferedReader;
import java.io.IOException;

public class CreateArray {
	int [] ar;
	int product = 1;
	int [] ar1;

	public void writeNumber(BufferedReader b) throws NumberFormatException, IOException {
		boolean k = true;
		int i = 0;
		System.out.println("Write amount of numbers what you want to enter");
		int p=Integer.parseInt(b.readLine());
		ar = new int[p];

		while (k) {
			System.out.println("Write number " + (i + 1));
			int q = Integer.parseInt(b.readLine());
			if (q >= 0) {
				ar[i] = q;
				i++;
								
			} else {
				k = false;
			}

		}
		ar1=new int[i];
		for(int m=0; m<i; m++) {
			ar1[m]=ar[m];
		}
	}
	public void product() {
	for(int n=0; n<ar1.length; n++) {
		if(ar1[n]%2==0) {
			product=product*ar1[n];
		}
	}
		
	}

	public void print() {
		for (int i = 0; i < ar1.length; i++) {
			System.out.print(ar1[i]+" ");
		}
		System.out.println("The product of even numbers is " + product);
	}

}
