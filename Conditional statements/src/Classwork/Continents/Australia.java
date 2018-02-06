package Classwork.Continents;

public enum Australia {
	AUSTRALIA;
	
	public boolean contains(String s)
	  {
	      for(Australia choice: values())
	           if (choice.name().equals(s)) 
	              return true;
	      return false;
	  } 
}
