package hospital.medicalEmployees;

import hospital.Patient;

public class Surgeon extends Doctor {

	private boolean surgeryStatus;

	public Surgeon(String name, String employeeID, String specialty) {
		super(name, employeeID, specialty);
		this.surgeryStatus = false;
	}

	public boolean getSurgeryStatus() {
		return surgeryStatus;
	}

	public void toggleSurgery() {
		surgeryStatus = !surgeryStatus;
	}

	@Override
	public String calculatePay() {
		return "$120,000";
	}

	@Override
	public String toString() {
		return "\n" + getSpecialty() + " Surgeon " + getName() + ", ID Number: " + getEmployeeID() + ", Is Operating: "
				+ getSurgeryStatus();
	}

	@Override
	public void administerCare(Patient patient) {
		patient.returnHealthToTen();
		patient.drainBloodByOne();
	}
}
