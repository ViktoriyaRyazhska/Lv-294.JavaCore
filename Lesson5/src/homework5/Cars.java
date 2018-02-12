package homework5;


public class Cars {
	
	private String type;
	private int yearOfProduction;
	private double engine;
	
	public Cars(String type, int yearOfProduction, double engine) {
		this.type = type;
		this.yearOfProduction = yearOfProduction;
		this.engine = engine;
	}
	
	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public int getYearOfProduction() {
		return this.yearOfProduction;
	}
	public void setYearOfProduction(int yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}
	
	public double getEngine() {
		return this.engine;
	}
	public void setEngine(double engine) {
		this.engine = engine;
	}
	
	
	@Override
	public String toString() {
		return "Car [" + type + ", year of production = " + yearOfProduction + ", engine capacity = " + engine + "]";
	}

}
