package hospital.nonMedicalEmployees;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import hospital.nonMedicalEmployees.Janitor;

public class JanitorTest {

	Janitor underTest;

	@Before
	public void setup() {
		underTest = new Janitor("Janitor", "567");
	}

	@Test
	public void shouldBePaid40k() {
		String testPay = underTest.calculatePay();
		assertEquals("$40,000", testPay);
	}

	@Test
	public void shouldBeSweeping() {
		underTest.toggleSweeping();
		assertEquals(true, underTest.getIsSweeping());
	}

	@Test
	public void shouldNotBeSweeping() {
		underTest.toggleSweeping();
		underTest.toggleSweeping();
		assertEquals(false, underTest.getIsSweeping());
	}

}
