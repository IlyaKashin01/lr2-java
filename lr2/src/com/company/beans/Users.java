package com.company.beans;

public class Users extends BaseBean {
    private String name;
    private int password;
    private int age;
    private long roleId;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    public String toString(){
        return getId() + " " + this.name + " " + this.password + " " + this.age + " " + this.roleId;
    }
}
