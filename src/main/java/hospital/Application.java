package hospital;

import hospital.medicalEmployees.Doctor;
import hospital.medicalEmployees.Nurse;
import hospital.medicalEmployees.Surgeon;
import hospital.nonMedicalEmployees.Janitor;
import hospital.nonMedicalEmployees.Receptionist;
import hospital.nonMedicalEmployees.VampireJanitor;

public class Application {

	public static void main(String[] args) {

		createHighStreetHospital();

	}

	public static void createHighStreetHospital() {
		// Need a hospital
		Hospital hospital = new Hospital();

		// Need some hospital staff
		Surgeon firstSurgeon = new Surgeon("Turk", "004", "Heart");
		Surgeon secondSurgeon = new Surgeon("The Todd", "005", "Brain");
		Doctor firstDoctor = new Doctor("JD", "001", "Heart");
		Doctor secondDoctor = new Doctor("Elliot", "002", "Brain");
		Doctor thirdDoctor = new Doctor("Cox", "003", "General");
		Nurse firstNurse = new Nurse("Carla", "009");
		Nurse secondNurse = new Nurse("Laverne", "109");
		Receptionist firstReceptionist = new Receptionist("Ted", "006");
		Janitor firstJanitor = new Janitor("Janitor", "007");
		VampireJanitor firstVampireJanitor = new VampireJanitor("Kelso", "008");

		hospital.addEmployee(firstSurgeon);
		hospital.addEmployee(secondSurgeon);
		hospital.addEmployee(firstDoctor);
		hospital.addEmployee(secondDoctor);
		hospital.addEmployee(thirdDoctor);
		hospital.addEmployee(firstNurse);
		hospital.addEmployee(secondNurse);
		hospital.addEmployee(firstReceptionist);
		hospital.addEmployee(firstJanitor);
		hospital.addEmployee(firstVampireJanitor);

		// Need some patients
		Patient firstPatient = new Patient("Harvey", "1001");
		Patient secondPatient = new Patient("Jill", "2001");
		Patient thirdPatient = new Patient("Jordan", "3001");
		Patient fourthPatient = new Patient("Ben", "4001");
		Patient fifthPatient = new Patient("Dan", "5001");
		Patient sixthPatient = new Patient("T.C.W.", "6001");

		hospital.addPatient(firstPatient);
		hospital.addPatient(secondPatient);
		hospital.addPatient(thirdPatient);
		hospital.addPatient(fourthPatient);
		hospital.addPatient(fifthPatient);
		hospital.addPatient(sixthPatient);
		firstNurse.assignPatient(firstPatient);
		firstNurse.assignPatient(secondPatient);
		firstNurse.assignPatient(thirdPatient);
		secondNurse.assignPatient(fourthPatient);
		secondNurse.assignPatient(fifthPatient);
		secondNurse.assignPatient(sixthPatient);
	}

}
