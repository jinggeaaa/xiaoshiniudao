package com.builder.food;

import com.builder.Item;
import com.builder.Packing;
import com.builder.packges.Bottle;

/**
 * @Author:泡泡
 * @Date:16:24 2018/9/12
 * @Modified By:
 */
public abstract  class ColdDrink implements Item {


    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price() ;
}
