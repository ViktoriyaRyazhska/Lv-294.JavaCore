package hw04test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import hw04.task2.Breed;
import hw04.task2.Dog;
import hw04.task2.DogApp;


import org.junit.Test;

public class DogAppTest {
	Dog dog1 = new Dog("Sparky", Breed.ALASKAN_MALAMUTE, 15);
	Dog dog2 = new Dog("Tuzik", Breed.BEAGLE, 10);
	Dog dog3 = new Dog("Hatiko", Breed.GERMAN_SHEPHERD_DOG, 15);
	Dog dog4 = new Dog("Hatiko", Breed.CANE_CORSO, 8);
	DogApp app = new DogApp(dog1, dog2, dog3, dog4);

	@Test
	public void testCheckNames() {
		int actual = 2;
		int expected = app.checkNames("Hatiko");
		assertEquals(expected, actual);
		actual = 1;
		expected = app.checkNames("Tuzik");
		assertEquals(expected, actual);
		actual = 0;
		expected = app.checkNames("Brovko");
		assertEquals(expected, actual);
	}

	@Test
	public void testSameNameDogs() {
		boolean condition = app.sameNameDogs("Hatiko");
		assertTrue(condition);
		condition = app.sameNameDogs("Brovko");
		assertFalse(condition);
	}

	@Test
	public void testOldest() {
		List<Dog> actuals = new ArrayList<Dog>();
		actuals.add(new Dog("Sparky", Breed.ALASKAN_MALAMUTE, 15));
		actuals.add( new Dog("Hatiko", Breed.GERMAN_SHEPHERD_DOG, 15));
		List<Dog> expecteds = app.oldest();
		assertEquals(expecteds, actuals);
	}

	@Test
	public void testDisplayOldestDogs() {
		// I don't know how to test void methods =) 
	}

}
