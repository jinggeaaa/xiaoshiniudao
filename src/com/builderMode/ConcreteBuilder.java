package com.builderMode;

import javax.swing.*;

/**
 * @Author:泡泡
 * @Date:11:41 2018/6/7
 * @Modified By:
 * 具体建造者
 */
public class ConcreteBuilder implements ICarBuilder {

    Car car;

    public ConcreteBuilder(){
        car=new Car();
    }
    @Override
    public void buildWheel() {
       car.setWheel("米其林轮胎");
    }

    @Override
    public void buildSkeleton() {
        car.setSkeleton("铝合金");
    }

    @Override
    public void buildEngine() {
        car.setEngine("cx5Engine");
    }

    @Override
    public Car buildCar() {
        return this.car;
    }
}
