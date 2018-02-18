package second.exercise;

import java.util.HashMap;
import java.util.Map;

public class FindSubstring {
	public static Map<String, String> find(String str){
		str.trim();
		String [] name = str.split("\\s+");
		Map<String, String> map = new HashMap<String, String>();
		map.put("surname", name[0]);
		map.put("name", name[1]);
		map.put("patronymic", name[2]);
		return map;
	}
}
