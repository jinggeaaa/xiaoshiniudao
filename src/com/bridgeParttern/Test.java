package com.bridgeParttern;

/**
 * @Author:泡泡
 * @Date:10:10 2018/6/21
 * @Modified By:
 */
public class Test {

    public static void main(String[] args) {
        Maobi pen =new BigPen();//大的
        PenColor color=new RedColor();//红色的
        pen.setColor(color);
        pen.paint();
    }
}
