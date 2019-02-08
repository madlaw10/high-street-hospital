package hospital.medicalEmployees;

import hospital.Employee;

public class Doctor extends Employee {

	private String specialty;

	public Doctor(String name, String numID, String specialty) {
		super(name, numID);
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
		return "\n" + getSpecialty() + " Doctor " + getName() + ", ID Number: " + getIDNumber();
	}

}