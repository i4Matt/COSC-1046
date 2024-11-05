package Tempurature_and_Sphere_Calculator;

//TASK #2 Add import statement here to use the Scanner class
import java.util.Scanner;
//TASK #2 (Alternate) Add import statement to use JOptionPane class

/**
* This program demonstrates how numeric types and operators behave
*/
public class NumericTypes {
 public static void main(String[] args) {
     // TASK #2 Create a Scanner object here (not used for alternate)
	 Scanner keyboard = new Scanner(System.in);
     // Identifier declarations
     final int NUMBER = 2; // number of scores
     final int SCORE1 = 100; // first test score
     final int SCORE2 = 95; // second test score
     final int BOILING_IN_F = 212; // boiling temperature in Fahrenheit
     int fToC; // temperature in Celsius
     double average; // arithmetic average
     String output; // line of output to print out

     // TASK #2 declare variables used here
     String firstName, lastName, fullName;
     // TASK #3 declare variables used here
     // TASK #4 declare variables used here

     // Find an arithmetic average
     average = (SCORE1 + SCORE2) / (double) NUMBER;
     output = SCORE1 + " and " + SCORE2 + " have an average of " + average;
     System.out.println(output);

     // Convert Fahrenheit temperatures to Celsius
     fToC = 5 / 9 * (BOILING_IN_F - 32);
     output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";
     System.out.println(output);
     System.out.println(); // to leave a blank line

     // ADD LINES FOR TASK #2 HERE
     // prompt the user for first name
     System.out.print("Please enter your first name: ");
     // read the user’s first name
     firstName = keyboard.next();
     // prompt the user for last name
     System.out.print("Please enter your last name: ");
     // read the user’s last name
     lastName = keyboard.next();
     // concatenate the user’s first and last names
     fullName = firstName + " " + lastName;
     // print out the user’s full name
     System.out.println("Hello " + fullName);

     System.out.println(); // to leave a blank line

     // ADD LINES FOR TASK #3 HERE
     // get the first character from the user’s first name
     // print out the user’s first initial
     // convert the user’s full name to all capital letters
     // print out the user’s full name in all capital letters
     // and the number of characters in it

     System.out.println(); // to leave a blank line

     // ADD LINES FOR TASK #4 HERE
     // prompt the user for a diameter of a sphere
     // read the diameter
     // calculate the radius
     // calculate the volume
     // print out the volume
 }
}

