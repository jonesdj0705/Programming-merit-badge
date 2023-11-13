import java.lang.Math;
import java.util.Scanner;

public class Pig {

	public static void main(String[] args) {
		
		/*
		*	Pig
		*	Goal for the game:  The player rolls a six sided die.
		*	Each time they roll the die, they add the number of points on the cube to their total.
		*	If the player gets to a total of 15 or more points, they win. If the player rolls a 6, they lose.
		*/
		
		
		// Beginning of program
		Scanner scan = new Scanner(System.in);
		// TODO Print (a) message(s) that tell the user the rules of the game.
				
		// TODO Print a message that asks the user for their name
		
		// TODO Get their name from the console/terminal, and save it to a String variable.

		
		// Declare variables
		int rollThisTurn = 0;
		String decision = "y";
		int score = 0;
		
		
		/*
		*	Game while loop
		*	Runs the main logic of the game.
		*	Tip:  == doesn't work with Strings!  To compare strings, you need to use the equals() method.
		*/

		// TODO modify this while loop.  It should keep running while the score is less than 15, and the user entered 'y' as their decision.
		while ( () && () ) {
			// TODO Call roll() to 'roll the dice', and save the output of roll() to rollThisTurn.

			// TODO Did we roll a 6 this turn?  If so, break out of this while loop.

			// TODO Add the roll's value to score

			// TODO Print a message to the console informing the user of their current score.

			// TODO Print a message to the console asking the user if they'd like to take another turn.

			// TODO Get the user's input, and save that into the 'decision variable'

		}
		
		/*
		*	Handle results.
		*	Once we've broken out of the game while loop, the game is over.  We now need to check what happened in the game, and respond accordingly.
		*/

		// TODO Did the user lose?  If so, print a message telling them that they lost, close the scanner, and end the program.

		// TODO Did the user not want to continue playing?  If so, print a message thanking them for playing, close the scanner, and end the program.

		// TODO If the program gets here, that means that the user won.  Print a message congraulating them for winning.
		
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
