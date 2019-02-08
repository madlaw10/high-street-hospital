package hospital;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import hospital.nonMedicalEmployees.Janitor;

public class HospitalTest {

	Hospital underTest;
	Employee testEmployee;

	@Before
	public void setup() {
		underTest = new Hospital();
		testEmployee = new Janitor("Janitor", "567");
	}

	@Test
	public void shouldBeAbleToAddEmployees() {
		int employeesBeforeAdding = underTest.getEmployeeCount();
		underTest.addEmployee(testEmployee);
		int employeesAfterAdding = underTest.getEmployeeCount();
		assertEquals(employeesBeforeAdding + 1, employeesAfterAdding);
	}

}
