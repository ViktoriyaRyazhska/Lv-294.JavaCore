package third.exercise;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Symbols {

	public static Map<Integer, Integer> countSymbols(List<String> st) {
		Map<Integer, Integer> mp = new HashMap<>();
		int numberOfLine = 0;
		int numberOfSymbols = 0;
		for (String string : st) {
			for (int i = 0; i < string.length(); i++) {
				if (Character.isLetter(string.charAt(i))) {
					numberOfSymbols++;
				}
			}
			mp.put(numberOfLine, numberOfSymbols);
			numberOfLine++;
		}
		return mp;
	}
}
