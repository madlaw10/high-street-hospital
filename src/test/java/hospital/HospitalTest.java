package hospital;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import hospital.nonMedicalEmployees.Janitor;

public class HospitalTest {

	Hospital underTest;
	Employee testEmployee;
	Patient testPatient;

	@Before
	public void setup() {
		underTest = new Hospital();
		testEmployee = new Janitor("Janitor", "567");
		testPatient = new Patient("Harvey", "1234");
	}

	@Test
	public void shouldPeriodicallySoilHopsitalByFive() {
		int loopCount = 5;
		int testCleanlinessBefore = underTest.getCleanliness();
		underTest.soilHospitalByFive(loopCount);
		int testCleanlinessAfter = underTest.getCleanliness();
		assertEquals(testCleanlinessBefore - 5, testCleanlinessAfter);
	}

	@Test
	public void shouldBeAbleToCleanHospitalByFive() {
		int testCleanlinessBefore = underTest.getCleanliness();
		underTest.cleanHospitalByFive();
		int testCleanlinessAfter = underTest.getCleanliness();
		assertEquals(testCleanlinessBefore + 5, testCleanlinessAfter);
	}

	@Test
	public void shouldBeAbleToAddEmployee() {
		int employeesBeforeAdding = underTest.getEmployeeCount();
		underTest.addEmployee(testEmployee);
		int employeesAfterAdding = underTest.getEmployeeCount();
		assertEquals(employeesBeforeAdding + 1, employeesAfterAdding);
	}

	@Test
	public void shouldBeAbleToAddPatient() {
		int patientsBeforeAdding = underTest.getPatientCount();
		underTest.addPatient(testPatient);
		int patientsAfterAdding = underTest.getPatientCount();
		assertEquals(patientsBeforeAdding + 1, patientsAfterAdding);
	}

	@Test
	public void shouldBeAbleToFindAnEmployee() {
		underTest.addEmployee(testEmployee);
		Employee foundEmployee = underTest.findEmployee("567");
		assertEquals(testEmployee, foundEmployee);
	}

	@Test
	public void shouldBeAbleToFindAPatient() {
		underTest.addPatient(testPatient);
		Patient foundPatient = underTest.findPatient("1234");
		assertEquals(testPatient, foundPatient);
	}

}
