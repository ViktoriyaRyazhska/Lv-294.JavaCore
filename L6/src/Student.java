
public class Student extends Person implements Money, Money2{

	@Override
	public int salary() {
		return 100;
	}
	
	public int bonus() {return 50;}
	public void print(String s) {};

}
