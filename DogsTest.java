/**
 * 
 */
package HW3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author user
 *
 */
class DogsTest {
	
	

	@Test
	void test1() {
	assertEquals(5,maxNumber(3,4,5));	
	}
	@Test
	

	private int maxNumber(int a, int b, int c) {
		int maxInt = 0;
		if (a<=b){ maxInt = b; }
	    else {maxInt = a;}
	if (maxInt<=c){ maxInt = c;}

   // System.out.println("MaxInt =  "+ maxInt);
	
		return maxInt ;
	}



}
