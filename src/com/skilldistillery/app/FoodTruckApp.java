package com.skilldistillery.app;

import java.util.Scanner;

public class FoodTruckApp {
	private FoodTruck foodTrucksArr[];
	private static Scanner userInput = new Scanner(System.in);
	private static FoodTruckApp app = new FoodTruckApp();

	public static void main(String[] args) {

		app.run();

	}

	void run() {
		System.out.println("Welcome to Food Truck Rater!");
		System.out.println("How many trucks would you like to input data for?");
		int c = userInput.nextInt();
		userInput.nextLine();

		foodTrucksArr = new FoodTruck[c];
		for (int i = 0; i < foodTrucksArr.length; i++) {
			System.out.println("Please enter Food Truck name. (Or type 'quit' to see Main Menu) ");
			String name = userInput.nextLine();
			if (name.equalsIgnoreCase("Quit")) {
				mainMenu();
				continue;
			}
			System.out.println("What kind of food do they serve there?");
			String foodType = userInput.nextLine();
			System.out.println("How would you rate your experience? (1 - 5)");
			int numericRating = userInput.nextInt();
			userInput.nextLine();
			int uId = i;
			foodTrucksArr[i] = new FoodTruck(name, foodType, numericRating, uId);
		}
		mainMenu();

	}

	void mainMenu() {
		System.out.println();
		System.out.println("|=============================|");
		System.out.println("|------Food Truck Rater-------|");
		System.out.println("|--1) See The Food Trucks-----|");
		System.out.println("|--2) See Avg. Truck Ratings--|");
		System.out.println("|--3) See Highest Rated Truck-|");
		System.out.println("|--4) Quit Program------------|");
		System.out.println("|=============================|");
		System.out.println();
		System.out.print("Please make a selection: ");
		System.out.println();
		int navi = userInput.nextInt();

		switch (navi) {
		case 1:
			viewTrucks();
			break;
		case 2:
			avgRating();
			break;
		case 3:
			highestRated();
			break;
		case 4:
			System.out.println("Goodbye!");
			break;

		}
	}

	void viewTrucks() {
		for (int i = 0; i < foodTrucksArr.length; i++) {
//			String names = foodTrucksArr[i].getName();
			System.out.println(foodTrucksArr[i]);
		}
		System.out.println();
		mainMenu();

	}

	void avgRating() {
		int sum = 0;
		double average = 0.0;
		for (int i = 0; i < foodTrucksArr.length; i++) {
			sum = sum + foodTrucksArr[i].getNumericRating();
		}
		average = sum / foodTrucksArr.length;
		System.out.println("The average Food Truck rating in your area is: " + average + " out of 5.");
		System.out.println();
		mainMenu();
	}

	void highestRated() {
		int highestRating = 0;
		String topTruck = "";
		for (int i = 0; i < foodTrucksArr.length; i++) {
			if (foodTrucksArr[i].getNumericRating() > highestRating) {
				highestRating = foodTrucksArr[i].getNumericRating();
			}
			if (highestRating == foodTrucksArr[i].getNumericRating()) {
				topTruck = foodTrucksArr[i].getName();
			}
		}
		System.out.println(topTruck + " is the highest rated, with a rating of: " + highestRating + " out of 5.");
		System.out.println();
		mainMenu();
	}

}
