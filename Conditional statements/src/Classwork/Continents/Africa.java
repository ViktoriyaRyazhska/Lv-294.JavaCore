package Classwork.Continents;

public enum Africa {
	KENYA,UGANDA,TOGO,LIBYA,ZAMBIA,CAR; //...
	 
	public  boolean contains(String s)
	  {
	      for(Africa choice:values())
	           if (choice.name().equals(s)) 
	              return true;
	      return false;
	  } 
}
