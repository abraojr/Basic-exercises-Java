package entities;

public class Account {

	public static final double TAX = 5.0;
	private String name;
	private int numberAccount;
	private double balance;

	public Account(String name, int numberAccount, double initialDeposit) {
		this.name = name;
		this.numberAccount = numberAccount;
		deposit(initialDeposit);
	}

	public Account(String name, int numberAccount) {
		this.name = name;
		this.numberAccount = numberAccount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberAccount() {
		return numberAccount;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount + TAX;
	}

	public String toString() {
		return "Account " + getNumberAccount() + ", Holder: " + getName() + ", Balance: U$ "
				+ String.format("%.2f", getBalance());
	}
}
