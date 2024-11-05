package Assignment32;

import java.util.Scanner;

public class Assignment32 {
		
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
		Scanner sc = new Scanner(System.in);
		float total = 0; 
		int posInt = 0, negInt = 0;
		
		System.out.print("Enter an integer, the input ends if it is 0: ");
		
		while(true) {
			int userInput = myUserInput(sc, "");
			if (userInput != 0) {
				if (userInput < 0) {
					negInt++;
				} else {
					posInt++;
				}
				total += userInput;
			} else {break;}
		}
		
		if (posInt == 0 && negInt == 0) { // CHECKS TO SEE IF ANY OTHER NUMBER EXCEPT 0 WAS INPUT
			System.out.println("No number except 0 was inputed.");
		} else {
			System.out.println("The number of positives is " + posInt); // NUMBER OF POSITIVE INTS
			System.out.println("The number of negatives is " + negInt); // NUMBER OF NEGATIVE INTS
			System.out.println("The total is " + total);
			System.out.println("The average is " + (total / (negInt + posInt)));
		}
		sc.close();
	}

}
