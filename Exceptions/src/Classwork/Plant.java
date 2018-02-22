package Classwork;

public class Plant {
	Color color;
	Type type;
	double size;

	public Plant(String color, String type, double size) throws ColorException, TypeException {
		this.color = Color.getColor(color);
		this.type = Type.getType(type);
		this.size = size;
	}

	public String getColor() {
		return color.name();
	}

	public void setColor(String color) throws ColorException {
		this.color = Color.getColor(color);
	}

	public String getType() {
		return type.name();
	}

	public void setType(String type) throws TypeException {
		this.type = Type.getType(type);
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		long temp;
		temp = Double.doubleToLongBits(size);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Plant other = (Plant) obj;
		if (color != other.color)
			return false;
		if (Double.doubleToLongBits(size) != Double.doubleToLongBits(other.size))
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "[Type:" + type.name() + "|Color:" + color.name() + "|Size:" + size + "]";
	}

}
