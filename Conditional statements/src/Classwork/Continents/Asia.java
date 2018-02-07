package Classwork.Continents;

public enum Asia {
	CHINA,MALASIA,JAPAN,INDIA,OMAN,YEMEN,UAE,QATAR,SYRIA,RUSSIA,ARMENIA,LAOS,GEORGIA;//...
	
	public static boolean contains(String s)
	  {
	      for(Asia choice: Asia.values())
	           if (choice.name().equals(s)) 
	              return true;
	      return false;
	  } 
}
