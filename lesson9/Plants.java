package lesson9;

public class Plants {
	private int size;
	private Color color;
	private Type type;

	public Plants(int size, String stcolor, String sttype) throws ColorException, TypeException {
		
		this.size = size;
		this.color = toColorType(stcolor);
		this.type = toType(sttype);
	}

	public Color toColorType(String tscolor) throws ColorException {

		switch (tscolor.toUpperCase()) {
		case "WHITE":
			return Color.WHITE;

		case "PURPLE":
			return Color.PURPLE;

		case "ROSE":
			return Color.ROSE;

		case "ORANGE":
			return Color.ORANGE;

		case "BLACK":
			return Color.BLACK;

		case "WHIOLET":
			return Color.WHIOLET;

		default:
			throw new ColorException();

		}

	}

	public Type toType(String sttype) throws TypeException {
		switch (sttype.toUpperCase()) {
		case "ROSE":

			return Type.ROSE;
		case "DAISY":

			return Type.DAISY;
		case "VIOLA":
			return Type.VIOLA;

		case "ORHID":

			return Type.ORHID;
		case "LILY":
			return Type.LILY;
		default:
			throw new TypeException();

		}
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

}
