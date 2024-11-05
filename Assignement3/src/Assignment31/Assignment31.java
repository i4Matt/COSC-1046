package Assignment31;

import java.util.Scanner;

public class Assignment31 {
	
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

	public static void printingPyramid(int num1, int num2) {  
		if ( num2 <= num1 && num2 < 10) { // NUMBER IS BELOW 10
			System.out.print(" " + num2 + " ");
		} else if (num2 <= num1) { // NUMBER IS ABOVE 10
			System.out.print(" " + num2 + " ");
		} else if (num2 > num1 && num2 >= 10){ // BLANKS FOR NUMBER ABOVE 10
			System.out.print("    ");
		} else { // PRINT BLANKS BELOW 10
			System.out.print("   ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int userInput = 0;
		while (true) {
			userInput = myUserInput(sc, "Please enter an intenger between 1 and 15: ");
			if (userInput > 1 && userInput < 16) {
				break;
			}
		}
		for (int i = 1; i <= userInput; i++) {
			for (int j = userInput; 1 <= j ; j--) {
				printingPyramid(i, j);
			}
			for (int j = 2; j <= userInput ; j++) {
				printingPyramid(i, j);
			}
			System.out.println();
		}
		sc.close();
	}
}
