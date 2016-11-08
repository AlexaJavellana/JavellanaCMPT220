import java.util.Scanner; 

public class RecipeRun {
	public static void main(String[] args) {
  
	Scanner input = new Scanner(System.in); 
	System.out.println("Welcome to Recipe Run, a college-friendly " + 
										"random recipe generator. Please enter your " +
										"budget under 20.01 USD: ");
  double userMoney = input.nextDouble();

  if (userMoney >= 20.01) {
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

// draft 1 milestone 
	}
}