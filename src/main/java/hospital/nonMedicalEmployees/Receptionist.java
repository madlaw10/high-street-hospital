package hospital.nonMedicalEmployees;

import hospital.Employee;

public class Receptionist extends Employee {

	private boolean isUsingPhone;

	public Receptionist(String name, String numID) {
		super(name, numID);
		this.isUsingPhone = false;
	}

	public boolean getPhoneStatus() {
		return isUsingPhone;
	}

	public void togglePhone() {
		isUsingPhone = !isUsingPhone;
	}

	@Override
	public String calculatePay() {
		return "$45,000";
	}

	@Override
	public String toString() {
		return "Receptionist " + getName() + ", ID Number: " + getIDNumber() + ", Is on the Phone: " + getPhoneStatus();
	}
}
