package hospital.medicalEmployees;

import java.util.ArrayList;

import hospital.Employee;
import hospital.Patient;
import hospital.interfaces.administersCare;
import hospital.interfaces.caresForMultiplePatients;
import hospital.interfaces.drawsBlood;
import hospital.interfaces.hasHealth;

public class Nurse extends Employee implements drawsBlood, administersCare, caresForMultiplePatients {

	// Each nurse has a Collection of Patient(s)
	private ArrayList<Object> patientAssignments = new ArrayList<Object>();

	public Nurse(String name, String employeeID) {
		super(name, employeeID);
	}

	public ArrayList<Object> getPatientAssignments() {
		return patientAssignments;
	}

	public int getAssignmentCount() {
		return patientAssignments.size();
	}

	public void assignPatient(Object patient) {
		patientAssignments.add(patient);
	}

	@Override
	public String calculatePay() {
		return "$50,000";
	}

	@Override
	public String toString() {
		return "\nNurse " + getName() + ", ID Number: " + getEmployeeID() + ", Assigned: " + patientAssignments;
	}

	@Override
	public void administerCare(Patient patient) {
		patient.returnHealthToTen();
	}

	@Override
	public void drawBlood(Patient patient) {
		patient.drainBloodByOne();
	}

	@Override
	public void careForPatients(ArrayList<Object> patientAssignments) {
		((hasHealth) patientAssignments).returnHealthToTen();
	}

}
