package hospital.medicalEmployees;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import hospital.medicalEmployees.Surgeon;

public class SurgeonTest {

	Surgeon underTest;

	@Before
	public void setup() {
		underTest = new Surgeon("Turk", "123", "Heart");
	}

	@Test
	public void shouldBeNamedTurk() {
		String testName = underTest.getName();
		assertEquals("Turk", testName);
	}

	@Test
	public void shouldHaveIDNumber123() {
		String testIDNumber = underTest.getEmployeeID();
		assertEquals("123", testIDNumber);
	}

	@Test
	public void shouldSpecializeInHeartSurgery() {
		String testSpecialty = underTest.getSpecialty();
		assertEquals("Heart", testSpecialty);
	}

	@Test
	public void shouldBeAbleToPerformSurgery() {
		underTest.toggleSurgery();
		assertEquals(true, underTest.getSurgeryStatus());
	}

	@Test
	public void shouldBeAbleToEndSurgery() {
		underTest.toggleSurgery();
		underTest.toggleSurgery();
		assertEquals(false, underTest.getSurgeryStatus());
	}

	@Test
	public void shouldBePaid120K() {
		String testPay = underTest.calculatePay();
		assertEquals("$120,000", testPay);
	}
}
