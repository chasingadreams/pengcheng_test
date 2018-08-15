

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ComputerInfoTest {

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
	public void testGetComputerName() {
		assertEquals(new ComputerInfo().getComputerName(),("DELL"));
	}

	@Test
	public void testGetComputerId() {
		assertEquals(new ComputerInfo().getComputerId(),("13"));
	}

	@Test
	public void testGetComputerPrice() {
		assertEquals(new ComputerInfo().getComputerPrice(),("7999"));
	}

	@Test
	public void testGetComputerCore() {
		assertEquals(new ComputerInfo().getComputerCore(),("i78860"));
	}

}
