package Classwork;

public class Plant {
	Color color;
	Type type;
	double size;

	public Plant(String color, String type, double size) throws ColorException, TypeException {
		this.color = parseColor(color);
		this.type = parseType(type);
		this.size = size;
	}

	private static Color parseColor(String color) throws ColorException {
		String obj = color.toUpperCase();
		switch (obj) {
		case "RED":
			return Color.RED;
		case "BLUE":
			return Color.WHITE;
		case "WHITE":
			return Color.WHITE;
		default: throw new ColorException();
		}
	}
	
	private static Type parseType(String type) throws TypeException {
		String obj = type.toUpperCase();
		switch (obj) {
		case "LILY":
			return Type.LILY;
		case "ASTER":
			return Type.ASTER;
		case "BEGONIA":
			return Type.BEGONIA;
		default: throw new TypeException();
		}
	}

}
