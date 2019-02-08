package hospital.nonMedicalEmployees;

import hospital.Employee;

public class Janitor extends Employee {

	private boolean isSweeping;

	public Janitor(String name, String numID) {
		super(name, numID);
		this.isSweeping = false;
	}

	public boolean getIsSweeping() {
		return isSweeping;
	}

	public void toggleSweeping() {
		isSweeping = !isSweeping;
	}

	@Override
	public String calculatePay() {
		return "$40,000";
	}

	@Override
	public String toString() {
		return "\nJanitor " + getName() + ", ID Number: " + getIDNumber() + ", Is Sweeping: " + getIsSweeping();
	}

}
