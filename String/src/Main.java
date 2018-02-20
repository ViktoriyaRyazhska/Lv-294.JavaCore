import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//f2(reader);
		f3(reader);
	}
	
	public static  void f1(BufferedReader reader) {
		try {
			String s1 = reader.readLine();
			String s2 = reader.readLine();
			System.out.println(s2.contains(s1));
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void f2(BufferedReader reader) {
		try {
			String[] fullName = reader.readLine().split(" ");
			StringBuilder builder = new StringBuilder();
			builder.append(fullName[0]);
			builder.append(" ");
			builder.append(fullName[1].charAt(0) + ".");
			builder.append(" ");
			builder.append(fullName[2].charAt(0) + ".");
			System.out.println(builder.toString());
			System.out.println(fullName[0]);
			builder.setLength(0);
			builder.append(fullName[0] + " ");
			builder.append(fullName[1] + " ");
			builder.append(fullName[2]);
			System.out.println(builder.toString());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Wrong input!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void f3(BufferedReader reader) {
		String name;
		try {
			for(int i = 0; i < 5;i++) {
				name = reader.readLine();
				String nameVal = "^[A-Z][a-z]{3,15}$";
				System.out.println(name.matches(nameVal));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
