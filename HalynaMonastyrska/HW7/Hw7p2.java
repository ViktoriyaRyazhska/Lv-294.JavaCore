
public class Hw7p2 {

	public static void main(String[] args) {
		String str = "We       are      studying   Java    at      Academy";
		while (str.contains("  ")) {
			str = str.replaceAll("\\s+", " ");
		}
		System.out.println(str);
	}

}
