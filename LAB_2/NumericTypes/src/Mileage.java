/* This is for Lab#2.
 * This program is used for calculating the Miles per Galons used.
 * Name: Matthew Houle | Date: November 5th 2024 (Re-done the Lab).
 */

// IMPORTS
import java.util.Scanner;

public class Mileage {
    public static void main(String[] args){
        // TASK 6 VARIABLES
        Scanner keyboard = new Scanner(System.in);
        float milesDriven, gallonsUsed, milesPerGallon;

        // TASK 6 STARS HERE
        // EXPLAINES THE PURPOSE OF THIS PROGRAM.
        System.out.println("Hello, this program is going to calculate your miles per gallon.");
        
        // PROMPTING THE USER ASKING HOW MANY MILES DRIVEN.
        System.out.print("Please enter the amount of miles driven: ");
        milesDriven = keyboard.nextFloat();

        // PRIMPTING THE USER ASKING HOW MANY GALONS USED.
        System.out.print("Please enter the amount of galons used: ");
        gallonsUsed = keyboard.nextFloat();

        // CALCULATES THE MILES PER GALLON.
        milesPerGallon = milesDriven / gallonsUsed;

        // PRINTING RESULTS.
        System.out.println("You've driven " + milesDriven + " miles and used " + gallonsUsed + " gallones of fule for a Miles per Gallon of " + milesPerGallon);

        // CLOSE THE SCANNER
        keyboard.close();
    }

    /* Miles Driven     | 2000.0 | 500.0 | 241.5 | 100.0
     * Gallongs Used    |  100.0 |  25.5 |  10.0 |   0.0
     * Miles Per Gallon |   20.0 |  19.6 |  24.2 | Infinity
     * Hand Calculated  |   20.0 |  19.6 |  24.2 | Non Div.
     */
}
