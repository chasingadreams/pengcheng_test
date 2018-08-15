package pc_project;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculateTest {

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
	public void testAdd() {
		System.out.println("this is testAdd()...");
		int result = Calculate.add(7, 9);
		assertEquals("�ӷ�������", 16, result);
	}

	@Test
	public void testSubstract() {
		System.out.println("this is testSubstract()...");
		int result = Calculate.substract(7, 7);
		assertEquals("����������", 0, result);
	}

	@Test
	public void testMultiply() {
		int result = Calculate.multiply(10, 10);
		assertEquals("�˷�������", 100, result);
	}

	@Test
	public void testDivide() {
		int result = Calculate.divide(12, 6);
		assertEquals("����������", 2, result);
	}

}
