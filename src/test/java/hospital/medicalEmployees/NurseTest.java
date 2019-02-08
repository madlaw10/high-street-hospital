package hospital.medicalEmployees;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import hospital.medicalEmployees.Nurse;

public class NurseTest {

	Nurse underTest;

	@Before
	public void setup() {
		underTest = new Nurse("Carla", "345");
	}

	@Test
	public void shouldBePaid50k() {
		String testPay = underTest.calculatePay();
		assertEquals("$50,000", testPay);
	}
}
