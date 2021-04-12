package application;

import java.util.Locale;
import java.util.Scanner;
import model.entities.Account;
import model.exceptions.DomainException;

public class Program {
	
	 /*Make a program to read the data of a bank account and then make a withdrawal in this bank account, showing the new balance. A withdrawal cannot
     *occur either if there is no balance in the account, or if the amount of the withdrawal is greater than the account withdrawal limit.*/

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter account data:");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			double initialBalance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			System.out.print("\nEnter amount for withdraw: ");
			double amount = sc.nextDouble();

			Account acc = new Account(number, holder, initialBalance, withdrawLimit);
			acc.withdraw(amount);
			System.out.println(acc);
		} 
		catch (DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		} 
		catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}
		sc.close();
	}
}