// Name: Matthew Houe | Date: November 5th 2024 (Re-done the Lab).

//TASK #2 Add import statement here to use the Scanner class
import java.util.Scanner;
//TASK #2 (Alternate) Add import statement to use JOptionPane class
//import javax.swing.JOptionPane;
/**
 * This program demonstrates how numeric types and operators behave
 */
public class NumericTypes {
    public static void main(String[] args) {
        //TASK #2 Create a Scanner object here
        // (not used for alternate)
        Scanner keyboard = new Scanner(System.in);
        // identifier declarations
        final float NUMBER = 2; // number of scores
        final int SCORE1 = 100; // first test score
        final int SCORE2 = 95; // second test score
        final int BOILING_IN_F = 212; // boiling temperature
        int fToC; // temperature in Celsius
        double average; // arithmetic average
        String output; // line of output to print out

        //TASK #2 declare variables used here
        String firstName, lastName, fullName;

        //TASK #4 declare variables used here
        char firstNameInitial;
        String lastNameUppercase;

        //TASK #5 declare variables used here
        float sphereDiameter, sphereRadius;
        double sphereVolume;
        
        // Find an arithmetic average
        average = (SCORE1 + SCORE2) / NUMBER;
        output = SCORE1 + " and " + SCORE2 + " have an average of " + average;
        System.out.println(output);

        // Convert Fahrenheit temperatures to Celsius
        fToC = (int) Math.round(5f / 9f * (BOILING_IN_F - 32));
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

        //lastName = JOptionPane.showInputDialog(null, "Please enter your last name:");
        // concatenate the user’s first and last names
        fullName = firstName + " " + lastName;

        // print out the user’s full name
        System.out.println("Hello " + fullName);

        System.out.println(); // to leave a blank line

        // ADD LINES FOR TASK #4 HERE
        // get the first character from the user’s first name
        firstNameInitial = firstName.charAt(0);

        // print out the user’s first initial
        System.out.println("First Name Initial: " + firstNameInitial);

        // convert the user’s full name to all capital letters
        lastNameUppercase = lastName.toUpperCase();

        // print out the user’s full name in all capital letters and the number of characters in it
        System.out.println("Last Name Capitalized: " + lastNameUppercase);

        System.out.println(); // to leave a blank line

        // ADD LINES FOR TASK #5 HERE
        // prompt the user for a diameter of a sphere
        System.out.print("Please give me the diameter of a sphere: ");

        // read the diameter
        sphereDiameter = keyboard.nextFloat();

        // calculate the radius
        sphereRadius = sphereDiameter / 2f;

        // calculate the volume
        sphereVolume = (4f/3f) * Math.PI * Math.pow(sphereRadius, 3); 
        
        // print out the volume
        System.out.println("Volume of sphere: " + sphereVolume);

        keyboard.close();
    }
}
