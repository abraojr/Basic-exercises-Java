package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
	
	/*In an online course portal, each user has a unique code, represented by an integer.
     *Each instructor of the portal can have several courses, and the same student can enroll in as many courses as he/she wants. Thus, the total 
     *number of students of an instructor is not simply the sum of the students of all the courses that he has, because there can be repeated 
     *students in more than one course.
     *Instructor Alex has three courses A, B and C, and wants to know his total number of students.
     *The program should read students from Instructor Alex's A, B and C courses, then show the total amount and students of it*/

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int n = sc.nextInt();
		for (int i=0; i<n; i++) {
			int number = sc.nextInt();
			a.add(number);
		}

		System.out.print("How many students for course B? ");
		n = sc.nextInt();
		for (int i=0; i<n; i++) {
			int number = sc.nextInt();
			b.add(number);
		}

		System.out.print("How many students for course C? ");
		n = sc.nextInt();
		for (int i=0; i<n; i++) {
			int number = sc.nextInt();
			c.add(number);
		}
		
		Set<Integer> total = new HashSet<>(a);
		total.addAll(b);
		total.addAll(c);

		System.out.println("Total students: " + total.size());

		sc.close();
	}
}