package com.builder.food;

/**
 * @Author:泡泡
 * @Date:16:28 2018/9/12
 * @Modified By:
 */
public class ChickenBurger extends Burger {
    @Override
    public float price() {
        return 30.25f;
    }

    @Override
    public String name() {
        return "Chicken burger";
    }
}
