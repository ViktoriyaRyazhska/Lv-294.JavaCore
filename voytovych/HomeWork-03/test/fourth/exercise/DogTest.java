package fourth.exercise;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DogTest {
	CheckDog check;
	
	@Before
	public void initialize() {
		Dog dog1 = new Dog("Elvis", Breed.Beagle, 5);
		Dog dog2 = new Dog("Elvis", Breed.Collie, 3);
		Dog dog3 = new Dog("Jackson", Breed.Dalmatian, 7);
		
		check = new CheckDog(dog1, dog2, dog3);
	}
	
	@Test
	public void testCheckName() {
		assertTrue(check.checkName());
	}

	@Test
	public void testOldestDog() {
		assertEquals(check.oldestDog().getAge(), 7);
	}

}
