package Mileage;

//IMPORTS
import java.util.Scanner;

public class Mileage {
	public static float myUserInput(Scanner input, String txt, int defaultBackup) {
		boolean alive = true;
		int numCatch = 1;
		float userInput = 0;
		
		System.out.println();
		while(alive) {
			System.out.print(txt);
			try { // CHECKS TO MAKE SURE THAT THE INPUT IS VALID.
				userInput = input.nextFloat(); // RECEIVE USER INPUT.
				alive = false;
			}catch(Exception e) {
				System.out.println("This has been executed \n" + e);
				if (numCatch == 3) { // USER INPUT TOO MANY INCORRECT VALUES.
					System.out.println("\nYou have selected the number" + defaultBackup + " .\n");
					userInput = 80;
					alive = false;
				}else { // 3 STRIKES YOU'RE OUT.
					System.out.println("\nPlease insert a valid number.");
					numCatch += 1;
				}
				input.next();
			}
		}
		return userInput;
		/* THERE ONCE WAS A MAN WHO GOT ANNOYED,
		 * AT TYPING THE SAME THING AGAIN AND AGAIN.
		 * HE COULD USE CTRL+C AND CTRL+V,
		 * BUT THAT TAKES UP MORE LINES.
		 * 
		 * HE LEARNED HOW TO DO METHODS,
		 * BUT RAN INTO A WEIRD ERROR.
		 * AFTER SOME GOOGLE SEARCH,
		 * HE JUST USED A NEW VARIABLE.
		 */
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello user, this program will calculate mileage.");
		
		float milesInput = myUserInput(sc, "Please enter the number of miles. \n> ", 2000);
		float gallonsInput = myUserInput(sc, "Please enter the number of gallons used. \n> ", 100);
		
		float gallonsUsed = gallonsInput / milesInput;
		
		System.out.println("Your \"Miles per Gallon\" is: " + gallonsUsed);
		sc.close();
	}
}