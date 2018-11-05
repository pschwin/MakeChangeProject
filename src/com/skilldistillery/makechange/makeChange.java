package com.skilldistillery.makechange;

import java.util.Scanner;

public class makeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Variables:

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the price of the item: ");
		double price = (input.nextDouble()*100);
		
		
		//System.out.println(price);
		System.out.println("Enter the amount tendered: ");
		double amountTendered = (input.nextDouble() * 100); //convert to pennies for easy calculations
		//System.out.println(amountTendered);
		double change = amountTendered - price;
		//System.out.println(change);
		int changeCasted = (int) (change);
		int temp = changeCasted;
		int counter = 0;
		
		if(amountTendered < price) {
			System.out.println("Error");
		}

		System.out.print("Amount: " + price +", Tendered: " + amountTendered + " Result: " );
		
		/*
		 * After converting everything to pennies
		 * 
		 * 
		 */
		while (temp > 0) {

			// Twenties
			if (temp >= 2000) {

				counter = changeCasted / 2000; // twenties
				temp = changeCasted - (2000 * counter);
				int twenties = counter;
				System.out.print("Number of Twenties: " + twenties +", ");

			}

			// Tens
			if (temp >= 1000) {

				counter = temp / 1000; // Number of tens
				temp = temp - (1000 * counter);
				int tens = counter;
				System.out.print("Number of Tens: " + tens +", ");

			}

			// Fives
			if (temp >= 500) {

				counter = temp / 500; // Number of fives
				temp = temp - (500 * counter);
				int fives = counter;
				System.out.print("Number of Fives: " + fives +", ");

			}
			
			//Ones
			if (temp >= 100) {

				counter = temp / 100; // Number of ones
				temp = temp - (100 * counter);
				int ones = counter;
				System.out.print("Number of Ones: " + ones +", ");

			}
			
			//Quarters
			if (temp >= 25) {

				counter = temp / 25; // Number of quarters
				temp = temp - (25 * counter);
				int quarters = counter;
				System.out.print("Number of Quarters: " + quarters+", ");

			}
			
			//Dimes
			if (temp >= 10) {

				counter = temp / 10; // Number of dimes
				temp = temp - (10 * counter);
				int dimes = counter;
				System.out.print("Number of Dimes: " + dimes +", ");

			}
			
			//Nickels
			if (temp >= 5) {

				counter = temp / 5; // Number of nickels
				temp = temp - (5 * counter);
				int nickels = counter;
				System.out.print("Number of Nickels: " + nickels+", ");

			}
			
			//Pennies
			if (temp >= 1) {

				counter = temp / 1; // Number of pennies
				temp = temp - (1 * counter);
				int pennies = counter;
				System.out.println("Number of Pennies: " + pennies);
			}
		}
		
		input.close();
		
		
	}

}
