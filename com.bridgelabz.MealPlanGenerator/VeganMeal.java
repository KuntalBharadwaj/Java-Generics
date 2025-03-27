// VeganMeal.java
public class VeganMeal implements MealPlan {
    private String mealName;

    public VeganMeal(String mealName) {
        this.mealName = mealName;
    }

    @Override
    public String getMealType() {
        return "Vegan";
    }

    @Override
    public String getMealDetails() {
        return mealName + " - A nutritious plant-based meal.";
    }
}
