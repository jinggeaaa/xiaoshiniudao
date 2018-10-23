package com.builder.food;

import com.builder.Item;
import com.builder.Packing;
import com.builder.packges.Wrapper;

/**
 * @Author:泡泡
 * @Date:16:21 2018/9/12
 * @Modified By:
 */
public abstract class Burger implements Item {


    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
