package com.prototyPattern;

import sun.security.provider.SHA;

/**
 * @Author:泡泡
 * @Date:9:49 2018/9/13
 * @Modified By:
 */
public class Square extends Shape {

    public void type(){
       type="square";
    }

    @Override
    String drow() {
        return " draw square ";
    }
}
