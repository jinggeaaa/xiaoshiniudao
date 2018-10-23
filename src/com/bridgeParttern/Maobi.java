package com.bridgeParttern;

/**
 * @Author:泡泡
 * @Date:9:59 2018/6/21
 * @Modified By:
 * 桥接模式
 * 不同平台下 调用不同的规则
 *  桥接模式：不仅Implementor具有变化（ConcreteImplementor），
 *  而且Abstraction也可以发生变化（RefinedAbstraction），而且两者的变化是完全独立的，
 *  RefinedAbstraction与ConcreateImplementor之间松散耦合，
 *  它们仅仅通过Abstraction与Implementor之间的关系联系起来。强调Implementor接口仅提供基本操作，
 *  而Abstraction则基于这些基本操作定义更高层次的操作。
 *
 *  把两种不同的事物 松散的耦合在一起 （毛笔和颜色）
 */
public abstract class Maobi {

    PenColor color;

    public void setColor(PenColor color) {
        this.color = color;
    }

    public void paint(){
        color.color();
    }
}
