package com.builderMode;

/**
 * @Author:泡泡
 * @Date:11:47 2018/6/7
 * @Modified By:
 */
public class Maintest {

    public static void main(String[] args) {
        CarDirector director=new CarDirector();
        Car car=director.constructCar(new ConcreteBuilder());
        System.out.println(car.getWheel());
        System.out.println(car.getEngine());
        System.out.println(car.getSkeleton());
    }
}
