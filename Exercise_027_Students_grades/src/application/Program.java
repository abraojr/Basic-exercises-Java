package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Program {

	public static void main(String[] args) {

		/*
		 * Make a program to read a student's name and the three grades he obtained in
		 * the three quarters of the year (first quarter is worth 30 and the second and
		 * third are worth 35 each). At the end, show the student's final grade in the
		 * year. Also say whether the student was APROVED or REPROVED and, if its
		 * reproved, how many points are left for the student to obtain the minimum to
		 * pass (which is 60 points).
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student s = new Student();
		System.out.print("Name: ");
		s.name = sc.nextLine();
		System.out.print("Grade on the first quarter (<=30): ");
		s.grade1 = sc.nextDouble();
		System.out.print("Grade on the second quarter (<=35): ");
		s.grade2 = sc.nextDouble();
		System.out.print("Grade on the third quarter (<=35): ");
		s.grade3 = sc.nextDouble();

		System.out.printf("\nFINAL GRADE = %.2f%n", s.finalGrade());

		if (s.finalGrade() < 60) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", s.missingPoints());
		} 
		else
			System.out.println("PASS");

		sc.close();
	}
}
