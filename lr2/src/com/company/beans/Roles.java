package com.company.beans;

public class Roles extends BaseBean {

    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return getId() + " " + this.name;
    }
}
