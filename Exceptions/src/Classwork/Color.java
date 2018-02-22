package Classwork;

public enum Color {
	RED,BLUE,WHITE;

	public static boolean contains(String s) {
		for(Color obj: values()){
			if(obj.name().equals(s)) {
				return true;
			}
		}
		return false;
	}
}
