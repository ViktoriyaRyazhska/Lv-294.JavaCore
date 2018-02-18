package first.exercise;

public class Show {
	public static void output(boolean ex, String s1, String s2) {
		if (ex) {
			System.out.println("We have found \"" + s1 + "\" within \"" + s2 + "\"." );
		} else {
			System.out.println("We haven't found \"" + s1 + "\" within \"" + s2 + "\"." );
		}
		
	}
}
