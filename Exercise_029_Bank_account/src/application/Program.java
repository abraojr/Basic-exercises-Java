package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
	
		 /* In order to register a bank account, it is necessary to inform the account number, the name of the account holder, and the initial
         *deposit amount that the holder deposited when opening the account. This initial deposit amount, however, is optional, that is: 
         *if the holder has no money to deposit at the time of opening his account, the initial deposit will not be made and the initial 
         *balance of the account will, of course, be zero.
         * Important: once a bank account has been opened, the account number can never be changed. The holder's name can be changed (because
         *a person can change his or her name at a wedding, for example).
         * Finally, the account balance cannot be freely changed. There must be a mechanism to protect this. The balance only increases through
         *deposits, and only decreases through withdrawals.For each withdrawal made, the bank charges a fee of U$ 5.00. Note: the account may
         *be left with a negative balance if the balance is not sufficient to make the withdrawal and/or pay the fee.
         * You must make a program that performs the registration of an account, giving the option to be informed or not the initial deposit 
         *amount. Then, make a deposit and then a withdrawal, always showing the account data after each operation.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account acc;

		System.out.print("Enter account number: ");
		int accNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)?: ");
		char answer = sc.next().charAt(0);

		if (answer == 'y' || answer == 'Y') {
			System.out.print("Enter initial deposit value: U$ ");
			double initialDeposit = sc.nextDouble();
			acc = new Account(name, accNumber, initialDeposit);
			System.out.print("\nAccount data:\n" + acc + "\n");
		} 
		else {
			acc = new Account(name, accNumber);
		}

		System.out.print("\nAccount data:\n" + acc + "\n");

		System.out.print("\nEnter a deposit value: U$ ");
		double depositAmount = sc.nextDouble();
		acc.deposit(depositAmount);
		System.out.print("\nUpdated account data: \n" + acc + "\n");

		System.out.print("\nEnter a withdraw value: U$ ");
		double withdrawAmount = sc.nextDouble();
		acc.withdraw(withdrawAmount);
		System.out.print("\nUpdated account data:\n" + acc + "\n");
		sc.close();
	}

}
