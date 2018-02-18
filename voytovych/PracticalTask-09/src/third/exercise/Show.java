package third.exercise;

public class Show {
	public static void showResult(String[] str) {
		for (String elm : str) {
			if (Check.checkInput(elm)) {
				System.out.println("Entered name [" + elm + "]" + " valid.");
			} else {
				System.out.println("Entered name [" + elm + "]" + " isn't valid.");
			}
		}
	}
}
