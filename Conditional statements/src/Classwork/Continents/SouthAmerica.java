package Classwork.Continents;

public enum SouthAmerica {
	ARGENTINA,ECUADOR,URUGUAY,PERU,CHILE,BRAZIL; //...
	public static  boolean contains(String s)
	  {
	      for(SouthAmerica choice: values())
	           if (choice.name().equals(s)) 
	              return true;
	      return false;
	  } 
}
