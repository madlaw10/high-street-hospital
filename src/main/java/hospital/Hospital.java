package hospital;

import java.util.Collection;
import java.util.HashMap;

public class Hospital {

	private HashMap<String, Employee> employees = new HashMap<String, Employee>();

	public int getEmployeeCount() {
		return employees.size();
	}

	public void addEmployee(Employee newEmployee) {
		employees.put(newEmployee.getIDNumber(), newEmployee);
	}

	public Collection<Employee> getEmployees() {
		return employees.values();
	}

}
