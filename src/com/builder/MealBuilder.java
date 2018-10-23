package com.builder;

import com.builder.food.ChickenBurger;
import com.builder.food.Coke;
import com.builder.food.Pepsi;
import com.builder.food.VegBurger;

/**
 * @Author:泡泡
 * @Date:16:35 2018/9/12
 * @Modified By:
 */
public class MealBuilder {

    public Meal prepareVegMeal(){
        Meal meal=new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal(){
        Meal meal=new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
