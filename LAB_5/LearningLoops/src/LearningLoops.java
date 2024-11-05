/* This is for Lab#5.
 * Name: Matthew Houle | Date: November 5th 2024 (Re-done the Lab).
 */

// IMPORTS
import java.util.Scanner;

public class LearningLoops {
    public static void main(String[] args){
        // GENERAL VARIABLES
        Scanner keyboard = new Scanner(System.in);
        int userInput;
        
        //  GET A INTENGER FROM THE USER.
        System.out.print("Please enter an Intenger: ");
        userInput = keyboard.nextInt();

        // CLOSE THE SCANNER
        keyboard.close();

        // TASK 1 STARTS HERE //\\//\\ //=\\ //\\//\\
        // SPACING AND NOTATION.
        System.out.println();
        System.out.println("----- Task 1 -----");
        
        // COUNTS FROM 1 TO THE USER INPUT IN ONE LINE.
        for(int i = 1; i <= userInput; i++){
            System.out.print(i + " ");
        }
        System.out.println();

        // TASK 2 STARTS HERE //\\//\\ //=\\ //\\//\\
        // VARIABLES
        int whileCount = userInput;

        // SPACING AND NOTATION.
        System.out.println();
        System.out.println("----- Task 2 -----");
        
        // COUNTS FROM THE USER INPUT TO 1 IN ONE LINE.
        while(whileCount != 0){
            System.out.print(whileCount + " ");
            whileCount--;
        }
        System.out.println();

        // TASK 3 STARTS HERE //\\//\\ //=\\ //\\//\\
        // VARIABLES
        int doWhileCount = 2;

        // SPACING AND NOTATION.
        System.out.println();
        System.out.println("----- Task 3 -----");

        do{
            if (doWhileCount <= userInput) {
                System.out.print(doWhileCount + " ");
            }
            doWhileCount += 2;
        }while(doWhileCount <= userInput);
        System.out.println();

        // TASK 4 STARTS HERE //\\//\\ //=\\ //\\//\\
        // SPACING AND NOTATION.
        System.out.println();
        System.out.println("----- Task 4 -----");

        for (int i = 7; i <= userInput; i += 7){
            System.out.print(i + " ");
        }
        System.out.println();

        // TASK 5 STARTS HERE //\\//\\ //=\\ //\\//\\
        // SPACING AND NOTATION.
        System.out.println();
        System.out.println("----- Task 5 -----");

        for (int i = 1; i <= 10; i++){
            System.out.print((i * userInput) + " ");
        }
        System.out.println();

        // PATTERN A STARTS HERE //\\//\\ //=\\ //\\//\\
        // SPACING AND NOTATION.
        System.out.println();
        System.out.println("----- Pattern A -----");

        for (int i = 1; i <= 6; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // PATTERN B STARTS HERE //\\//\\ //=\\ //\\//\\
        // SPACING AND NOTATION.
        System.out.println();
        System.out.println("----- Pattern B -----");

        for (int i = 6; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
