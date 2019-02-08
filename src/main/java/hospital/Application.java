package hospital;

import hospital.medicalEmployees.Doctor;
import hospital.medicalEmployees.Nurse;
import hospital.medicalEmployees.Surgeon;
import hospital.nonMedicalEmployees.Janitor;
import hospital.nonMedicalEmployees.Receptionist;
import hospital.nonMedicalEmployees.VampireJanitor;

public class Application {

	public static void main(String[] args) {

		// Need a hospital
		Hospital hospital = new Hospital();

		// Need some hospital staff
		Employee firstSurgeon = new Surgeon("Turk", "123", "Heart");
		Employee secondSurgeon = new Surgeon("The Todd", "345", "Brain");
		Employee firstDoctor = new Doctor("JD", "234", "Heart");
		Employee secondDoctor = new Doctor("Elliot", "456", "Brain");
		Employee thirdDoctor = new Doctor("Cox", "567", "General");
		Employee firstNurse = new Nurse("Carla", "678");
		Employee firstReceptionist = new Receptionist("Laverne", "789");
		Employee firstJanitor = new Janitor("Janitor", "890");
		Employee firstVampireJanitor = new VampireJanitor("Kelso", "901");

		hospital.addEmployee(firstSurgeon);
		hospital.addEmployee(secondSurgeon);
		hospital.addEmployee(firstDoctor);
		hospital.addEmployee(secondDoctor);
		hospital.addEmployee(thirdDoctor);
		hospital.addEmployee(firstNurse);
		hospital.addEmployee(firstReceptionist);
		hospital.addEmployee(firstJanitor);
		hospital.addEmployee(firstVampireJanitor);

		// Test print-out
		System.out.print(hospital.getEmployees());
	}

}
