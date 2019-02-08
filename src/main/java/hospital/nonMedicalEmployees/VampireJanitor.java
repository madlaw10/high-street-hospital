package hospital.nonMedicalEmployees;

import hospital.interfaces.canSuckBlood;

public class VampireJanitor extends Janitor implements canSuckBlood {

	// Need a thirst property

	public VampireJanitor(String name, String numID) {
		super(name, numID);
	}

	@Override
	public void suckBlood() {
		// Need functionality & need test
	}

	@Override
	public String toString() {
		return "\nVampire Janitor " + getName() + ", ID Number: " + getIDNumber() + ", Is Sweeping: " + getIsSweeping();
	}

}
