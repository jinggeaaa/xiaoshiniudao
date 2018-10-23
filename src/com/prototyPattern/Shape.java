package com.prototyPattern;

/**
 * @Author:泡泡
 * @Date:9:44 2018/9/13
 * @Modified By:
 */
public abstract  class Shape implements Cloneable {

    private int id;

    protected String type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    abstract  String drow();

    @Override
    protected Object clone(){
        Object obj=null;
        try {
            obj=super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }
}
