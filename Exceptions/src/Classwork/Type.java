package Classwork;

public enum Type {
	 LILY,ASTER,BEGONIA;
	
	public static boolean contains(String key) {
		String type = key.toUpperCase();
		for(Type obj: values()){
			if(obj.name().equals(type)) {
				return true;
			}
		}
		return false;
	}
	
	public static Type getType(String key) throws TypeException {
		String type = key.toUpperCase();
		Type res = null;
		if(Type.contains(type)) {
			for(Type obj: values()) {
				if(obj.name().equals(type)) {
					res = obj;
				}
			}
			return res;
		}else {
			throw new TypeException();
		}
	}
	
	
	
}
