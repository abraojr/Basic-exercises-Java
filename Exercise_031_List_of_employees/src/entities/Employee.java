package entities;

public class Employee {

	private Integer id;
	private String name;
	private Double salary;

	public Employee() {
	}

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public void increaseSalary(double percent) {
		salary += salary * (percent / 100.0);
	}

	public String toString() {
		return getId() + ", " + getName() + ", " + String.format("%.2f", getSalary());
	}
}
