package hospital;

import java.util.Collection;
import java.util.HashMap;

public class Hospital {

	private int cleanliness = 85;

	public int getCleanliness() {
		if (cleanliness < 0) {
			cleanliness = 0;
		}
		return cleanliness;
	}

	public void soilHospitalByFive(int loopCount) {
		if (loopCount % 5 == 0) {
			cleanliness -= 5;
		}
	}

	public void cleanHospitalFully() {
		cleanliness = 100;
	}

	private HashMap<String, Employee> employees = new HashMap<String, Employee>();
	private HashMap<String, Patient> patients = new HashMap<String, Patient>();

	public int getEmployeeCount() {
		return employees.size();
	}

	public int getPatientCount() {
		return patients.size();
	}

	public void addEmployee(Employee newEmployee) {
		employees.put(newEmployee.getEmployeeID(), newEmployee);
	}

	public void addPatient(Patient patient) {
		patients.put(patient.getPatientID(), patient);
	}

	public Employee findEmployee(String employeeID) {
		return employees.get(employeeID);
	}

	public Patient findPatient(String patientID) {
		return patients.get(patientID);
	}

	public Collection<Employee> getEmployees() {
		return employees.values();
	}

	public Collection<Patient> getPatients() {
		return patients.values();
	}

}
