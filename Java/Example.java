import java.util.Scanner;

public class Example {

    public static void main(String[] args){
        
        // Printing to the console.
        System.out.println("This command is used to print to the console.");
        System.out.println("This is how you print " + "with multiple arguments.");

        // Variables.
        // Primitives start with a lower case.  In Java, primitives are integers (int), booleans (boolean).  For this MB, we'll just use ints and booleans.
        int a = 1;
        int b = 2;
        boolean tVar = true;
        boolean fVar = false;
        // Strings are considered objects in Java.  For objects, the first character is capitalized (it's 'String', not 'string')
        String myName = "David Jones";
        String anotherStr = "Programming";
        // Printing to the console with variables and Strings
        System.out.println("This line was written by " + myName + " for the " + anotherStr + " merit badge.");

        /* 
        *   If, else if, else statements
        *   x == y:  true if x equals y
        *   x != y:  true if x doesn't equal y
        *   x > y:  true if x is greater than y
        *   x >= y:  true if x is greater than or equal to y
        *   x < y:  true if x is less than y
        *   x <= y: true if x is less than or equal to y
        */        

        // In Java, you have to put parentheses in your if statements
        if (a == 1) {
            System.out.println("Btw, a = 1.");
        }

        // Example of use of else if:
        if (a != 1) {
            System.out.println("Huh, a != 1 here...");
        } else if (b == 2) {
            System.out.println("Well, at least b = 2.");
        }

        // Else
        // The code in the else block runs if none of the other statements returned true (e.g. if the if was false, and so was the else if).
        if (a != 1) {
            System.out.println("Huh, a != 1 here...");
        } else if (b != 2) {
            System.out.println("Well, at least b = 2.");
        } else {
            System.out.println("Oh well, none of these worked.");
        }

        // If statement for Strings:
        // You can't use == for Strings!  == can be used to compare primitives (e.g. ints and booleans), but NOT Strings!!
        // To compare Strings, you need to use the equals method
        if (myName.equals("David Jones")) {
            System.out.println("The author of this code is David Jones.");
        }


        /*
        *   Multiple conditions in the if statement
        *   Put all of the conditions within one ()
        *   && = AND
        *   || = OR
        */

        // && = AND.  Both statements need to be true in order for the block to run.
        if ( (a == 1) && (b == 2) ) {
            System.out.println("Yup, a = 1 and b = 2!");
        }

        if ( (a == 1) && (b == 3) ) {
            System.out.println("a = 1, and b = 3");
        } else {
            System.out.println("One of these is wrong:  a = 1, b = 3!");
        }

        // || = OR.  If one of the conditions is true, then the statement will be true and run the block of code.
        if ( (a == 5) || (b == 2) ) {
            System.out.println("We found that either a == 5, or b == 2.");
        }

        if ( (a == 2) || (b == 3) ) {
            System.out.println("We found that either a == 5, or b == 3.");
        } else {
            System.out.println("A does not equal 2, and b does not equal 3.");
        }

        /*
        *   While loops
        *   A while loop is an if statement that runs on a loop until the condition is no longer true
        *   If you run your code, and it doesn't stop, there's a good chance that it's because the while loop is running forever.
        */

        int i = 5;
        while (i > 0) {
            System.out.println("i = " + i);
            i--;        // Equivalent to i = i - 1.
        }

        i = 0;
        while (i < 5) {
            System.out.println("i = " + i);
            i++;        // Equivalent to i = i + 1.
        }

        
        /*
        *   Getting user input
        *   For this MB, we'll use the Scanner class to get input from the user.
        *   To use Scanner, we create a Scanner object, and use that to get input from the user.
        *   After we're done with the scanner (e.g. at the end of the program), we need to close() the scanner to prevent resource leaks.
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("We're using the scanner now!  Please enter some text:");
        String userInput = scan.nextLine();
        System.out.println("You entered: " + userInput);
        System.out.println("Let's do another.  Please enter some text:");
        userInput = scan.nextLine();    // Note that since we already declared userInput, we don't need to tell Java that it's a String again.
        System.out.println("Here's what you entered the 2nd time:  " + userInput + ".  Ok, we're done with the scanner now.");
        scan.close();   // Remember to close() the scanner when you're done with it!

        /*
        *   Closing the program
        *   When we're done, we can close the program in one of three ways:  return and System.exit(-1);
        *   Go ahead and try the different methods by modifying returnChoice !
        */        
        String returnChoice = "return";
        
        // Using return
        if (returnChoice.equals("return")) {
            System.out.println("We're using return!  Goodbye!");
            return;
        }

        // Using return
        if (returnChoice.equals("System exit")) {
            System.out.println("We're using system exit!  Goodbye!");
            System.exit(-1);
            System.out.println("...Did we print this after the system exit?");
        }
        
        // Doing nothing!
        System.out.println("Ok, we didn't use return or system exit, so we'll just do nothing!  Goodbye!");

    }
}
