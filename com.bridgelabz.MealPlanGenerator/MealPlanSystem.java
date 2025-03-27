// MealPlanSystem.java
import java.util.ArrayList;
import java.util.List;

public class MealPlanSystem {
    public static void main(String[] args) {
        // Create different meal plans
        Meal<VegetarianMeal> vegetarianMeals = new Meal<>();
        Meal<VeganMeal> veganMeals = new Meal<>();
        Meal<KetoMeal> ketoMeals = new Meal<>();
        Meal<HighProteinMeal> highProteinMeals = new Meal<>();

        // Add meals to each category
        vegetarianMeals.addMeal(new VegetarianMeal("Vegetable Stir-Fry"));
        vegetarianMeals.addMeal(new VegetarianMeal("Paneer Curry"));

        veganMeals.addMeal(new VeganMeal("Tofu Salad"));
        veganMeals.addMeal(new VeganMeal("Vegan Burger"));

        ketoMeals.addMeal(new KetoMeal("Grilled Chicken with Avocado"));
        ketoMeals.addMeal(new KetoMeal("Salmon with Butter Sauce"));

        highProteinMeals.addMeal(new HighProteinMeal("Egg Whites & Oats"));
        highProteinMeals.addMeal(new HighProteinMeal("Grilled Beef Steak"));

        // Display meals by category
        System.out.println("Vegetarian Meals:");
        vegetarianMeals.displayMeals();

        System.out.println("\nVegan Meals:");
        veganMeals.displayMeals();

        System.out.println("\nKeto Meals:");
        ketoMeals.displayMeals();

        System.out.println("\nHigh-Protein Meals:");
        highProteinMeals.displayMeals();

        // Generate a combined meal plan using generic method
        List<MealPlan> allMeals = new ArrayList<>();
        allMeals.addAll(vegetarianMeals.getMeals());
        allMeals.addAll(veganMeals.getMeals());
        allMeals.addAll(ketoMeals.getMeals());
        allMeals.addAll(highProteinMeals.getMeals());

        MealPlanner.generateMealPlan(allMeals);
    }
}



// Vegetarian Meals:
// Vegetable Stir-Fry - A healthy vegetarian meal.
// Paneer Curry - A healthy vegetarian meal.

// Vegan Meals:
// Tofu Salad - A nutritious plant-based meal.
// Vegan Burger - A nutritious plant-based meal.

// Keto Meals:
// Grilled Chicken with Avocado - A low-carb, high-fat meal.
// Salmon with Butter Sauce - A low-carb, high-fat meal.

// High-Protein Meals:
// Egg Whites & Oats - A meal rich in protein for muscle growth.
// Grilled Beef Steak - A meal rich in protein for muscle growth.

// === Generated Meal Plan ===
// Vegetable Stir-Fry - A healthy vegetarian meal.
// Paneer Curry - A healthy vegetarian meal.
// Tofu Salad - A nutritious plant-based meal.
// Vegan Burger - A nutritious plant-based meal.
// Grilled Chicken with Avocado - A low-carb, high-fat meal.
// Salmon with Butter Sauce - A low-carb, high-fat meal.
// Egg Whites & Oats - A meal rich in protein for muscle growth.
// Grilled Beef Steak - A meal rich in protein for muscle growth.
