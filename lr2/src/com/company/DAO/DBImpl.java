package com.company.DAO;

import com.company.beans.*;

import java.util.HashMap;

public class DBImpl {
    public HashMap<Long, Roles> roles;
    public HashMap<Long, Users> users;
    private static DBImpl instance = new DBImpl();

    private DBImpl(){
        this.roles = new HashMap<Long, Roles>();
        this.users = new HashMap<Long, Users>();
    }

    public static DBImpl init(){
        return instance;
    }
}
