package Classwork.Continents;

public enum NorthAmerica {
	USA,MEXICO,CANADA,BARBADOS,PANAMA,HAITI,JAMAICA; //...
	public boolean contains(String s)
	  {
	      for(NorthAmerica choice: values())
	           if (choice.name().equals(s)) 
	              return true;
	      return false;
	  } 
}
