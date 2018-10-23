package com.single;

/**
 * @Author:泡泡
 * @Date:15:57 2018/9/12
 * @Modified By:
 */
public class Test {
    public static void main(String[] args) {
        MySingle single=MySingle.getSingle();
        MySingle single12=MySingle.getSingle();
        HungryLazy hungryLazy=HungryLazy.getHungryLazy();
        HungryLazy hungryLazy1=HungryLazy.getHungryLazy();
        System.out.println(single==single12);
    }
}
