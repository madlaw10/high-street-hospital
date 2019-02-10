package hospital.interfaces;

import java.util.Collection;

import hospital.Patient;

public interface sucksBlood {

	public static final int THIRST_LEVEL = 0;

	public void suckBlood(Collection<Patient> patients);
}
