package com.proxyPattern.staticProxy;

/**
 * @Author:泡泡
 * @Date:15:13 2018/6/12
 * @Modified By:
 */
public class TestApp {

    public static void main(String[] args) {
        UserDao target=new UserDao();

        //目标对象传递给代理对象 由代理对象处理目标对象的功能
        UserDaoProxy uproxy=new UserDaoProxy(target);
        uproxy.save();

    }
}
