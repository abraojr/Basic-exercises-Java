package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {

	/* A company wants to automate the processing of its contracts. The processing of a contract consists in generating the installments to be paid 
     *for that contract, based on the number of months desired.
     * The company uses an online payment service to pay the installments. Online payment services typically charge a monthly interest as well as a 
     *fee per payment.For now, the service hired by the company is Paypal, which applies simple interest of 1% to each installment, plus a payment 
     *rate of 2%.
     * Make a program to read the data of a contract (contract number, contract date, and total value of the contract).Then, the program must read 
     *the number of months for contract installment, and then generate the records of installments to be paid (date and value), being the first 
     *installment to be paid one month after the contract date, the second installment two months after the contract and so on. Do show the data of 
     *the installments on the screen.*/
	
	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter contract data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.next());
		System.out.print("Contract value: ");
		double contractValue = sc.nextDouble();

		Contract contract = new Contract(number, date, contractValue);

		System.out.print("Enter number of installments: ");
		int n = sc.nextInt();

		ContractService contractService = new ContractService(new PaypalService());

		contractService.processContract(contract, n);

		System.out.println("\nINSTALLMENTS:");
		for (Installment x : contract.getInstallments()) {
			System.out.println(x);
		}
		sc.close();
	}
}