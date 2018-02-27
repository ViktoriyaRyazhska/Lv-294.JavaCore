package les8HW8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
	public static void main(String[] args) throws IOException {

	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//		
		String p= "\\$([0-9]+)(\\.[0-9]{2})";
		Pattern pattern = Pattern.compile(p);
		Matcher m=null;
		try {
		currencyUs(br, pattern, m);
		}
		catch (IOException | NumberFormatException e) {
			System.out.println("You write WRONG format of currency");
		}
	}
	public static void currencyUs(BufferedReader br, Pattern pattern, Matcher m) throws IOException, NumberFormatException {
		List <String> slist = new ArrayList<String>();
		boolean a = true;
		while(a) {
			System.out.println("Please, write currency");
			System.out.println("For exit write 0");
			String s = br.readLine();
			m = pattern.matcher(s);
			 if(s.equals("0")) {
				a=false;
			}
			 else if(!m.matches()) {
				 throw new NumberFormatException();	
			 }
			 else if(m.matches()){
				 slist.add(s);
				 System.out.println("You write RIGHT format. I add your currency");
			 }
		}
		System.out.println(slist.toString());
	}
	
}
