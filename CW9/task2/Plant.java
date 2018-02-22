package cw09.task2;

import cw09.task2.enums.Color;
import cw09.task2.enums.Type;
import cw09.task2.exception.ColorException;
import cw09.task2.exception.TypeException;

public class Plant {
	private int size;
	private Type type;
	private Color color;

	public Plant(int size, String type, String color) throws ColorException, TypeException {
		this.size = size;
		this.type = getTypeByString(type);
		this.color = getColorByString(color);
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	private Type getTypeByString(String type) throws TypeException {
		Type typeResult = null;
		Type[] types = Type.values();
		for (Type t : types) {
			if (t.getName().equals(type.toLowerCase())) {
				typeResult = t;
				break;
			}
		}
		if (typeResult == null) {
			throw new TypeException();
		}
		return typeResult;
	}

	private Color getColorByString(String color) throws ColorException {
		Color colorResult = null;
		Color[] colors = Color.values();
		for (Color c : colors) {
			if (c.getName().equals(color.toLowerCase())) {
				colorResult = c;
				break;
			}
		}
		if (colorResult == null) {
			throw new ColorException();
		}
		return colorResult;
	}
}
