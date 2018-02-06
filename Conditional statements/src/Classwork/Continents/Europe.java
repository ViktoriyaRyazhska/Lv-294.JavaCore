package Classwork.Continents;

public enum Europe {
	UKRAINE,Poland,UK,GERMANY,FRANCE,SPAIN;  //...
	public boolean contains(String s)
	  {
	      for(Europe choice: values())
	           if (choice.name().equals(s)) 
	              return true;
	      return false;
	  } 
}
