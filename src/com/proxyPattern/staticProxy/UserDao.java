package com.proxyPattern.staticProxy;

/**
 * @Author:泡泡
 * @Date:15:09 2018/6/12
 * @Modified By:
 * 目标对象
 */
public class UserDao implements IUserDao {
    @Override
    public void save() {
        System.out.println("---has saved the datas！");
    }
}
