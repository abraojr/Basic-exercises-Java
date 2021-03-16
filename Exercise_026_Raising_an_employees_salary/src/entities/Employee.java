package entities;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;

	public double netSalary() {
		return grossSalary - tax;
	}

	public void increaseSalary(double percent) {
		grossSalary += (percent / 100) * grossSalary;
	}

	public String toString() {
		return name + ", U$ " + String.format("%.2f", netSalary());
	}
}