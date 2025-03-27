// HighProteinMeal.java
public class HighProteinMeal implements MealPlan {
    private String mealName;

    public HighProteinMeal(String mealName) {
        this.mealName = mealName;
    }

    @Override
    public String getMealType() {
        return "High-Protein";
    }

    @Override
    public String getMealDetails() {
        return mealName + " - A meal rich in protein for muscle growth.";
    }
}
