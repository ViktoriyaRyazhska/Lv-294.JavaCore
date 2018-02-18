package first.exercise;

public class Transform {

	public static String longestWord(String str) {
		String [] arr = transformIntoArray(str);
		String max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() > max.length()) {
				max = arr[i];
			}
		}
		return max;
	}

	public static int numberOfLetters(String str) {
		return str.length();
	}
	
	public static String reverseSecondWord(String str) {
		String [] arr = transformIntoArray(str);
		return reverseOrder(arr[1]);
	}
	
	public static String [] transformIntoArray(String str) {
		String s = str.trim();
		return s.split("\\s");
	}
	
	public static String reverseOrder(String str) {
		char[] in = str.toCharArray();
		int begin = 0;
		int end = in.length - 1;
		char temp;
		while (end > begin) {
			temp = in[begin];
			in[begin] = in[end];
			in[end] = temp;
			end--;
			begin++;
			
		}
		return new String(in);
	}
}



















