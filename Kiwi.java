package HW5;

public class Kiwi extends NonflyingBird {
	String name;
	String typeOfFood;

	
	
	public Kiwi(String name,String typeOfFood) {
		super();
		this.name = name;
		this.typeOfFood = typeOfFood;
	}
	
public Kiwi() {
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

	public	void show() {
		System.out.println("Name of bird - "+getName()+" Eating -  "+getTypeOfFood()+" Area Of Living - "+getAreaOfLiving()+" Ñover type - "+getFeather()+" "+getLayEgs());
	}
@Override
	void fly() {
		System.out.println("Kiwi moves only on the ground");
		
	}

}
