// --- IMPORTS --- //
import java.util.Scanner;

public class app {

    // --- CALCULATIONS START --- //

    // WIRE RESISTANCE
    public static double wireResistanceCalc(double resistivity, int length, double diameter){
        return (4 * resistivity * length) / (Math.PI * Math.pow(diameter, 2));
    }

    // CALCULATION OF THE DIAMETER OF THE WIRE USING AMERICAN WIRE GAUGE NUMBER.
    public static double awgCalc(float AWG){
        return 0.127 * Math.pow(92, ((36-AWG) / 39));
    }

    // --- CALCULATIONS FINISH --- //



    // --- SCANNERS START --- //

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

    // --- SCANNERS FINISH --- //



    // --- MAIN PROGRAM START --- //
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        double copperWireResistivity = 1.68 * Math.pow(10, -8);
        double aluminumWireResistivity = 2.82 * Math.pow(10, -8);

        int awgInput = myIntInput(keyboard, "Please enter the American Wire gauge for your wire: ");
        int lengthInput = myIntInput(keyboard, "Please enter the length of you wire: ");
        double awgResult = awgCalc(awgInput);

        System.out.println("Diameter of thte wire is: " + awgResult);
        System.out.println("Resistance in copper is: " + wireResistanceCalc(copperWireResistivity, lengthInput, awgResult));
        System.out.println("Resistance in aluminum is: " + wireResistanceCalc(aluminumWireResistivity, lengthInput, awgResult));

        keyboard.close();
    }
}