// KetoMeal.java
public class KetoMeal implements MealPlan {
    private String mealName;

    public KetoMeal(String mealName) {
        this.mealName = mealName;
    }

    @Override
    public String getMealType() {
        return "Keto";
    }

    @Override
    public String getMealDetails() {
        return mealName + " - A low-carb, high-fat meal.";
    }
}
