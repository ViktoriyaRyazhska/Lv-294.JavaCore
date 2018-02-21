
public class Hw7p3new {

	public static void main(String[] args) {
		String str = "We       are      studying   Java    at      Academy";
		
			str = str.replaceAll("\\s+", " ");
		
		System.out.println(str);
	}

}
