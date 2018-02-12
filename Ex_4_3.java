package HW4;

public class Ex_4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {-1, -2, -1, -1, 1, -1, 
				-1, -18,-9, 4} ;
		
		int count=0;
		int i=0;
		
 		while ((i<arr.length)&&(count<2)) {
 			if (arr[i]>0){
 				count++;
 			}
 			i++;
 		}
 		 System.out.println("Position of second positive number =  "+(i));	
 		
 		int positionOfMinimum = 0;

 		 for (int h = 0; h < arr.length-1; h++) {
 			if (arr[h]>arr[h+1]){
 				positionOfMinimum = h+1;
 			}
 		 }
 			 System.out.println("Minimum of array  = "+arr[positionOfMinimum]+" and its position in the array  "+ (positionOfMinimum+1));
 		    
 		
		 		}
}