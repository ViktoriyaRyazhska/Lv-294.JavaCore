package first.exercise;

public class Show{
	public static void showLongestWord(String str) {
		System.out.println("\nThe longest word in the sentence: " + Transform.longestWord(str));
	}
	
	public static void showNumberOfLetters(String str) {
		String [] arr = Transform.transformIntoArray(str);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("[" + arr[i] + "]" + " - " + Transform.numberOfLetters(arr[i]) + " letters.");
		}
	}
	
	public static void showReversedWord(String str) {
		System.out.println("The second word in reverse order: " + "\"" + Transform.reverseSecondWord(str) + "\"");
	}
}
