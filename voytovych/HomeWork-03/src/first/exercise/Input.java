package first.exercise;

import java.io.BufferedReader;
import java.io.IOException;

public class Input {

	private float n1;
	private float n2;
	private float n3;

	public Input(BufferedReader br) throws NumberFormatException, IOException {
		System.out.println("Enter first float number:");
		this.n1 = Float.parseFloat(br.readLine());

		System.out.println("Enter first float number:");
		this.n2 = Float.parseFloat(br.readLine());

		System.out.println("Enter first float number:");
		this.n3 = Float.parseFloat(br.readLine());
	}

	public float getN1() {
		return n1;
	}

	public void setN1(float n1) {
		this.n1 = n1;
	}

	public float getN2() {
		return n2;
	}

	public void setN2(float n2) {
		this.n2 = n2;
	}

	public float getN3() {
		return n3;
	}

	public void setN3(float n3) {
		this.n3 = n3;
	}

}
