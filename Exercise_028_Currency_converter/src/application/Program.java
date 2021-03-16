package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {

		/*Make a program to read the dollar quotation, and then a dollar amount to be bought by a person in Reais. 
         *Inform how many Reais the person will pay for the dollars, also considering that the person will have to pay 6% IOF
         *on the dollar amount*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("What is the dollar price?: ");
		double dollarPrice = sc.nextDouble();
		System.out.print("\nHow many dollars will be bought?: ");
		double amount = sc.nextDouble();
		double amountToPay = CurrencyConverter.dollarToReal(dollarPrice, amount);

		System.out.printf("\nAmount to be paid in reais = %.2f", amountToPay);
		sc.close();
	}

}
