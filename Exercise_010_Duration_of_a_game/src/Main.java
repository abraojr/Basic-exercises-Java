import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Read the start and end time of a game. Then calculate the duration of the
		 * game, knowing that it can start on one day and end on another, having a
		 * minimum duration of 1 hour and maximum of 24 hours.
		 */

		Scanner sc = new Scanner(System.in);

		int A, B, totDuration;

		A = sc.nextInt();
		B = sc.nextInt();

		if (A > B) {
			totDuration = 24 - A + B;
			System.out.printf("THE GAME LASTED %d HOUR(S)", totDuration);
		} 
		else if (B > A) {
			totDuration = B - A;
			System.out.printf("THE GAME LASTED %d HOUR(S)", totDuration);
		}
		else {
			System.out.println("THE GAME LASTED 24 HOUR(S)");
		}
		sc.close();
	}
}
