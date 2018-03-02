package third.exercise;

import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		/*
		 * Prepare mytext.txt file with a lot of text inside. Read context from file
		 * into array of strings. Each array item contains one line from file. Complete
		 * next tasks: 1) count and write the number of symbols in every line. 2) find
		 * the longest and the shortest line. 3) find and write only that lines, which
		 * consist of word «var»
		 */
		
		String fileName = "mytext.txt";
		List<String> list = TextList.takeText(fileName);
		Map<Integer, Integer> map = Symbols.countSymbols(list);
		
		System.out.println("Number of symbols in every line: ");
		
		for (Map.Entry<Integer, Integer> em : map.entrySet()) {
			System.out.println("Line number: " + (em.getKey() + 1) + " has " + em.getValue() + " characters");
		}
		
		LineOfText fl = new LineOfText(list);
		
		System.out.println("\nThe longest line: ");
		int numberOfLine1 = (fl.longestLine()).getKey();
		System.out.println(list.get(numberOfLine1));
		
		System.out.println("\nThe shortest line: ");
		int numberOfLine2 = (fl.shortestLine()).getKey();
		System.out.println(list.get(numberOfLine2));
		
		String word = "var";
		System.out.println("\nLines  which consist of word \"var\":");
		List<Map.Entry<Integer, Integer>> line = fl.findLineWithWord(word);
		
		for (Map.Entry<Integer, Integer> mapEntry : line) {
			System.out.println(list.get(mapEntry.getKey()));
		}
		
	}

}
