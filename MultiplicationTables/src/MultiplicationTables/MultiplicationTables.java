package MultiplicationTables;

import java.util.Scanner;

public class MultiplicationTables {
	public static int myUserInput(Scanner input, String txt) { // YES I AM AWARE WE DID NOT LEAR METHODS IN CLASS.
		int userInput = 0;
		
		System.out.println();
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
		int UserInput = 0;
		while (true) {
			UserInput = myUserInput(sc, "Pleaser enter a number between 1 and 10. \n > ");
			if (UserInput <= 10 && UserInput >= 1) {
				System.out.println("");
				break;
			}
		}
		
		for(int i = 1; i <= UserInput; i++) {
			for(int j = 1; j<= UserInput; j++) {
				int Multiple = i*j;
				String tablet = "";
				if (Multiple < 10) {
					tablet = " " + Multiple + "   ";
				}else {
					tablet = " " + Multiple + "  ";
				}
				System.out.print(tablet);
			}
			System.out.println("");
		}
	}
}
