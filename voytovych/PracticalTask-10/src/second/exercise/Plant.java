package second.exercise;

public class Plant {
	private int size;
	private Color color;
	private Type type;

	public Plant() {

	}

	public Plant(String type, String color, int size) throws ColorException, TypeException {
		Color c = colorStrToEnum(color);
		Type t = typeStrToEnum(type);
		this.size = size;
		this.color = c;
		this.type = t;
	}

	private Color colorStrToEnum(String color) throws ColorException {
		switch (color.toLowerCase()) {
		case "blue": return Color.Blue;
		case "red": return Color.Red;
		case "white": return Color.White;
		default: throw new ColorException("Input only color blue, red or white");
		}
	}
	
	private Type typeStrToEnum(String type) throws TypeException {
		switch (type.toLowerCase()) {
		case "anemone": return Type.Anemone;
		case "iris": return Type.Iris;
		case "aster": return Type.Aster;
		default: throw new TypeException("Input only type type anemone, iris or aster");
		}
	}

	@Override
	public String toString() {
		return "Plants [size=" + size + ", color=" + color + ", type=" + type + "]";
	}

}
