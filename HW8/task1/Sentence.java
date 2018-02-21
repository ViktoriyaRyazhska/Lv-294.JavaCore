package hw08.task1;

import java.util.Scanner;

public class Sentence {

	public String getSentence() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence : ");
		String sentence = sc.nextLine();
		sc.close();
		return sentence;
	}

	public String longetstWord(String sentence) {
		String[] arrStr = sentence.split(" ");
		StringBuffer word = new StringBuffer(arrStr[0]);
		for (int i = 1; i < arrStr.length; i++) {
			if (word.length() < arrStr[i].length()) {
				word.replace(0, word.length(), arrStr[i]);
				// word.delete(0, word.length());
				// word.append(arrStr[i]);
			}
		}
		return word.toString();
	}

	public int leterNumber(String word) {
		return word.length();
	}

	public String reversOrder(String sentence, int wordNumber) {
		String[] arr = sentence.split(" ");
		// StringBuilder revers = new StringBuilder(arr[wordNumber - 1]);
		// revers.reverse();
		String word = arr[wordNumber - 1];
		StringBuilder revers = new StringBuilder();
		for (int i = word.length() - 1; i >= 0; i--) {
			revers.append(word.charAt(i));
		}
		return revers.toString();
	}

	public void start() {
		String sentence = getSentence();
		String longetsWord = longetstWord(sentence);
		int leterNumber = leterNumber(longetsWord);
		String revers = reversOrder(sentence, 2);
		int number = 20;
		if (leterNumber > number) {
			number = leterNumber;
		}
		System.out.printf("| %-" + number + "s| %-14s| %-20s|\n",
				"Longest Word:", "Leters Number:", "Revers Word:");
		System.out.printf("| %-" + number + "s| %-20s| %-20s|\n", longetsWord,
				leterNumber, revers);
	}
}
