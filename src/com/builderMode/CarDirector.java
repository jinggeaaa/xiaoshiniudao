package com.builderMode;

/**
 * @Author:泡泡
 * @Date:11:46 2018/6/7
 * @Modified By:
 * 指导者
 */
public class CarDirector {
    public Car constructCar(ICarBuilder builder){
        builder.buildWheel();
        builder.buildEngine();
       // builder.buildSkeleton();
        return builder.buildCar();
    }
}
