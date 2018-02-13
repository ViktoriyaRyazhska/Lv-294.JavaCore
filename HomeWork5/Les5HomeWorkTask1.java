/* Ask user to enter the number of month. Read 
 * the value and write the amount of days in this 
 * month (create array with amount days of each month).
 */

	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	
	public class Les5HomeWorkTask1 {

		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(
					new InputStreamReader(System.in));
			System.out.println("Give me number of mounth: ");
			int a = Integer.parseInt(br.readLine());
			if ( a > 0  && a <= 12) {
			int arr [] = {31,28,31,30,31,30,31,31,30,31,30,31};
			System.out.println("Number of days are: " + arr[a-1]);}
			else {
				System.out.println("Wrong number of mounth");
			}

		}

	}
