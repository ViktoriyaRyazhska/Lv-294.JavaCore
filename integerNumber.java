package HW3;

public class integerNumber {
int in;
public integerNumber() {};
	public integerNumber(int in) {
	super();
	this.in = in;
}

	public int getIn() {
	return in;
}

public void setIn(int in) {
	this.in = in;
}
public static void maxNumber(int a,int b,int c) {
	int maxInt;
	if (a<=b){ maxInt = b;}
	    else {maxInt = a;}
	if (maxInt<=c){ maxInt = c;}
    System.out.println("MaxInt =  "+ maxInt);
	
}
public static  void minNumber(int a,int b,int c) {
	int minInt;
	if (a<=b){ minInt = a;}
	    else {minInt = b;}
	if (minInt>=c){ minInt = c;}
    System.out.println("MinInt =  "+ minInt);
	
}
	public static void main(String[] args) {
		integerNumber in1 = new integerNumber();	
		 in1.setIn(3);
		 integerNumber in2 = new integerNumber();	
		 in2.setIn(4);
		 integerNumber in3 = new integerNumber();	
		 in3.setIn(5);
		 maxNumber(in1.getIn(),in2.getIn(),in3.getIn());
		 minNumber(in1.getIn(),in2.getIn(),in3.getIn());
	}

}
