package Tempurature_and_Sphere_Calculator;

//IMPORTS
import java.util.Scanner; //SCANNER
import java.lang.Math; //MATH STUFF

public class Sphere_Calculator {
	public static void print(String txt) {
		System.out.print(txt);
	}
	public static void main(String[] args) {
		//START OF TASK 4.
		Scanner sc = new Scanner(System.in);
		
		boolean alive = true;
		int numCatch = 1;
		
		float diameter = 0;
		
		while(alive) {
			System.out.print("Please insert the diameter of your sphere: ");
			try { // CHECKS TO MAKE SURE THAT THE INPUT IS VALID.
				diameter = sc.nextFloat();
				alive = false;
			}catch(Exception e) {
				if (numCatch == 3) {
					System.out.println("\nYou have selected the number 6.\n");
					diameter = 6;
					alive = false;
				}else { // 3 STRIKES YOU'RE OUT.
					System.out.println("\nPlease insert a valid number.");
					numCatch += 1;
				}
				sc.next();
			}
			
			float radius = diameter / 2f;
			
			double volume = (4f/3f) * Math.PI * Math.pow(radius, 3);
			
			System.out.println("The Volume of you sphere is: " + volume);
			sc.close();
		}
	}

}
