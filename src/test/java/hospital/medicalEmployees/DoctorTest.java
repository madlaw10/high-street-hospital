package hospital.medicalEmployees;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import hospital.Employee;
import hospital.medicalEmployees.Doctor;

public class DoctorTest {

	Employee underTest;

	@Before
	public void setup() {
		underTest = new Doctor("JD", "234", "General");
	}

	@Test
	public void shouldBePaid90k() {
		String testPay = underTest.calculatePay();
		assertEquals("$90,000", testPay);
	}

}
