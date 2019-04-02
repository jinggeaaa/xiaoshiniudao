package com.prototyPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author:泡泡  jingge
 * @Date:10:00 2018/9/13
 * @Modified By:
 */
public class TestModel {

    public static void main(String[] args) {
        ShapeCache shapeCache=new ShapeCache();
        shapeCache.loadShape();
        Shape shape1=shapeCache.getShape(1);
        //shape1.setType("fsfsdf");
        //shape1.setId(2);
        System.out.println(shape1.getType()+"--"+shape1.getId());
        Map map=new HashMap();
        map.put(null,"ddd");
        map.put(null,"eeee");
        System.out.println(map.get(null));
        System.out.println("git tijiao ");
        System.out.println("git er ci");
        System.out.println(" git  san ");

    }
}
