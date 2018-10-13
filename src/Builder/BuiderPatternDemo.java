package Designpattern.Builder;

//07. 使用 MealBuider 来演示建造者模式（Builder Pattern）。
public class BuiderPatternDemo {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItem();
        System.out.println(" Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItem();
        System.out.println(" Total Cost: "+ nonVegMeal.getCost());

    }
}
