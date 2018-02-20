package t2employee_payments;

public abstract class Employee {

	private static int lastId = 0;
	protected int id;
	protected String name;
	
	protected void getId () {
		id = lastId++;
	}
	
	public abstract float calculatePay();
    
}
