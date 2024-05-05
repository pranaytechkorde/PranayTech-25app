package in.ashokit.beans.test;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import in.ashokit.beans.Calculator;

public class CalculatorTest {
	
	private static Calculator calci=null;
	
	@BeforeClass
	public static  void init() {
	 calci=new Calculator();
	}
	
	@AfterClass
	public static void destroy() {
		calci =null;
	}

	/*
	 * @Test public void addTest() { Calculator calci=new Calculator(); Integer
	 * actualResult=calci.add(10, 20); Integer expetectedResult=30;
	 * 
	 * assertEquals(expetectedResult, actualResult); }
	 * 
	 * @Test public void multiplyTest() { Calculator calci=new Calculator(); Integer
	 * actualResult=calci.multiply(20, 5); Integer expectedResult=100;
	 * assertEquals(expectedResult, actualResult); }
	 */
	
	@Test
	public void addTest() {
		Integer actualResult=calci.add(10, 20);
		Integer expetectedResult=30;
		
		assertEquals(expetectedResult, actualResult);
	}
	
	@Test
	public void multiplyTest() {
		Integer actualResult=calci.multiply(20, 5);
		Integer expectedResult=100;
		assertEquals(expectedResult, actualResult);
	}
	
}
