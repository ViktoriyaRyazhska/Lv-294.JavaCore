package Classwork;

public enum Color {
	RED,BLUE,WHITE;

	public static boolean contains(String key) {
		String color = key.toUpperCase();
		for(Color obj: values()){
			if(obj.name().equals(color)) {
				return true;
			}
		}
		return false;
	}
	
	public static Color getColor(String key) throws ColorException {
		String color = key.toUpperCase();
		Color res = null;
		if(Color.contains(color)) {
			for(Color obj: values()) {
				if(obj.name().equals(color)) {
					res = obj;
				}
			}
			return res;
		}else {
			throw new ColorException();
		}
	}
}
