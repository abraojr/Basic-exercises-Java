package entities;

public class Company extends TaxPayer {

	private Integer numberOfEmployee;

	public Company() {
		super();
	}

	public Company(String name, Double anualIncome, Integer numberOfEmployee) {
		super(name, anualIncome);
		this.numberOfEmployee = numberOfEmployee;
	}

	public Integer getNumberOfEmployee() {
		return numberOfEmployee;
	}

	public void setNumberOfEmployee(Integer numberOfEmployee) {
		this.numberOfEmployee = numberOfEmployee;
	}

	@Override
	public Double tax() {
		double tax = 0;
		if (numberOfEmployee > 10) {
			tax = getAnualIncome() * 0.14;
		} 
		else {
			tax = getAnualIncome() * 0.16;
		}
		return tax;
	}

	@Override
	public String toString() {
		return getName() + ": $ " + String.format("%.2f", tax());
	}
}