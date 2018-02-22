package HW7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_7_1 {
	static String maxWord(String s)
	  {
	    String[]words=s.split(" ");
	    String resstring="";
	    for(String word: words)
	    {
	      if(word.length()>resstring.length())
	        resstring=word;
	    }
	    return(resstring);
	  }
	

	public static void main(String[] args) throws IOException {
		//Enter in the console sentence of five words. 
		//display the longest word in the sentence
		//determine the number of its letters
		//bring the second word in reverse order
		
		BufferedReader br = new BufferedReader(
	   		new InputStreamReader(System.in));
	System.out.println("Enter sentence");
	String sentence = br.readLine();
	
	//String sentence = "  I am learning java  ";
	//System.out.println(s1);
	//StringBuilder sentence = new StringBuilder(s1);
	
	   String maxword = maxWord(sentence);
	    System.out.println(maxword);
	    System.out.println("The number of letters  longest word = "+maxword.length());
	   
	 //   StringTokenizer st = new StringTokenizer(sentence, " \t\n\r,."); 
    //    int l=0;
	// while(st.hasMoreTokens()){
	
//if(l==1) {
	//    String Word = st.nextToken();
     
     //    String reverse = new StringBuffer(Word).reverse().toString();
      //   System.out.println(reverse) ;
	// }l++;
	
	   
	// } 
	    
	}

}
