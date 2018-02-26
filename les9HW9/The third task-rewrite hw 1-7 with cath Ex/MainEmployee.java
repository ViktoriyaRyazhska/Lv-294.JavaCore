package Les6HW6_1;

public class MainEmployee {

	public static void main(String[] args) {
		Employee [] emp = new Employee [5];
		emp[0] = new SalariedEmployee("Security number 29889", 10, 587);
		emp[0].setId(8);
		emp[0].setName("Stetsk Yuriy");		
		
		emp[1] = new ContractEmployee("TaxId 1", 5000);
		emp[1].setName("Vasylevych Kateryna");
		emp[1].setId(10);
		
		emp[2] = new SalariedEmployee("Security number 5879", 8, 658);	
		emp[2].setName("Gorbyov Ivan");
		emp[2].setId(14);
		
		emp[3] = new ContractEmployee("TaxId 54", 3600);
		emp[3].setName("Sokivka Diana");
		emp[3].setId(3);
		
		emp[4] = new ContractEmployee("TaxId 4", 4500);
		emp[4].setName("Skirya Bohdan");
		emp[4].setId(13);
		
		
		try{
			average(emp);
			print(emp);
		}
		catch (MyException e) {
			System.out.println("Please, create employee");
		}
		
	}
	

	public static void average(Employee [] em) throws MyException {
		Employee e;
		if(em.length>0) {
		for(int i=0; i<em.length-1; i++) {
			for(int j=i+1; j<em.length; j++) {
				if(((Pay)em[i]).calculatePay()<((Pay)em[j]).calculatePay()){
					e=em[i];
					em[i]=em[j];
					em[j]=e;
					
				
					
				}
			}
		}
		}
		else {
			throw new MyException();
		}
		
	}
	public static void print(Employee [] emp) throws MyException{
		if(emp.length>0) {
		for(Employee e: emp) {
			System.out.println("Id="+e.getId()+ " name= "+ e.getName()+ " payment= "+((Pay)e).calculatePay());
		}
		}
		else {
			throw new MyException();
		}
			
		}
	
}
