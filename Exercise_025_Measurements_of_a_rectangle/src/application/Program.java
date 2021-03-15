package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;

public class Program {

	public static void main(String[] args) {

		//Make a program to read the values of the width and height of a rectangle. Then show the value of your area,perimeter and diagonal on the screen.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rectangle r = new Rectangle();

		System.out.println("Enter rectangle width and height:");
		r.width = sc.nextDouble();
		r.height = sc.nextDouble();

		System.out.println(r);

		sc.close();

	}

}
