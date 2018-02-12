/*
Ñreate class Dog with fields name, breed, age. 
Declare enum for field breed. 
Create 3 instances of type Dog. 
Check if there is no two dogs with the same name. 
Display the name and the kind of the oldest dog. 
 */

public class Dog {
	
	private String name;
	public enum breed {
		male, female
	}
	private int age;
	
	private static int oldest=0;
	private static String oname;
	private static enum obreed {
		male, female
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Dog other = (Dog) obj;
		if (name != other.name) return false;
		if (name == null) {
			if (other.name != null) return false;
		} else if (!name.equals(other.name)) return false;
		return true;
	}
	
	private void aging (int age)
	{
		if (oldest<age) {
		oldest=age;
		oname=this.name;
		obreed=this.breed;
		}
	}
	
	
	public static void main(String[] args) {


	}

}
