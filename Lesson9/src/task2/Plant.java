package task2;

public class Plant {
	private int size;
	private Color color;
	private Type type;
	
	public Plant(int size, String color, String type) throws ColorException, TypeException{
		Color c = colorStringToEnum(color);
		Type t = typeStringToEnum(type);
		this.size = size;
		this.color = c;
		this.type = t;
	}
	
	public int getSize() {
		return this.size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	public Color getColor() {
		return this.color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	
	public Type getType() {
		return this.type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	
	private Color colorStringToEnum(String color) throws ColorException {
		switch(color.toLowerCase()) {
		case "yellow" : return Color.YELLOW;
		case "green" : return Color.GREEN;
		case "red" : return Color.RED;
		case "white" : return Color.WHITE;
		default : throw new ColorException("Input only yellow, green, red or white");
		}
	}
		private Type typeStringToEnum(String type) throws TypeException {
			switch(type.toLowerCase()) {
			case "bluebottle" : return Type.BLUEBOTTLE;
			case "daisy" : return Type.DAISY;
			case "cactus" : return Type.CACTUS;
			case "flycatcher" : return Type.FLYCATCHER;
			default : throw new TypeException("Input only Bluebottle, Daisy, Cactus or Flycatcher");
			}
		}
		@Override
		public String toString() {
			return "Plant [size = " + getSize() + ", color = " + getColor() + ", type = " + getType() + "]";
		}
}
