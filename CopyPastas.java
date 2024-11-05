import java.util.Scanner;

public class CopyPastas {
    // GETS USER INPUT AND RETURNS A STRING
    public static String myUserInput(String txt){
        Scanner keyboard = new Scanner(System.in);
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
        
        keyboard.close();
        return userInput;
    }

    // GETS USER INPUT AND RETURNS AN INTENGER
    public static int myIntInput(String txt){
        Scanner keyboard = new Scanner(System.in);
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
        
        keyboard.close();
        return userInput;
    }

    // GETS USER INPUT AND RETURNS A FLOAT
    public static float myFloatInput(String txt){
        Scanner keyboard = new Scanner(System.in);
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
        
        keyboard.close();
        return userInput;
    }
    
    public static void main(String[] args){}
}
