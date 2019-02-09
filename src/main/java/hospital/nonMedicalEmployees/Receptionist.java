package hospital.nonMedicalEmployees;

import hospital.Employee;

public class Receptionist extends Employee {

	private boolean isUsingPhone;

	public Receptionist(String name, String employeeID) {
		super(name, employeeID);
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
		return "\nReceptionist " + getName() + ", ID Number: " + getEmployeeID() + ", Is on the Phone: "
				+ getPhoneStatus();
	}
}
