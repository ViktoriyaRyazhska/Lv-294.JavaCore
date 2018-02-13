package Les5HW5;

import java.io.BufferedReader;
import java.io.IOException;

public class Car {
	private String type;
	private int year;
	private int engineCapacity;

	public Car() {

	}

	public Car(String type, int year, int engineCapacity) {

		this.type = type;
		this.year = year;
		this.engineCapacity = engineCapacity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	
	public void writeYear(BufferedReader b) throws NumberFormatException, IOException {
		System.out.println("Please, write year of the "+ this.type);
		setYear(Integer.parseInt(b.readLine()));
	}
	

}
