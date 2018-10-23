package com.prototyPattern;

import java.util.Hashtable;

/**
 * @Author:泡泡
 * @Date:9:53 2018/9/13
 * @Modified By:
 */
public class ShapeCache {

    private Hashtable<Integer,Shape> shapeHashtable=new Hashtable<>();

    public Shape getShape(Integer id){
        Shape shape=this.shapeHashtable.get(id);
        Shape cloneShape=(Shape)shape.clone();
        System.out.println("clone is == prototype "+(shape==cloneShape));
        return cloneShape;
    }

    public void loadShape(){
        Circle circle=new Circle();
        circle.setType("circle");
        circle.setId(1);
        shapeHashtable.put(circle.getId(),circle);

        Square square=new Square();
        square.setType("square");
        square.setId(2);
        shapeHashtable.put(square.getId(),square);

        Rectangle rectangle=new Rectangle();
        rectangle.setId(3);
        rectangle.setType("rectangle");
        shapeHashtable.put(rectangle.getId(),rectangle);

    }
}
