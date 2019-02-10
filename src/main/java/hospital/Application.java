package hospital;

import java.util.Scanner;

import hospital.medicalEmployees.Doctor;
import hospital.medicalEmployees.Nurse;
import hospital.medicalEmployees.Surgeon;
import hospital.nonMedicalEmployees.Janitor;
import hospital.nonMedicalEmployees.Receptionist;
import hospital.nonMedicalEmployees.VampireJanitor;

public class Application {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

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
		Patient sixthPatient = new Patient("TCW", "6001");

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

		// Need a turn counter
		int loopCount = 0;

		boolean mainMenu = true;
		while (mainMenu) {

			loopCount += 1;
			// Need a way to halt dirt if sweeping is true
			hospital.soilHospitalByFive(loopCount);
			for (Patient patient : hospital.getPatients()) {
				patient.conditionWorsens(loopCount);
			}
			for (Employee employee : hospital.getEmployees()) {
				if (employee instanceof VampireJanitor) {
					((VampireJanitor) employee).dehydratesByOne(loopCount);
				}
			}

			System.out.println("\nHIGH STREET HOSPITAL");
			System.out.println("ELECTRONIC MANAGEMENT SYSTEM");
			System.out.println("\n1. Staff directory");
			System.out.println("2. Patient status");
			System.out.println("3. Building status");
			System.out.println("4. Assign staff");
			System.out.println("5. Payroll");
			System.out.println("6. Exit");

			String mainMenuSelection = input.nextLine();

			switch (mainMenuSelection) {
			case "1":
				System.out.println("\nSTAFF DIRECTORY");
				System.out.println(hospital.getEmployees());
				break;
			case "2":
				System.out.println("\nPATIENT STATUS");
				System.out.println("\nBed capacity: " + hospital.getPatientCount() + " patients");
				System.out.println(hospital.getPatients());
				break;
			case "3":
				System.out.println("\nBUILDING STATUS");
				System.out.println("\nHospital is " + hospital.getCleanliness() + "% clean.");
				break;
			case "4":
				boolean taskMenu = true;
				while (taskMenu) {

					loopCount += 1;
					// Need a way to halt dirt if sweeping is true
					hospital.soilHospitalByFive(loopCount);
					for (Patient patient : hospital.getPatients()) {
						patient.conditionWorsens(loopCount);
					}
					for (Employee employee : hospital.getEmployees()) {
						if (employee instanceof VampireJanitor) {
							((VampireJanitor) employee).dehydratesByOne(loopCount);
						}
					}

					System.out.println("\nPEOPLE MOVER 3000TM");
					System.out.println("1. Draw blood for testing");
					System.out.println("2. Administer Patient Care");
					System.out.println("3. Send Patient to Surgery");
					System.out.println("4. Clean Hospital");
					System.out.println("5. Return to RECORDS MANAGEMENT SYSTEM");

					String taskMenuSelection = input.nextLine();

					switch (taskMenuSelection) {
					case "1":
						System.out.println("\n From which patient would you like to draw blood?");
						System.out.println(hospital.getPatients());
						System.out.println("\nEnter Patient ID:");
						String bloodPatientID = input.nextLine();
						Patient bloodDrawPatient = hospital.findPatient(bloodPatientID);

						// Find nurse assigned to patient to draw blood
						for (Employee employee : hospital.getEmployees()) {
							if (employee instanceof Nurse) {
								for (Object patient : ((Nurse) employee).getPatientAssignments()) {
									if (patient.equals(bloodDrawPatient)) {
										((Nurse) employee).drawBlood(bloodDrawPatient);
										System.out.println(employee.getName() + " successfully drew blood from Patient "
												+ bloodDrawPatient.getPatientID() + ", " + bloodDrawPatient.getName()
												+ ".\nPatient's blood level is " + bloodDrawPatient.getBloodLevel()
												+ ".");
									}
								}
							}
						}
						break;
					case "2":
						System.out.println(
								"\nDoctors can administer care to one patient and return all vitals to healthy levels."
										+ "\nNurses can administer care to all assigned patients, but are not authorized to replenish blood.");
						System.out.println("\nWhich medical personnel would you like to assign to patient care?");
						
						// Provide list of Doctors & Nurses+patients only
						for (Employee employee : hospital.getEmployees()) {
							if (employee instanceof Doctor) {
								System.out.print(((Doctor) employee).toString());
							} else if (employee instanceof Nurse) {
								System.out.print(((Nurse) employee).toString());
							}
						}
						System.out.println("\nEnter Employee ID:");
						String employeeID = input.nextLine();
						Employee careProvider = hospital.findEmployee(employeeID);
						
						// Determine the type of care provided based on employee choice
						if (careProvider instanceof Doctor) {
							System.out.println(
									"To which patient will Doctor " + careProvider.getName() + " administer care?");
							System.out.println(hospital.getPatients());
							System.out.println("\nEnter Patient ID:");
							String carePatientID = input.nextLine();
							Patient carePatient = hospital.findPatient(carePatientID);
							((Doctor) careProvider).administerCare(carePatient);
							System.out.println("\nDoctor " + careProvider.getName() + " restored Patient "
									+ carePatient.getName() + " to full health.");
							System.out.println("\nUPDATED PATIENT STATUS: " + carePatient.toString());
						} else if (careProvider instanceof Nurse) {
							((Nurse) careProvider).careForPatients(((Nurse) careProvider).getPatientAssignments());
							System.out.println(
									"Patients assigned to Nurse " + careProvider.getName() + " have been treated.");
							System.out.println("\nUPDATED PATIENT STATUS:");
							System.out.println(((Nurse) careProvider).getPatientAssignments());
						}
						break;
					case "3":
						// keep surgery true for limited loopCount (?)
						// keep patient in surgery (?)
						break;
					case "4":
						// Need a way to halt dirt if sweeping is true
						break;
					case "5":
						taskMenu = false;
						break;
					}

					testForCleanliness(hospital);

					testForPatientHealth(hospital);
				}
				break;
			case "5":
				System.out.println("\nHOSPITAL PAYROLL");
				for (Employee employee : hospital.getEmployees()) {
					System.out.println("Employee " + employee.getEmployeeID() + " (" + employee.getName() + "): "
							+ employee.calculatePay() + " annually.");
				}
				break;
			case "6":
				System.out.println("\nGOODBYE");
				mainMenu = false;
				System.exit(0);
				break;
			}

			testForCleanliness(hospital);

			testForPatientHealth(hospital);

		}
	}

	public static void testForPatientHealth(Hospital hospital) {
		for (Patient patient : hospital.getPatients()) {
			if (patient.getHealthLevel() <= 5 && patient.getHealthLevel() > 0) {
				System.out.println("Patient " + patient.getPatientID() + ", " + patient.getName()
						+ ", is no longer in stable condition.");
			} else if (patient.getHealthLevel() <= 0) {
				System.out.println("Patient " + patient.getPatientID() + ", " + patient.getName()
						+ ", is crashing. Assign medical personnel to adminsiter care immediately.");
			}
			if (patient.getBloodLevel() <= 10 && patient.getBloodLevel() > 0) {
				System.out.println("Patient " + patient.getPatientID() + ", " + patient.getName()
						+ ", has dangerously low blood supply.");
			} else if (patient.getBloodLevel() <= 0) {
				System.out.println("Patient " + patient.getPatientID() + ", " + patient.getName()
						+ ", has lost too much blood. Assign medical personnel to adminsiter care immediately.");
			}
		}
	}

	public static void testForCleanliness(Hospital hospital) {
		if (hospital.getCleanliness() <= 50 && hospital.getCleanliness() > 0) {
			System.out.println("High St. Hospital is dirty. Assign janitorial staff to maintain cleanliness.");
		} else if (hospital.getCleanliness() <= 0) {
			System.out.println("Hight St. Hospital is too dirty. It is no longer sanitary to adminsiter patient care.");
			System.exit(0);
		}
	}
}
