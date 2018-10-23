package com.builderMode;

/**
 * @Author:泡泡
 * @Date:11:39 2018/6/7
 * @Modified By:
 * 抽象建造者
 */
public interface ICarBuilder {
    public void buildWheel();

    public void buildSkeleton();

    public void buildEngine();

    Car buildCar();
}





































