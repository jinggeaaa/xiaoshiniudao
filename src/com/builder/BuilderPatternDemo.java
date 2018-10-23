package com.builder;

/**
 * @Author:泡泡
 * @Date:16:37 2018/9/12
 * @Modified By:
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder=new MealBuilder();

        Meal vegMeal=mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Cost:"+vegMeal.getCost());
        System.out.println("----------------------------");
        Meal nonVegMeal=mealBuilder.prepareNonVegMeal();
        System.out.println("non-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Cost:"+nonVegMeal.getCost());
    }
}
