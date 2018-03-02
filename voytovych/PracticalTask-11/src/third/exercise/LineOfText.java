package third.exercise;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LineOfText {
	List<String> st;
	private Map<Integer, Integer> map;

	public LineOfText(List<String> st) {
		map = sortByValue(Symbols.countSymbols(st));
		this.st = st;
	}

	public Map.Entry<Integer, Integer> longestLine() {
		Map.Entry<Integer, Integer> entry = null;
		Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			entry = (Entry<Integer, Integer>) it.next();
		}
		return entry;
	}

	public Map.Entry<Integer, Integer> shortestLine() {
		return map.entrySet().iterator().next();
	}

	public List<Map.Entry<Integer, Integer>> findLineWithWord(String pt) {
		String pattern = "(" + pt + ")+";
		Pattern p = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
		Matcher m = null;
		List<Map.Entry<Integer, Integer>> list = new LinkedList<Map.Entry<Integer, Integer>>();
		for (Map.Entry<Integer, Integer> me : map.entrySet()) {
			m = p.matcher(st.get(me.getKey()));
			if (m.find()) {
				list.add(me);
			}
		}
		return list;
	}

	public Map<Integer, Integer> sortByValue(Map<Integer, Integer> map) {
		List<Map.Entry<Integer, Integer>> list = new LinkedList<Map.Entry<Integer, Integer>>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
			public int compare(Map.Entry<Integer, Integer> o1, 
							   Map.Entry<Integer, Integer> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});

		Map<Integer, Integer> result = new LinkedHashMap<Integer, Integer>();
		for (Map.Entry<Integer, Integer> entry : list) {
			result.put(entry.getKey(), entry.getValue());
		}
		return result;
	}
}
