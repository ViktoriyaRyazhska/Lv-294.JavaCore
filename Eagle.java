package HW5;

public class Eagle extends FlyingBird{
    String name;
	String typeOfFood;
	
	

	public Eagle(String name, String typeOfFood) {
		
		Super();
		this.name = name;
		this.typeOfFood = typeOfFood;
	}


	public	void show() {
		System.out.println("Name of bird - "+getName()+" Eating -  "+getTypeOfFood()+" Area Of Living - "+getAreaOfLiving()+" Ñover type - "+getFeather()+" "+getLayEgs());
	}
	
	

	private void Super() {
		// TODO Auto-generated method stub
		
	}






	public Eagle() {
		// TODO Auto-generated constructor stub
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getTypeOfFood() {
		return typeOfFood;
	}



	public void setTypeOfFood(String typeOfFood) {
		this.typeOfFood = typeOfFood;
	}


	
	

	@Override
	void fly() {
		System.out.println("The eagle flies high ");
		
	}

}
