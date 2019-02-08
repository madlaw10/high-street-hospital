package hospital.medicalEmployees;

import hospital.Employee;

public class Nurse extends Employee {

	// Each nurse has a Collection of Patient(s)

	public Nurse(String name, String numID) {
		super(name, numID);
	}

	@Override
	public String calculatePay() {
		return "$50,000";
	}

	@Override
	public String toString() {
		return "\nNurse " + getName() + ", ID Number: " + getIDNumber();
		// Need to list collection of patients
	}

}
