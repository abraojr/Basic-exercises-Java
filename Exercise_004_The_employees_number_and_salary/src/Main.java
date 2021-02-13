import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Make a program that reads the number of an employee, his number of hours
		 * worked, the amount he receives for hour and calculate that employee's salary.
		 * Then show the employee's number and salary, to two decimal places.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int empNumber, hrWorked;
		double salaryHr, totSalary;

		System.out.print("Employee Number: ");
		empNumber = sc.nextInt();
		System.out.print("Number of hours worked: ");
		hrWorked = sc.nextInt();
		System.out.print("Hourly wage: ");
		salaryHr = sc.nextDouble();

		totSalary = hrWorked * salaryHr;

		System.out.printf("NUMBER = %d%n", empNumber);
		System.out.printf("SALARY = U$ %.2f", totSalary);
		sc.close();
	}
}
