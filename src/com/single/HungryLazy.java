package com.single;

/**
 * @Author:泡泡
 * @Date:16:02 2018/9/12
 * @Modified By:
 *
 */
public class HungryLazy {
    private static HungryLazy hungryLazy=new HungryLazy();

    private HungryLazy(){}
    public static HungryLazy getHungryLazy(){
        return hungryLazy;
    }
}
