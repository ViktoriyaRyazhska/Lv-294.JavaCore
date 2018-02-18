package second.exercise;

public class Transform {
	public static String convertSpaces(String str) {
		String s = str.trim();
		String regex = "(\\s){2,}";
		return s.replaceAll(regex, " ");
	}
}
