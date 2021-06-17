package calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	private static Calculator calculator = new Calculator();

	@Before
	public void setUp() throws Exception {
		calculator.clear();
	}

	@Test
	public void testAdd() {
		calculator.add(3);
		calculator.add(4);
		assertEquals(7,calculator.getResult());
	}
	
	@Test
	public void testAdd2() {
		calculator.add(9);
		calculator.add(3);
		assertEquals(12,calculator.getResult());
	}

	@Test
	public void testSubstract() {
		calculator.add(10);
		calculator.substract(2);
		assertEquals(8,calculator.getResult());
	}

	@Test
	public void testMultiply() {
		calculator.add(10);
		calculator.multiply(2);
		assertEquals(20,calculator.getResult());
	}

	@Test
	public void testDivide() {
		calculator.add(50);
		calculator.divide(2);
		assertEquals(25,calculator.getResult());
	}

	@Test
	public void testDivide1() {
		calculator.add(30);
		calculator.divide(15);
		assertEquals(2,calculator.getResult());
	}
	
	@Test
	public void testSquare() {
		calculator.square(2);
		assertEquals(4,calculator.getResult());
	}

	@Test
	public void testDivide2() {
		calculator.add(40);
		calculator.divide(2);
		assertEquals(20,calculator.getResult());
	}

	@Test
	public void testClear() {
		calculator.add(10);
		calculator.clear();
		assertEquals(0,calculator.getResult());
	}

	@Test
	public void testGetResult() {
		
	}

}
