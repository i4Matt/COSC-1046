package Assignment33;

import java.util.Scanner;

public class Assignment33 {
	
	public static int myUserInput(Scanner input, String txt) { // YES I AM AWARE WE DID NOT LEARN METHODS IN CLASS.
		int userInput = 0;
		while(true) {
			System.out.print(txt);
			try { // CHECKS TO MAKE SURE THAT THE INPUT IS VALID.
				userInput = input.nextInt(); // RECEIVE USER INPUT.
				break;
			}catch(Exception e) {
				input.next();
				System.out.println();
			}
		}
		return userInput;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int userInput = myUserInput(sc, "Please enter a decimal integer: ");
		int bionaryTracker = 1;
		String output = "";
		
		for (int i = 1; i < userInput; i *= 2) { bionaryTracker *= 2;}
		do {
			if (userInput >= bionaryTracker) {
				userInput -= bionaryTracker;
				output = output + "1";
			}else {output = output + "0";}
			bionaryTracker /= 2;
			
		} while (bionaryTracker != 0);
		System.out.println("Binary: " + Integer.parseInt(output));
		sc.close();
	}

}
