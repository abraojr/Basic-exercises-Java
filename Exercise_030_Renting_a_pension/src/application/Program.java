package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Rent;

public class Program {

	public static void main(String[] args) {

		  /* The owner of a boarding house has ten rooms to rent for students, these rooms being identified by the numbers 0 to 9.When 
         *a student wants to rent a room, one must register the name and email of this student.Make a program that starts with all ten 
         *empty rooms, and then read an N amount representing the number of students that will rent rooms (N can be from 1 to 10).Then, 
         *register the N students' rent. For each rental registration, inform the name and email of the student, as well as which of the 
         *rooms he chose (from 0 to 9). Suppose a vacant room is chosen.At the end, your program must print a report of all occupations of
         *the boarding house, in order of room*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rent[] vect = new Rent[10];

		System.out.print("How many rooms will be rented?: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.printf("\nRent #%d%n", i);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vect[room] = new Rent(name, email, room);
		}

		System.out.println("\nBusy rooms:");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				System.out.println(vect[i]);
			}
		}
		sc.close();
	}
}
