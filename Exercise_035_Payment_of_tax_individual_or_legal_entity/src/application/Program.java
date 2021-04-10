package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {
	
	/*Make a program to read the data of N taxpayers (N provided by the user), which can be an individual or a company, and then show the amount of
     *tax paid by each, as well as the total tax collected.The data of individuals are: name, annual income and health expenditures. The data of 
     *legal entity are name, annual income and number of employees. The rules for tax calculation are as follows:
     *Individual: people whose income was below $ 20000.00 pay 15% tax. People with income from $ 20000.00 onwards pay 25% tax. If the person had
     *health expenses, 50% of these expenses are deducted from the tax.
     *Example: a person whose income was $ 50000.00 and had $ 2000.00 in health expenses, the tax stays: (50000 * 25%) - (2000 * 50%)= $ 11500.00 
     *Legal entity: legal entities pay 16% tax. However, if the company has more than 10 employees, it pays 14% tax.
     *Example: a company whose income was $ 400000.00 and has 25 employees, the tax is: 400000 * 14% = $ 56000.00*/


	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)?: ");
			char answer = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();

			if (answer == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpenditures));
			} 
			else {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				list.add(new Company(name, anualIncome, numberOfEmployees));
			}
		}

		System.out.println("\nTAXES PAID: ");
		double sum = 0;
		for (TaxPayer p : list) {
			System.out.println(p);
			sum += p.tax();
		}
		System.out.printf("\nTOTAL TAXES: $ %.2f", sum);
		sc.close();
	}
}