/*
 * file: RecipeRun.java
 * author: Alexa Javellana
 * course: CMPT 220
 * assignment: Project 2
 * due date: December 12th 2016
 * version: 2.0
 *
 * This file contains the RecipeRun class, which is the direct program run in the JVM
 * for my project.
 */

import java.util.Scanner; 

/**
 * RecipeRun
 * 
 * This class contains the code that directly interacts with the user and receives 
 * values for userMoney and isVegetarian, which is judged in the Recipe class to 
 * return an appropriate recipe according to their userMoney value, equivocated 
 * to mealBudget. Additionally, this class identifies invalid values for  
 * mealBudget.
 *
 */
public class RecipeRun {
	public static void main(String[] args) {
  
	Scanner input = new Scanner(System.in); 
	System.out.println("Welcome to Recipe Run, a college-friendly " + 
										"random recipe generator. Please enter your " +
										"budget more than 0 but under 20 USD: ");
  double userMoney = input.nextDouble();

  if (userMoney >= 20.01) {
  	System.out.println("Invalid budget! Try again.");
  	System.exit(0);
  }	

  if (userMoney <= 0) {
    System.out.println("Invalid budget! Try again.");
    System.exit(0);
  } 

  Recipe userRecipe = new Recipe(userMoney);
 
  System.out.println("Your budget is " + userRecipe.mealBudget + 
  									". Would you like vegetarian options to be " +
  									"presented? Enter yes or no.");
  
  String isVegetarian = input.next();

  if (isVegetarian.equalsIgnoreCase("yes")) {
  	System.out.println("You have chosen vegetarian options. Here " +
											"is your buget-appropriate recipe: ");
  	userRecipe.showVRecipe();
  }
  else if (isVegetarian.equalsIgnoreCase("no")) {
  	System.out.println("Here is your budget-appropriate recipe: ");
  	userRecipe.showNonVRecipe();
	}
	}
}