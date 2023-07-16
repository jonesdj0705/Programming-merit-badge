import java.lang.Math;
import java.util.Scanner;

public class Pig {

	public static void main(String[] args) {
		
		// Beginning of program
		Scanner scan = new Scanner(System.in);
		// TODO get user's name
		
		
		// Declare variables
		int rollThisTurn = 0;
		String decision = "y";
		int score = 0;
		
		
		// Game while loop
		while () {
			// TODO
		}
		
		
		// Output results
		// TODO
		
		
		// End program
		scan.close();		

	}
	
	/*
	 * This function will generate a random integer number between 1 - 6 (simulating a roll of a number cube).
	 */
	public static int roll() {
		return (int) (Math.random() * 6) + 1;
	}

}
