package hospital;

import hospital.interfaces.hasBlood;
import hospital.interfaces.hasHealth;

public class Patient implements hasBlood, hasHealth {

	private String name;
	private String wristband;
	private int bloodLevel;
	private int healthLevel;

	public Patient(String name, String wristband) {
		this.name = name;
		this.wristband = wristband;
		this.bloodLevel = BLOOD_LEVEL;
		this.healthLevel = HEALTH_LEVEL;
	}

	public String getName() {
		return name;
	}

	public String getPatientID() {
		return wristband;
	}

	public int getBloodLevel() {
		return bloodLevel;
	}

	public int getHealthLevel() {
		return healthLevel;
	}

	@Override
	public String toString() {
		return "\n\tPatient " + getName() + ", ID Number: " + getPatientID() + ", Blood Level: " + getBloodLevel()
				+ ", Health Level: " + getHealthLevel();
	}

	public void conditionWorsens(int loopCount) {
		if (loopCount % 5 == 0) {
			this.drainHealthByOne();
		}
	}

	@Override
	public void drainHealthByOne() {
		healthLevel -= 1;
		if (healthLevel < 0) {
			healthLevel = 0;
		}
	}

	@Override
	public void returnHealthToTen() {
		healthLevel = HEALTH_LEVEL;
	}

	@Override
	public void drainBloodByOne() {
		bloodLevel -= 1;
		if (bloodLevel < 0) {
			bloodLevel = 0;
		}
	}

	@Override
	public void returnBloodToTwenty() {
		bloodLevel = BLOOD_LEVEL;
	}

}
