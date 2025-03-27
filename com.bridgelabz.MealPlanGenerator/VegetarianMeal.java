// VegetarianMeal.java
public class VegetarianMeal implements MealPlan {
    private String mealName;

    public VegetarianMeal(String mealName) {
        this.mealName = mealName;
    }

    @Override
    public String getMealType() {
        return "Vegetarian";
    }

    @Override
    public String getMealDetails() {
        return mealName + " - A healthy vegetarian meal.";
    }
}
