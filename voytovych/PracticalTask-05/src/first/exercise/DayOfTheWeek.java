package first.exercise;
import java.io.BufferedReader;
import java.io.IOException;

public class DayOfTheWeek {
	
	/* Enter the number of the day of the week. Display the name in three languages. */
	
	private int num;
	
	public DayOfTheWeek(BufferedReader br) throws NumberFormatException, IOException {
		System.out.println("Enter number of day: ");
		this.num = Integer.parseInt(br.readLine());
	}
	
	public void output() {
		  switch (num) 
		  { 
		       case 1 : 
				System.out.println("Sunday [English]" + "\nSonntag [German]" + "\nDimanche [French]");
				break; 
		       case 2 : 
		    	   System.out.println("Monday [English]" + "\nMontag [German]" + "\nLundi [French]"); 
				break;
		       case 3 : 
		    	   System.out.println("Tuesday [English]" + "\nDienstag [German]" + "\nMardi [French]"); 
				break;
		       case 4 : 
		    	   System.out.println("Wednesday [English]" + "\nMittwoch[German]" + "\nMercredi [French]"); 
				break;
		       case 5 : 
		    	   System.out.println("Thursday [English]" + "\nDonnerstag [German]" + "\nJeudi [French]"); 
				break;
		       case 6 : 
		    	   System.out.println("Friday [English]" + "\nFreitag [German]" + "\nVendredi [French]"); 
				break;
		       case 7 : 
		    	   System.out.println("Saturday [English]" + "\nSamstag [German]" + "\nSamedi [French]"); 
				break;
		       default : 
		    	   System.out.println("You chose the wrong number of day!"); 
				break;
		  }
	
	}

}
