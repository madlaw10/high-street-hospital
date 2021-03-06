package hospital.nonMedicalEmployees;

import java.util.Collection;

import hospital.Patient;
import hospital.interfaces.sucksBlood;

public class VampireJanitor extends Janitor implements sucksBlood {

	private int thirstLevel;

	public VampireJanitor(String name, String employeeID) {
		super(name, employeeID);
		this.thirstLevel = THIRST_LEVEL;
	}

	public int getThirstLevel() {
		return thirstLevel;
	}

	public void dehydratesByOne(int loopCount) {
		if (loopCount % 5 == 0) {
			thirstLevel += 1;
		}
	}

	@Override
	public void suckBlood(Collection<Patient> patients) {
		for (Patient patient : patients)
			patient.drainBloodByOne();
		thirstLevel = THIRST_LEVEL;
	}

	@Override
	public String toString() {
		return "\nVampire Janitor " + getName() + ", ID Number: " + getEmployeeID() + ", Thirst Level: "
				+ getThirstLevel() + ", Is Sweeping: " + getIsSweeping();
	}

}
