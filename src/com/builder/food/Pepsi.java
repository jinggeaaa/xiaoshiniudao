package com.builder.food;

/**
 * @Author:泡泡
 * @Date:16:30 2018/9/12
 * @Modified By:
 */
public class Pepsi extends ColdDrink {
    @Override
    public float price() {
        return 16.32f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
