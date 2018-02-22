package Classwork;

public enum Type {
	 LILY,ASTER,BEGONIA;
	
	public static boolean contains(String s) {
		for(Type obj: values()){
			if(obj.name().equals(s)) {
				return true;
			}
		}
		return false;
	}
}
