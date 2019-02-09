package hospital.medicalEmployees;

import hospital.Employee;
import hospital.Patient;
import hospital.interfaces.administersCare;

public class Doctor extends Employee implements administersCare {

	private String specialty;

	public Doctor(String name, String employeeID, String specialty) {
		super(name, employeeID);
		this.specialty = specialty;
	}

	public String getSpecialty() {
		return specialty;
	}

	@Override
	public String calculatePay() {
		return "$90,000";
	}

	@Override
	public String toString() {
		return "\n" + getSpecialty() + " Doctor " + getName() + ", ID Number: " + getEmployeeID();
	}

	@Override
	public void administerCare(Patient patient) {
		patient.returnHealthToTen();
		patient.returnBloodToTwenty();
	}

}