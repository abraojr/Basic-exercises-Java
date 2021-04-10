package entities;

public class Individual extends TaxPayer {

	private double healthExpenditures;

	public Individual() {
		super();
	}

	public Individual(String name, Double anualIncome, double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double tax() {
		double tax = 0;
		if (getAnualIncome() >= 20000.0) {
			tax = (getAnualIncome() * 0.25) - (healthExpenditures * 0.50);
		} 
		else {
			tax = (getAnualIncome() * 0.15) - (healthExpenditures * 0.50);
		}
		return tax;
	}

	@Override
	public String toString() {
		return getName() + ": $ " + String.format("%.2f", tax());
	}
}