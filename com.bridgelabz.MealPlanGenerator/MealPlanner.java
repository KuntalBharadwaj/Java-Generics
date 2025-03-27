// MealPlanner.java
import java.util.List;

public class MealPlanner {
    public static <T extends MealPlan> void generateMealPlan(List<T> meals) {
        System.out.println("\n=== Generated Meal Plan ===");
        for (T meal : meals) {
            System.out.println(meal.getMealDetails());
        }
    }
}
