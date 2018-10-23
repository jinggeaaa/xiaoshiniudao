package com.proxyPattern.cglib;

/**
 * @Author:泡泡
 * @Date:17:04 2018/6/12
 * @Modified By:
 */
public class TestApp {
    public static void main(String[] args) {
        UserDao target = new UserDao();

        //代理对象
        UserDao proxy = (UserDao)new ProxyFactory(target).getProxyInstance();

        //执行代理对象的方法
        proxy.save();
    }
}
