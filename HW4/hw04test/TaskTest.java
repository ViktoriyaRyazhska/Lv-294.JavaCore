package hw04test;

import static org.junit.Assert.*;
import hw04.task1.Task;

import org.junit.Test;

public class TaskTest {
	Task task = new Task();

	@Test
	public void testStartA() {
		boolean condition1 = task.startA(-5, 5, 3, 2, 1, -4, -3);
		boolean condition2 = task.startA(-6, 0, 1, 2, -5, -6, -2, -3);
		assertTrue(condition1);
		assertFalse(condition2);
	}

	@Test
	public void testStartB() {
		String actual = "-3;120";
		String expected = task.startB(-3, -2, 1, 0, 16, 120);
		assertEquals(expected, actual);
		actual = "-40;0";
		expected = task.startB(0, -1, -3, -6, -17, -14, -25, -40);
		assertEquals(expected, actual);

	}

	@Test
	public void testStartC() {
		String actual = "ERROR NUMBER NOT FOUND";
		String expected = task.startC(500);
		assertEquals(expected, actual);
		actual = "METHOD_NOT_ALLOWED";
		expected = task.startC(405);
		assertEquals(expected, actual);
	}

}
