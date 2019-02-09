package hospital.nonMedicalEmployees;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import hospital.nonMedicalEmployees.Receptionist;

public class ReceptionistTest {

	Receptionist underTest;

	@Before
	public void setup() {
		underTest = new Receptionist("Laverne", "456");
	}

	@Test
	public void shouldBePaid45k() {
		String testPay = underTest.calculatePay();
		assertEquals("$45,000", testPay);
	}

	@Test
	public void shouldBeOnThePhone() {
		underTest.togglePhone();
		assertEquals(true, underTest.getPhoneStatus());
	}

	@Test
	public void shouldBeOffThePhone() {
		underTest.togglePhone();
		underTest.togglePhone();
		assertEquals(false, underTest.getPhoneStatus());
	}

}
