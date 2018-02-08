import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Homework.Main;

public class SomeTest {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testF1WithBigNumber() {
		assertTrue(Main.f1(100)==false);
	}
	
	@Test
	public void testF1WithSmallNumber() {
		assertTrue(Main.f1(0)==true);
	}
	
	@Test
	public void testF2() {
		//input 1 2 3
		assertTrue(Main.f2(reader)==3);
	}
	
	@Test
	public void testF3() {
		//input 1 2 3
		assertTrue(Main.f3(0).equals("Could'n find the error code"));
	}
}
