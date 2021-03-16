package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Program {

	public static void main(String[] args) {

		/*
		 * Make a program to read an employee's data (name, gross salary and tax). Then,
		 * show the employee data (name and net salary). Then, increase the employee's
		 * salary based on a given percentage (only the gross salary is affected by the
		 * percentage) and show the employee's data again.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee e = new Employee();
		System.out.print("Name: ");
		e.name = sc.nextLine();
		System.out.print("Gross salary: U$ ");
		e.grossSalary = sc.nextDouble();
		System.out.print("Tax: U$ ");
		e.tax = sc.nextDouble();

		System.out.println("\nEmployee: " + e);

		System.out.print("\nWhich percentage to increase salary?: ");
		double percent = sc.nextDouble();
		e.increaseSalary(percent);

		System.out.print("\nUpdated data: " + e);
		sc.close();
	}
}
