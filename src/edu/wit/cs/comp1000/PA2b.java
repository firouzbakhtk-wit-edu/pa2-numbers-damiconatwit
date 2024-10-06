package edu.wit.cs.comp1000;

import java.util.Scanner;

// TODO: document this class
public class PA2b {

	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here
Scanner scanner = new Scanner(System.in);
		
		// Prompt user for coefficients 
		System.out.print("Enter a b c: ");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		
		// Calculate the discriminant
		double discriminant = b * b - 4 * a * c;
		
		if (discriminant < 0) {
			System.out.println("Roots: imaginary");
		} else if (discriminant == 0) {
			double root = -b / (2 * a);
			System.out.printf("Root: %.2f%n", root);
		} else {
			double root1 = (-b - Math.sqrt(discriminant)) / (2 * a);
			double root2 = (-b + Math.sqrt(discriminant)) / (2 * a);
			System.out.printf("Roots: %.2f, %.2f%n", Math.min(root1,  root2), Math.max(root1, root2));			
		}
		
		scanner.close();
	}

}
