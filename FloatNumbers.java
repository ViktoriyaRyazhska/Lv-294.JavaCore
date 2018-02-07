package HW3;

public class FloatNumbers {
float fn;

public FloatNumbers(){};
public FloatNumbers(float fn){
this.fn= fn;
}

public float getFn() {
	return fn;
}

public void setFn(float fn) {
	this.fn = fn;
}

public void  check (float x){
if (-5<=x&&x<= 5){
	System.out.println("Nunber    "+ x+ "   belong to the range [-5,5]");
}
else
	{
	System.out.println("Nunber    "+ x+"   don`t belong to the range [-5,5]");	
	}
} 

	public static void main(String[] args) {
		FloatNumbers fn1 = new FloatNumbers();	
		 fn1.setFn(-3);
		FloatNumbers fn2 = new FloatNumbers();
		fn2.setFn(1);
		FloatNumbers fn3 = new FloatNumbers();
		fn3.setFn(6);
		fn1.check(fn1.getFn());
		fn2.check(fn2.getFn());
		fn3.check(fn3.getFn());
	}
		
	}
