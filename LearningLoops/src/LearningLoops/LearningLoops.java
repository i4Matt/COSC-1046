package LearningLoops;

import java.util.Scanner;

public class LearningLoops {
	public static int myUserInput(Scanner input, String txt, int defaultBackup) {
		int numCatch = 1;
		int userInput = 0;
		
		System.out.println();
		while(true) {
			System.out.print(txt);
			try { // CHECKS TO MAKE SURE THAT THE INPUT IS VALID.
				userInput = input.nextInt(); // RECEIVE USER INPUT.
				break;
			}catch(Exception e) {
				System.out.println("This has been executed \n" + e);
				if (numCatch == 3) { // USER INPUT TOO MANY INCORRECT VALUES.
					System.out.println("\nYou have selected the number" + defaultBackup + " .\n");
					userInput = defaultBackup;
					break;
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
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int userInput = myUserInput(sc, "Please select an interger: ", 8);
		
		System.out.println("\n5A 1)\n---------");
		for (int i = 1; i <= userInput; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println("\n5A 2)\n---------");
		int whileLoop = userInput;
		while(true) {
			
			System.out.print(whileLoop + " ");
			whileLoop--;
			if (whileLoop == 0) {
				break;
			}
		}
		
		System.out.println("\n\n5A 3)\n---------");
		int doWhileLoop = 2;
		do {
			System.out.print(doWhileLoop + " ");
			doWhileLoop += 2;
		}while (doWhileLoop <= userInput);
			
		System.out.println("\n\n5A 4)\n---------");
		for (int i = 2; i <= userInput; i += 2) {
			if (i % 7 == 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println("\n\n5A 5)\n---------");
		for (int i = 1; i <= 10 ; i++) {
			System.out.print((i * userInput) + " ");
		}
		
		System.out.println("\n\nPattern A\n---------");
		if (userInput > 10) {
			userInput = 10;
		}
		for (int i = 1; i <= userInput ; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		System.out.println("\nPattern B\n---------");
		for (int i = userInput; i >= 1 ; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		System.out.println("\nPattern C\n---------");
		for(int i = 1; i <= userInput; i++) {
			for(int j = 1; j <= userInput; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
	}

}