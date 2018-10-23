package com.builder;

/**
 * @Author:泡泡
 * @Date:16:11 2018/9/12
 * @Modified By:
 * 建造者模式
 * 创建一个食物条目和食物包装的接口
 */
public interface Item {

    public String name();
    public Packing packing();
    public  float price();
}

