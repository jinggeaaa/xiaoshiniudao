package com.proxyPattern.staticProxy;

/**
 * @Author:泡泡
 * @Date:15:10 2018/6/12
 * @Modified By:
 */
public class UserDaoProxy implements IUserDao
{
  //接收保存目标对象
    private IUserDao target;

    public UserDaoProxy(IUserDao target){
        this.target=target;
    }
    @Override
    public void save() {
        System.out.println("start transaction ********");
        System.out.println("handled things through a proxy object");
        target.save();
        System.out.println("commit transaction ********");
    }
}
