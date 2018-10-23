package com.builder.food;

/**
 * @Author:泡泡
 * @Date:16:29 2018/9/12
 * @Modified By:
 */
public class Coke extends ColdDrink {
    @Override
    public float price() {
        return 15.2f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
