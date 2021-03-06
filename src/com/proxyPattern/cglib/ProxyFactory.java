package com.proxyPattern.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @Author:泡泡
 * @Date:16:59 2018/6/12
 * @Modified By:
 */
public class ProxyFactory implements MethodInterceptor{

    private Object target;
    public ProxyFactory(Object target){
        this.target=target;
    }
    //给目标对象创建一个代理对象
    public Object getProxyInstance(){
        //1.工具类
        Enhancer en = new Enhancer();
        //2.设置父类
        en.setSuperclass(target.getClass());
        //3.设置回调函数
        en.setCallback(this);
        //4.创建子类(代理对象)
        return en.create();

    }
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("开始事务..."+method.getName());
        //执行目标对象的方法
        Object returnValue = method.invoke(target, args);
        System.out.println("提交事务..."+method.getName());
        return returnValue;
    }
}
