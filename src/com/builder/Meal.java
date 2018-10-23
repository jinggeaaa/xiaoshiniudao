package com.builder;

import sun.rmi.log.LogInputStream;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:泡泡
 * @Date:16:31 2018/9/12
 * @Modified By:
 */
public class Meal {

    private List<Item> items=new ArrayList<>();
    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost=0.0f;
        for(Item item:items){
            cost=cost+item.price();
        }
        return cost;
    }
    public void showItems(){
        for(Item item:items){
            System.out.println("name:"+item.name());
            System.out.println("packing:"+item.packing());
            System.out.println("price:"+item.price());
        }
    }
}
