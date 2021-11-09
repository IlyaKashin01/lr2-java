package com.company.DAO;

import com.company.beans.Users;

import java.util.ArrayList;
import java.util.List;

public class UsersDAO {
    private DBImpl impl = DBImpl.init();

    public void create (Users user){
        impl.users.put(user.getId() , user);
    }

    public void update (Users user){
        impl.users.put(user.getId(),  user);
    }

    public void delete (long id){
        impl.users.remove(id);
    }

    public Users getById (long id){
        return impl.users.get(id);
    }

    public List<Users> getAll(){
        ArrayList<Users> list = new ArrayList<>(impl.users.values());
        return list;
    }

    public List<Users> getInstance(long id, String name, int password, int age, long roleId){
        List<Users> usersList = getAll();

        System.out.println("Result search:");
        for (Users users: usersList){
            if(users.getId() == id) {
                System.out.println(users);
            }
            else if (users.getName() == name){
                System.out.println(users);
            }
            else if (users.getPassword() == password){
                System.out.println(users);
            }
            else if (users.getAge() == age){
                System.out.println(users);
            }
            else if (users.getRoleId() == roleId){
                System.out.println(users);
            }
            else if (users.getName() == name && users.getRoleId() == roleId){
                System.out.println(users);
            }
        }
        return usersList;
    }
}
