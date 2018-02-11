package hw05.task5;

public class Car {
	private CarsBodys type;
	private int yearOfProduction;
	private double engineCapacity;

	public Car() {
	}

	
	public Car(CarsBodys type, int yearOfProduction, double engineCapacity) {
		this.type = type;
		this.yearOfProduction = yearOfProduction;
		this.engineCapacity = engineCapacity;
	}


	public CarsBodys getType() {
		return type;
	}

	public void setType(CarsBodys type) {
		this.type = type;
	}

	public int getYearOfProduction() {
		return yearOfProduction;
	}

	public void setYearOfProduction(int yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}

	public double getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(double engineCapacity) {
		this.engineCapacity = engineCapacity;
	}


	@Override
	public String toString() {
		return "Car [Type : " + type + ", Year Of Production : " + yearOfProduction
				+ ", Engine Capacity : " + engineCapacity + "]";
	}


	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(engineCapacity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + yearOfProduction;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (Double.doubleToLongBits(engineCapacity) != Double
				.doubleToLongBits(other.engineCapacity))
			return false;
		if (type != other.type)
			return false;
		if (yearOfProduction != other.yearOfProduction)
			return false;
		return true;
	}

	
}
