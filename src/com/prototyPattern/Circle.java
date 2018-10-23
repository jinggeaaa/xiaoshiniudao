package com.prototyPattern;

import sun.security.provider.SHA;

/**
 * @Author:泡泡
 * @Date:9:46 2018/9/13
 * @Modified By:
 */
public class Circle extends Shape {

    public void type(){
       type="circle";
    }

    @Override
    String drow() {
        return "drow circle";
    }
}
