package hospital.medicalEmployees;

public class Surgeon extends Doctor {

	private boolean surgeryStatus;

	public Surgeon(String name, String numID, String specialty) {
		super(name, numID, specialty);
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
		return "\n" + getSpecialty() + " Surgeon " + getName() + ", ID Number: " + getIDNumber() + ", Is Operating: "
				+ getSurgeryStatus();
	}
}
