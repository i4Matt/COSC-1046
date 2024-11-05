//THIS PROGRAMS IS APART OF LAB 2.

package Tempurature_and_Sphere_Calculator;

//IMPORTS
import java.util.Scanner; //SCANNER

public class Tempurature {
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
		
		int userInput = 0; // TEMP IN F*
		
		userInput = (int) Math.floor(myUserInput(sc, "Please insert a tempurature in Fahrenheit: ", 80));
		
		int celcOutput = Math.round((userInput - 32) * (5f/9f)); // DOES CALCUALTION AND ROUNDS THE NUMBER.
		System.out.println("\n" + userInput + "*F in Celsius is " + celcOutput + "*C."); // IS OUTPUT.
		
		float score1 = myUserInput(sc, "Please enter Player 1s score: ", 1000);
		float score2 = myUserInput(sc, "Please enter Player 2s score: ", 10000);
		
		float average = (score1+score2)/2;
		
		System.out.println("The average score is: " + average);
		
		
		sc.close();
	}
}
