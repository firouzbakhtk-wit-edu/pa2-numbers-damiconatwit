package edu.wit.cs.comp1000;

import java.util.Scanner;

// TODO: document this class
public class PA2a {

	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here
		Scanner scanner = new Scanner(System.in);
		
		// Ask user for 5 whole numbers
		System.out.print("Enter five whole numbers: ");
		int[] numbers = new int[5];
		
		// read numbers from the user
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
		}

		// Calculate and display statistics
		displayStatistics(numbers);
		
		//Close the scanner
		scanner.close();
	}
	
	// Display the statistics of the given numbers including sums and averages.
	
	private static void displayStatistics(int[] numbers) {
		int positiveSum = 0, nonPositiveSum = 0, totalSum = 0;
		int positiveCount = 0, nonPositiveCount = 0;
		
		for (int number : numbers) {
			totalSum += number; //Total sum of numbers
			
			if (number > 0) {
				positiveSum += number; // Sum of positive numbers
				positiveCount++; // Count of non-positive numbers
			} else {
				nonPositiveSum += number; // Sum of non-positive numbers
				nonPositiveCount ++; // Count of non-positive numbers
			}
				
		}
		
		// Calculate averages
		double averagePositive = (positiveCount > 0) ? (double) positiveSum / positiveCount : 0.0;
		double averageNonPositive = (nonPositiveCount > 0) ? (double) nonPositiveSum / nonPositiveCount : 0;
		double averageAll = (double) totalSum / 5; // Average of all numbers
		
		// Output results
		if (positiveCount != 1) {
			System.out.printf("The sum of the %d positive numbers: %d%n" ,positiveCount, positiveSum);
		}
		else {
			System.out.printf("The sum of the %d positive number: %d%n" ,positiveCount, positiveSum);
		}
		if (nonPositiveCount != 1) {
			System.out.printf("The sum of the %d non-positive numbers: %d%n" ,nonPositiveCount, nonPositiveSum);
		}
		else {
			System.out.printf("The sum of the %d non-positive number: %d%n" ,nonPositiveCount, nonPositiveSum);
		}
		System.out.printf("The sum of the 5 numbers: %d%n" , totalSum);
		
		if (positiveCount != 1) {
			System.out.printf("The average of the %d positive numbers: %.2f%n",positiveCount, averagePositive);
		}
		else {
			System.out.printf("The average of the %d positive number: %.2f%n",positiveCount, averagePositive);
		}
		if (nonPositiveCount != 1) {
			System.out.printf("The average of the %d non-positive numbers: %.2f%n",nonPositiveCount, averageNonPositive);
		}
		else {
			System.out.printf("The average of the %d non-positive number: %.2f%n",nonPositiveCount, averageNonPositive);
		}
		System.out.printf("The average of the 5 numbers: %.2f%n", averageAll);
		
	}
}
