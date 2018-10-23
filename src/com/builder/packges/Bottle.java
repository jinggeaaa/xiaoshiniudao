package com.builder.packges;

import com.builder.Packing;
import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;

/**
 * @Author:泡泡
 * @Date:16:19 2018/9/12
 * @Modified By:
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
