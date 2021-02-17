import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*Write a program that repeats reading a password until it is valid. For each incorrect password reading entered,
         * write an "Invalid password" message. When the password for correct information must be printed the message "Access Allowed" 
         * and the algorithm terminated. Consider that the correct password is the 2002 value.*/
		
		Scanner sc = new Scanner(System.in);

		int x;

		System.out.print("Enter a password: ");
		x = sc.nextInt();

		while (x != 2002) {
			System.out.println("INVALID PASSWORD!!!");
			System.out.print("Enter a password: ");
			x = sc.nextInt();
		}
		System.out.println("ACCESS ALLOWED");
		sc.close();
	}
}
