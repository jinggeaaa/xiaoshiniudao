package com.single;

/**
 * @Author:泡泡
 * @Date:15:54 2018/9/12
 * @Modified By:
 * 双检锁
 */
public class MySingle {
    private static MySingle mySingle;
    private  MySingle(){}

    public  static MySingle getSingle(){
        if(mySingle==null){
            synchronized (MySingle.class){
                if(mySingle==null){
                   mySingle=new MySingle();
                }
            }
        }
        return mySingle;
    }
}
