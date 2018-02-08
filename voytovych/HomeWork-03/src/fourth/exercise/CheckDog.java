package fourth.exercise;

public class CheckDog {

	private Dog dog1;
	private Dog dog2;
	private Dog dog3;
	private Dog [] dog;
	
	
	public CheckDog() {

	}

	public CheckDog(Dog dog1, Dog dog2, Dog dog3) {
		this.dog1 = dog1;
		this.dog2 = dog2;
		this.dog3 = dog3;
		dog = new Dog[3];
		dog[0] = dog1;
		dog[1] = dog2;
		dog[2] = dog3;
	}

	public boolean checkName() {

		boolean check;
		if (dog1.getName() == dog2.getName() || dog1.getName() == dog3.getName() || dog2.getName() == dog3.getName()) {
			check = true;
		} else {
			check = false;
		}
		return check;
	}
	
	public Dog oldestDog() {
		Dog oldestDog = dog[0];
		for (int i = 0; i < this.dog.length; i++) {
			if (dog[i].getAge() > oldestDog.getAge()) {
				oldestDog = dog[i];
			}
		}
		return oldestDog;
	}
}
