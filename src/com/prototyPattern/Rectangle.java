package com.prototyPattern;

/**
 * @Author:泡泡
 * @Date:9:51 2018/9/13
 * @Modified By:
 */
public class Rectangle extends Shape {

    public void type(){
        type="rectangle";
    }

    @Override
    String drow() {
        return "draw rectangle";
    }
}
