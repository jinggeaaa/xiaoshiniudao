package com.builder.food;

/**
 * @Author:泡泡
 * @Date:16:26 2018/9/12
 * @Modified By:
 */
public class VegBurger extends Burger {
    @Override
    public float price() {
        return 25.6f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
