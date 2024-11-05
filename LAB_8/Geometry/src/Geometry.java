/* This is for Lab#8.
 * Name: Matthew Houle | Date: November 4th 2024.
 */

 // IMPORTS
import java.util.Scanner;

public class Geometry {
    // GETS USER INPUT AND RETURNS A FLOAT
    public static float myFloatInput(Scanner keyboard, String txt){
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
        return userInput;
    }

    // PRINTS OUT THE OPTION MENU.
    public static void printMenu(){
        System.out.println("This is a geometry calculator"
            + "\nChoose what you would like to calculate"
            + "\n 1. Find the area of a circle"
            + "\n 2. Find the area of a rectangle"
            + "\n 3. Find the area of a triangle"
            + "\n 4. Find the circumference of a circle"
            + "\n 5. Find the perimeter of a rectangle"
            + "\n 6. Find the perimeter of a triangle");
    }

    // Find the area of a circle
    public static double circleArea(float radius){return Math.PI * Math.pow(radius, 2);}

    // Find the area of a rectangle
    public static double rectangleArea(float length, float width){return length * width;}

    // Find the area of a triangle
    public static double triangleArea(float base, float height){return (base * height) / 2f;}

    // Find the circumference of a circle
    public static double circleCircumference(float radius){return 2 * Math.PI * radius;}

    // Find the perimeter of a rectangle
    public static double rectanglePerimeter(float length, float width){return 2 * (length + width);}

    // Find the perimeter of a triangle
    public static double trianglePerimeter(float sideOne, float sideTwo, float sideThree){return sideOne + sideTwo + sideThree;}

    public static void main(String[] args){
        // VARIABLES
        Scanner keyboard = new Scanner(System.in);
        int selection;
        
        // PROGRAM STARTS HERE
        printMenu();
        do{selection = (int) Math.floor(myFloatInput(keyboard, "> "));
        }while(selection > 6 || selection < 1);
        
        System.out.println();

        switch(selection){
            case 1: // Find the area of a circle
            System.out.println("The area of the circle is " + circleArea(myFloatInput(keyboard, "Please enter the radius of the circle: ")));
            break;

            case 2: // Find the area of a rectangle
            System.out.println("The area of the rectangle is " + rectangleArea(myFloatInput(keyboard, "Please enter the length of the rectangle: "), 
                myFloatInput(keyboard, "Please enter the width of the rectangle: ")));
            break;

            case 3: // Find the area of a triangle
            System.out.println("The area of the triangle is " + triangleArea(myFloatInput(keyboard, "Please enter the base of the triangle: "), 
                myFloatInput(keyboard, "Please enter the height of the triangle: ")));
            break;

            case 4: // Find the circumference of a circle
            System.out.println("The circumference of the circle is " + circleCircumference(myFloatInput(keyboard, "Please enter the radius of the circle: ")));
            break;

            case 5: // Find the perimeter of a rectangle
            System.out.println("The perimeter of the rectangle is " + rectanglePerimeter(myFloatInput(keyboard, "Please enter the length of the rectangle: "), 
                myFloatInput(keyboard, "Please enter the width of the rectangle: ")));
            break;

            case 6: // Find the perimeter of a triangle
            System.out.println("The perimeter of the triangle is " + trianglePerimeter(myFloatInput(keyboard, "Please enter the first side of the triangle: "), 
                myFloatInput(keyboard, "Please enter the second side of the triangle: "), 
                myFloatInput(keyboard, "Please enter the final side of the triangle: ")));
            break;
        }

        keyboard.close();
    }
}
