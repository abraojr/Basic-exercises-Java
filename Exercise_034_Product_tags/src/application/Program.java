package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {
	
	/*Make a program to read the data of N products (N provided by the user). At the end, show the price tag of each product in the same order 
     *they were typed.Every product has name and price. Imported products have a customs fee, and used products have a manufacturing date. These
     *specific data must be added to the price tag.For imported products, the customs fee must be added to the final price of the product.*/

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char answer = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();

			if (answer == 'c') {
				list.add(new Product(name, price));
			} 
			else if (answer == 'i') {
				System.out.print("Custom fee: ");
				double customFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customFee));
			} 
			else {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(sc.next());
				list.add(new UsedProduct(name, price, manufactureDate));
			}
		}
		System.out.println("\nPRICE TAGS:");
		for (Product p : list) {
			System.out.println(p.priceTag());
		}
		sc.close();
	}
}