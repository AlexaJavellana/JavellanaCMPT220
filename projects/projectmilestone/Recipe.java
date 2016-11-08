public class Recipe {

public double mealBudget;

  public Recipe() {
  mealBudget = 1;
  }

  public Recipe(double budget) {
  mealBudget = budget;
  }

  public void showNonVRecipe() {
 		if (mealBudget <= 5 && mealBudget % 2 == 0)
 			System.out.println("Recipe 1: Less than 5$");
 		else if (mealBudget <= 5 && mealBudget % 2 != 0)
 			System.out.println("Recipe 2: Less than 5$");
 		else if (mealBudget <= 10 && mealBudget % 2 == 0)
 			System.out.println("Recipe 1: Between 6 and 10$");
 		else if (mealBudget <= 10 && mealBudget % 2 != 0)
 			System.out.println("Recipe 2: Between 6 and 10$");
 		else if (mealBudget <= 15 && mealBudget % 2 == 0)
 			System.out.println("Recipe 1: Between 11 and 15 $");	
		else if (mealBudget <= 15 && mealBudget % 2 != 0)
 			System.out.println("Recipe 2: Between 11 and 15 $");
 		else if (mealBudget < 20.01 && mealBudget % 2 == 0)
 			System.out.println("Recipe 1: Between 16 and 20.01$");	
		else if (mealBudget < 20.01 && mealBudget % 2 != 0)
 			System.out.println("Recipe 2: Between 16 and 20.01$");	

		return;
  }

  public void showVRecipe() {
  	if (mealBudget <= 5)
 			System.out.println("Recipe 1V: Less than 5$");
 		else if (mealBudget <= 10)
 			System.out.println("Recipe 1V: Between 6 and 10$");
 		else if (mealBudget <= 15)
 			System.out.println("Recipe 1V: Between 11 and 15 $");	
 		else if (mealBudget < 20.01)
 			System.out.println("Recipe 1V: Between 16 and 20.01$");	

		return;  	
  }

// draft 1 milestone 


}