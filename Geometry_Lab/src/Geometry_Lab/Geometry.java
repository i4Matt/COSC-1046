package Geometry_Lab;

import java.util.Scanner;

public class Geometry {

	public static float myUserInput(Scanner input, String txt) {
		float userInput = 0;
		
		while(true) {
			System.out.print(txt);
			try { // CHECKS TO MAKE SURE THAT THE INPUT IS VALID.
				userInput = input.nextFloat(); // RECEIVE USER INPUT.
				break;
			}catch(Exception e) {
				input.next();
			}
		}
		return userInput;
	}
	
	public static void printMenu() {
		System.out.println("This is a geometry calcultor."
				+ "\nChoose what you would like to calculate:"
				+ "\n 1. Find the area of a circle."
				+ "\n 2. Find the area of a rectangle."
				+ "\n 3. Find the area of a triangle."
				+ "\n 4. Find the circumference of a circle."
				+ "\n 5. Find the perimeter of a rectangle."
				+ "\n 6. Find the perimeter of a triangle.");
		return;
	}
	
	public static double circleArea(float radius) {return Math.PI * (radius * radius);} // CALCULATES AREA OF A CIRCLE
	public static double rectangleArea(float length, float width) {return length * width;} // CALCULATES AREA OF A RECTANGLE
	public static double triangleArea(float base, float height) {return (base*height)/2f;} // CALCULATES AREA OF A TRIANGLE
	public static double circleCircumference(float radius) {return Math.PI * 2 * radius;} // CALCULATES THE CIRCOMFERENCE OF A CIRCLE
	public static double rectanglePerimeter(float length, float width) {return (2*length)+ (2*width);} // CALCULATES THE PERIMETER OF A RECTANGLE
	public static double trianglePerimeter(float sideOne, float sideTwo, float sideThree) {return sideOne + sideTwo + sideThree;} // CALCULATES THE PERIMETER OF A TRIANGLE
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			for(int i = 0; i < 10; i++) {System.out.println();}
			printMenu();
			
			int userSelection = 0;
			while(!(userSelection < 7 && userSelection > 0)) {
				userSelection = (int) Math.floor(myUserInput(sc, "> "));
			}
			
			System.out.println();
			double answer = 0;
			switch(userSelection){
				case 1: // ASKES AND CALCULATES THE AREA OF A CIRCLE
					answer = circleArea(myUserInput(sc, "Please enter the raidus of the circle. \n> ")); 
					break;
					
				case 2: // ASKES AND CALCULATES THE AREA OF A RECTANGLE
					answer = rectangleArea(myUserInput(sc, "Please enter the width of the rectangle. \n> "), 
							myUserInput(sc, "Please enter the length of the rectangle. \n> ")); 
					break;
					
				case 3: // ASKES AND CALCULATES THE AREA OF A TRIANGLE
					answer = triangleArea(myUserInput(sc, "Please enter the base of the triangle. \n> "),
							myUserInput(sc, "Please enter the height of the triangle. \n> ")); 
					break;
					
				case 4: // ASKES AND CALCULATES THE CIRUMFERENCE OF THE CIRCLE
					answer = circleCircumference(myUserInput(sc, "Please enter the raidus of the circle. \n> ")); 
					break;
					
				case 5: // ASKES AND CALCULATES THE PERIMETER OF THE RECTANGLE
					answer = rectanglePerimeter(myUserInput(sc, "Please enter the width of the rectangle. \n> "), 
							myUserInput(sc, "Please enter the length of the rectangle. \n> "));
					break;
					
				case 6: // ASKES AND CALCULATES THE PERIMETER OF THE TRIANGLE
					answer = trianglePerimeter(myUserInput(sc, "Please enter the length of the first side of the tirangle. \n> "),
							myUserInput(sc, "Please enter the length of the second side of the tirangle. \n> "),
							myUserInput(sc, "Please enter the length of the last side of the tirangle. \n> "));
			}
			
			System.out.println("\nThe answer is: " + answer);
			char response = 'n';
			try {
				System.out.print("\nDo you wish to continue? \n> ");
				response = sc.next().toLowerCase().charAt(0);
			} catch (Exception e) {}
			if (!(response == 'y')) {break;}
		}
		sc.close();
	}
}