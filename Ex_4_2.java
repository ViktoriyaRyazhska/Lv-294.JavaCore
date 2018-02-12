package HW4;


public class Ex_4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {1, 2, 1, 1, 1, 1, 
				1, 2,3, 4} ;
		int result=0;
	
		
	 	int i=0;
	 		while ((arr[i]>0)&&(i<arr.length/2)) {
	 			result=result + arr[i];
	 		 		i++;
	 		
	 		}
	 			 	
	 		if (i != arr.length/2) {
	 		result=1;
	 		for (int j = arr.length/2;j<arr.length;j++ )
	 		{
	 			 result=result*arr[j];
	 				 	      }
	 		}
	 		 System.out.println("Result =  "+result);	
	}
}


