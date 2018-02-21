import java.util.Scanner;

public class Hw7p1 {

	public static void main(String[] args) {
		System.out.println("Enter sentence of five words");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String sentence = in.nextLine();
		String[] word = sentence.split(" ");
		String longest = null;
		for (int i = 0; i < word.length; i++) {
			for (int n = i + 1; n < word.length; n++) {
				if (word[n].length() > word[i].length()) {
					longest = word[n];
				}
			}
		}
		System.out.println("The longest word in the sentence is: " + longest);
		System.out.println("Number of its letters: " + longest.length());
		StringBuilder secondWord = new StringBuilder(word[1]);
		System.out.println("The second word in reverse order: " + secondWord.reverse());
	}

}
