package hospital;

public abstract class Employee {

	private String name;
	private String numID;

	public Employee(String name, String numID) {
		this.name = name;
		this.numID = numID;
	}

	public String getName() {
		return name;
	}

	public String getIDNumber() {
		return numID;
	}

	public abstract String calculatePay();

	@Override
	public abstract String toString();

}