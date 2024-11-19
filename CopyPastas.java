/* This is for Lab#X.
 * Name: Matthew Houle | Date: November 5th 2024 (Re-done the Lab).
 */

import java.util.Scanner;

public class CopyPastas {
    // GETS USER INPUT AND RETURNS A STRING
    public static String myUserInput(Scanner keyboard, String txt){
        String userInput;
        
        while (true) {
            System.out.print(txt);
            try { // CHECKS TO MAKE SURE THAT THE INPUT IS VALID.
                userInput = keyboard.next(); // RECEIVE USER INPUT.
                break;
            } catch (Exception e) {
                keyboard.next();
                System.out.println();
            }
        }
        
        return userInput;
    }

    // GETS USER INPUT AND RETURNS AN INTENGER
    public static int myIntInput(Scanner keyboard, String txt){
        int userInput;
        
        while (true) {
            System.out.print(txt);
            try { // CHECKS TO MAKE SURE THAT THE INPUT IS VALID.
                userInput = keyboard.nextInt(); // RECEIVE USER INPUT.
                break;
            } catch (Exception e) {
                keyboard.next();
                System.out.println();
            }
        }
        
        return userInput;
    }

    // GETS USER INPUT AND RETURNS A FLOAT
    public static float myFloatInput(Scanner keyboard, String txt){
        Float userInput;
        
        while (true) {
            System.out.print(txt);
            try { // CHECKS TO MAKE SURE THAT THE INPUT IS VALID.
                userInput = keyboard.nextFloat(); // RECEIVE USER INPUT.
                break;
            } catch (Exception e) {
                keyboard.next();
                System.out.println();
            }
        }
        
        return userInput;
    }
    

    // GETS USER INPUT AND RETURNS AN DOUBLE
    public static double myDubInput(Scanner keyboard, String txt){
        double userInput;
            
        while (true) {
            System.out.print(txt);
            try { // CHECKS TO MAKE SURE THAT THE INPUT IS VALID.
                userInput = keyboard.nextDouble(); // RECEIVE USER INPUT.
                break;
            } catch (Exception e) {
                keyboard.next();
                System.out.println();
            }
        }
            
        return userInput;
    }
    public static void main(String[] args){}
}
