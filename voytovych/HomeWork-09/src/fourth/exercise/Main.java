package fourth.exercise;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		/*
		 * Create file1.txt file with a text about your career. Read context from file
		 * into array of strings. Each array item contains one line from file. Write in
		 * to the file2.txt 1) number of lines in file1.txt. 2) the longest line in
		 * file1.txt. 3) your name and birthday date.
		 */

		String fromFile = "file1.txt";
		String toFile = "file2.txt";
		try {
			ExternalFile ex = new ExternalFile(fromFile, toFile);
			ex.writeIntoFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
