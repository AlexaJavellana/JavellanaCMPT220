public class Recipe {

  public double mealBudget;

  public Recipe() {
    mealBudget = 1;
  }

  public Recipe(double budget) {
    mealBudget = budget;
  }

  public void showNonVRecipe() {
 		if (mealBudget <= 5 && mealBudget % 2 == 0) {
 			System.out.println("Recipe: Mac N' Cheese\n\nIngredients:" +
                        "\n1. Instant Easy Mac OR if above 3$ Barilla Elbows \n2. Cheese " +
                        "of choice \n3. Butter or oil\n");
      System.out.println("\nInstructions \n\n1. Prepare the instant version as instructed. " +
                        "\n2. Boil Barilla elbows 8-10 minutes until desired toughness." +
                        "\n3. In a seperate sauce pan, add butter or oil. \n4. Add pasta to " +
                        "saucepan and shred in cheese on low heat. \n5. Mix well and serve.");
    }
 		else if (mealBudget <= 5 && mealBudget % 2 != 0) {
 			System.out.println("Recipe: Asian Style Fried Rice\n\nIngredients: \n1. Jasmine Rice (1cup)" +
                        "\n2. Oyster sauce \n3. Meat of choice (chicken, beef, SPAM) \n4. Scallions" +
                        "\n5. Cooking oil\n6. Herbs to top, i.e. cilantro");
      System.out.println("\nInstructions \n\n1. Prepare the rice according to instructions. " +
                        "\n2. In a saucepan, heat up around 2 tablespoons of oil on medium heat." +
                        "\n3. Cut meat of choice into bite size pieces, around 1/2 cup for 1 cup of" +
                        " rice. \n4. Cut scallions into small pieces, around a little less than 1/3 cup" +
                        "\n5. Add meat to saucepan and cook for around 2-3 minutes before " +
                        "adding cut scallions. \n6. When meat is cooked and scallions are wilted, add" +
                        " your cooked jasmine rice and stir on low heat. \n8. Add around 3 tablespoons" +
                        " of oyster sauce to rice and mix in well. \n9. Serve topped with herbs.");
    }  
 		else if (mealBudget <= 10 && mealBudget % 2 == 0) {
 			System.out.println("Recipe: Mixed Green and Chicken Salad\n\nIngredients: \n1. 1 cup cut chicken" +
                        "\n2. Mixed green package \n3. Dressing of choice \n4. Dried berries \n5. Nuts" +
                        "\n6. Crumbled cheese");
      System.out.println("\nInstructions \n\n1. Either on an oiled grill or sauce pan, cook the chicken until" +
                        "crisp-tender. \n2. Taking the mixed greens, wash them thoroughly. \n3. Add your " +
                        "wanted dressing, berries, nuts and cheese to a big bowl mixed thoroughly with " +
                        "the mixed greens. \n4. Top with chicken and serve.");
    }  
 		else if (mealBudget <= 10 && mealBudget % 2 != 0) {
      System.out.println("Recipe: Spiced Peanut Noodles\n\nIngredients: \n1. Linguine \n2. 4 tbsp seasame oil" +
                        "\n3. Chopped green onion \n4. Shredded carrot \n5. 1 clove minced garlic \n6. 2 tbsp " +
                        "ground ginger \n7. 1 tablespoon soy sauce \n8. 1 tablespoon honey \n9. 2 tablespoon" +
                        " rice vinegar \n10. 1 1/2 tablespoon peanut butter");
      System.out.println("Instructions \n\n1. Cook pasta in large pot of salted water according to package " +
                        "directions \n2. Drain pasta and return to pot \n3. Add 2 tbsps of sesame oil to " +
                        "pot and toss pasta to coat. \n4. In a separate saucepan, add remaining 2 tbsp " +
                        "of sesame oil. Stir in green onions, carrots, garlic and ginger. \n5. Saute until " +
                        "vegetables soften. \n6. Add honey, peanut butter, soy sauce, vinegar and mix." +
                        "\n7. Simmer sauce for 2 minutes and pour over pasta. Serve warm.");
    }
 		else if (mealBudget <= 15 && mealBudget % 2 == 0) {
      System.out.println("Recipe: Spiced Pork Belly Tacos\n\nIngredients: \n1. 2 pounds boneless skinless " +
                        "pork belly \n2. 1 1/2 tbsp granulated sugar \n3. 1 1/2 tbsp kosher salt \n4. 1 tbsp " +
                        "ancho chili powder \n5. 4-6 medium sized tortillas \n6. 1 cubed avocado \n7. Red onions" +
                        "\n8. Queso fresco, crumbled \n9. Chopped cilantro");
      System.out.println("\nInstructions \n\n1. Place pork belly in a glass baking dish and rub evenly with " +
                        "granulated sugar and salt. Cover with plastic wrap and refrigerate for 12-24 hours" +
                        "\n2. Remove from fridge, remove plastic wrap, and discard of any leftover liquids. " +
                        "Rub with ancho chili powder. \n3. Preheat oven to 450F and roast pork belly for 30 " +
                        "minutes, then lower heart to 275F and roast for 1 hour or until tender. \n4. Slice " +
                        "cooled pork belly into 1/2 inch slices. \n5. Top tortillas with pork belly, avocado, " +
                        "onions, queso fresco and cilantro. Optional: Lime wedges for garnish. Serve and enjoy.");
    }	
		else if (mealBudget <= 15 && mealBudget % 2 != 0) {
      System.out.println("Recipe: Grilled Pineapple Teriyaki Burgers\n\nIngredients: \n1. 2 pre-made raw turkey " +
                        "burgers \n2. 2 burger buns \n3. 2 fresh pineapple slices \n4. 1 bunch scallions " +
                        "\n5. 1 mashed avocado \n6. 1/4 cup teriyaki sauce \n7. 1/4 cup mayonnaise " +
                        "\n8. 1 clove garlic \n9. Vegetable oil \n10. Kosher salt");
      System.out.println("Instructions \n\n1. Preheat grill over medium-high heat. \n2. Lightly brush turkey " +
                        "burgers, pineapple and scallions with oil and season generously with kosher salt. " +
                        "\n3. Grill burgers on each side, 5 minutes. During last two mintes, brush half teriyaki " +
                        "sauce onto burgers. \n4. Grill pineapple, 3-4 minutes per side, as well as scallions. " +
                        "\n5. Chop charred scallions and in a small mixing bowl combine with mayo and minced " +
                        "garlic. \n6. Toast buns lightly on grill. Place burger inside bun and brush with more teriyaki " +
                        "sauce. Top with mashed avocado, pineapple and the mix of scallions and mayo.");
    }
 		else if (mealBudget < 20.01 && mealBudget % 2 == 0) {
      System.out.println("Recipe: Mongolian Beef with Broccoli\n\nIngredients: \n1. 2 tbsp vegetable oil " +
                        "\n2. 1/2 lb flank steak \n3. 1 1/2 cloves garlic, finely chopped \n4. 1 tbsp " +
                        "hoisin sauce \n5. 1/4 low sodium soy sauce \n6. 3 tbsp brown sugar \n7. 1/8 cup " +
                        "water \n8. 1/2 head broccoli florets \n9. Sesame seeds for garnish \n10. Jasmine " +
                        "rice to serve along with \n11. Corn starch");
      System.out.println("\nInstructions \n\n1. In a large skillet over medium-high heat, heat oil. \n2. Toss " +
                        "beef with corn starch and cook until crispy, 2 minutes per side. Transfer to a plate " +
                        "to drain fat. \n3. Add remaining oil to skillet. Add garlic and ginger, cooking for " +
                        "one minute. Add hoisin sauce, soy sauce, brown sugar and water. Bring to a simmer and " +
                        "let thicken, 4-5 minutes, then add broccoli. Cover and cook until tender. \n4. Garnish " +
                        "with sesame seeds and serve over rice.");
    }
		else if (mealBudget < 20.01 && mealBudget % 2 != 0) {
      System.out.println("Recipe: Black Cherry Glazed Pork Tenderloin\n\nIngredients: \n1. 1 pork tenderloin" +
                        "\n2. 1 hero black cherry fruit spread \n3. 2 tbsp dijon mustard \n4. 2 tbsp balsamic " +
                        "vinegar \n5. 1 tbsp brown sugar \n6. 2 oz white wine \n7. 1 tspn minced orange peel " +
                        "\n8. 1 tspn fresh chopped rosemary");
      System.out.println("\nInstructions \n\n1. Mix all ingredients except for pork in a large Ziploc bag." +
                        "\n2. Place pork tenderloin in ziploc and refrigerate for 5 hours, turning occasionally " +
                        "to absorb marinade. \n3. Preheat over to 450F. Remove pork from bag and pour marinade " +
                        "into saucepan. \n4. Roast pork on aluminum foil lined baking sheet for 20-25 minutes, " +
                        "or until internal temperature reaches 145-150F. Remove from over and let rest 5 mins" +
                        "\n5. Simmer marinade in saucepan over medium heat until reduced to a glaze. Brush " +
                        "glaze all over tenderloin and cut into 1/2inch slices.");
    }
		return;
  }

  public void showVRecipe() {
  	if (mealBudget <= 5) {
 			System.out.println("Recipe: Avocado Toast\n\nIngredients:" +
                        "\n1. Bread \n2. Avocado \n3. Lime/Lemon \n4. Salt, Pepper \n5. Egg" + 
                        "\n6. Additional seasonings/sauces: i.e. Sriracha ");
      System.out.println("\nInstructions \n\n1. In a bowl, de-pit avocados and combine with lime/" +
                        "lemon juice, salt and pepper according to taste. Mix well. \n2. In a skillet " +
                        "(non-stick) cook egg as desired (sunny side, scrambled). \n3. On bread, spread " +
                        "avocado mix and place egg on top. Top with any additional sauces.");
    }
 		else if (mealBudget <= 10) {
 			System.out.println("Recipe: Vegetable Stir Fry\n\nIngredients:" +
                        "\n1. Two tbsps oil \n2. Julienned Bell peppers (red, yellow) \n3. 1/2 cup thinly sliced" +
                        " onion \n4. 1 cup broccoli florets \n5. 2 cups slice bok choy" +
                        "\n6. 1 clove minced garlic \n7. 1/2 cup teriyaki sauce \n8. Salt and pepper" +
                        "\n9. 2 tablespoons sesame oil");
      System.out.println("\nInstructions \n\n1. In a wok or large skillet, heat oil over high heat" +
                        "\n2. Add peppers and onions, stirring constantly. \n3. Add broccoli, garlic" +
                        " and teriyaki sauce. Stir two minutes. \n4. Add bok choy, peppers, salt and pepper." +
                        "\n5. Stir and cook until crisp-tender. Add in sesame oil. \n6. After a good minute, " +
                        "remove from heat. \n7. Serve immediately.");
    }  
 		else if (mealBudget <= 15) {
      System.out.println("Recipe: Sweet Potato Chickpea Buddha Bowls\n\nIngredients:" +
                        "\n1. 2 tbsps olive oil \n2. 1/2 red onion, sliced \n3. 2 sweet potatoes, halved" +
                        "\n4. 1 bundle broccolini, stems removed \n5. 2 handfuls kale \n6. 1/4 tbsp salt " +
                        "and pepper \n7. 15-oz chickpeas \n7. 3/4 tbsp - 1 tbsp cumin, chili powder, garlic" +
                        " powder, salt, pepper");
      System.out.println("\nInstructions \n\n1. Preheat over to 400 degrees F and arrange sweet potatoes " +
                        "and onions onto baking sheet, drizzled with oil. Skin side down on sweet potatoes" +
                        "\n2. Bake for 8-10 minutes, flip potatoes and add broccolini. Drizzle oil onto and " +
                        "season with salt and pepper to broccolini \n3. Bake for 8-10 minutes, add kale. " +
                        "Season with oil, salt and pepper. \n4. As vegetables are roasting, heat skillet " +
                        "over medium heat. Add chickpeas and add ingredients from step 7. \n5. Once hot, " +
                        "add 1 tbsp oil to chickpeas and saute, stirring frequently. Cook until brown and " +
                        "fragrant. \n6. Slice sweet potatoes into bize size pieces and top with chickpeas.");
    }
 		else if (mealBudget < 20.01) {
      System.out.println("Recipe: Thai Red Vegetable Curry\n\nIngredients:" +
                        "\n1. 1 1/4 cup brown jasmine rice \n2. 1 tbsp coconut oil \n3. 1 small white " +
                        "onion diced \n4. Pinch of salt \n5. 1 tbsp grated fresh ginger \n6. 2 cloves " +
                        "garlic \n7. 1 red bell pepper, thinly sliced \n8. 1 extra bell pepper, any color " +
                        "thinly sliced \n9. 2-3 carrots, peeled and sliced diagonally into 1/4 inch thick " +
                        "rounds \n10. 2 tbsp Thai red curry paste \n11. 1 can coconut milk \n12. 1/2 cup " +
                        "water \n13. 1 1/2 cup thin sliced kale \n14. 1 1/2 tspn raw sugar \n15. 2 tspn " +
                        "rice vinegar \n16. 1 tbsp tamari or soy sauce");
      System.out.println("\nInstructions \n\n1. Cook rice according to instructions. \n2. Warm skillet over " +
                        "medium heat. Add oil, onion, some salt and cook until translucent. Add ginger and " +
                        "garlic until fragrant, stirring continuously \n3. Add bell peppers and carrots until " +
                        "bell peppers are fork tender, stirring occasionally. Add paste and stir. \n4. Add " +
                        "coconut milk, water, kale and sugar. Bring to simmer over medium heat and gradually " +
                        "reduce heat until vegetables are soft. \n5. Remove pot from heat and season with " +
                        "tamari and rice vinegar. Add salt, vinegar and or tamari to taste if necessary." +
                        "\n6. Serve curry with brown rice. Garnish if wanted.");
    }	
		return;  	
  }
}