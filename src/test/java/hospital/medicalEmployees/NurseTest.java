package hospital.medicalEmployees;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import hospital.Patient;

public class NurseTest {

	Nurse underTest;
	Patient testPatient;

	@Before
	public void setup() {
		underTest = new Nurse("Carla", "345");
		testPatient = new Patient("Harvey", "1001");
	}

	@Test
	public void shouldBePaid50k() {
		String testPay = underTest.calculatePay();
		assertEquals("$50,000", testPay);
	}

	@Test
	public void shouldBeAssignedPatients() {
		int patientsBeforeAssignment = underTest.getAssignmentCount();
		underTest.assignPatient(testPatient);
		int patientsAfterAssignment = underTest.getAssignmentCount();
		assertEquals(patientsBeforeAssignment + 1, patientsAfterAssignment);
	}
}
