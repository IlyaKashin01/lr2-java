package com.company;

import com.company.DAO.RolesDAO;
import com.company.DAO.UsersDAO;
import com.company.beans.Roles;
import com.company.beans.Users;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        RolesDAO rolesDAO = new RolesDAO();
        UsersDAO usersDAO = new UsersDAO();

        Users user = new Users();
        user.setId(1L);
        user.setName("Steve");
        user.setPassword(1232);
        user.setAge(22);
        user.setRoleId(3L);
        usersDAO.create(user);

        user = new Users();
        user.setId(2L);
        user.setName("Mike");
        user.setPassword(64812);
        user.setAge(35);
        user.setRoleId(2L);
        usersDAO.create(user);

        user = new Users();
        user.setId(3L);
        user.setName("Mark");
        user.setPassword(15697);
        user.setAge(29);
        user.setRoleId(1L);
        usersDAO.create(user);

        user = new Users();
        user.setId(4L);
        user.setName("Alex");
        user.setPassword(47687);
        user.setAge(40);
        user.setRoleId(4L);
        usersDAO.create(user);

        List<Users> usersList = usersDAO.getAll();

        for (Users users: usersList){
            System.out.println(users);
        }

        System.out.println();

        List<Users> search = usersDAO.getInstance(3L, null,0, 0, 0);

        System.out.println();

        Roles role = new Roles();
        role.setId(1L);
        role.setName("Administrator");
        rolesDAO.create(role);

        role = new Roles();
        role.setId(2L);
        role.setName("Teamlead");
        rolesDAO.create(role);

        role = new Roles();
        role.setId(3L);
        role.setName("Programmer");
        rolesDAO.create(role);

        role = new Roles();
        role.setId(4L);
        role.setName("Customer");
        rolesDAO.create(role);

        List<Roles> rolesList = rolesDAO.getAll();

        for (Roles roles: rolesList){
            System.out.println(roles);
        }
    }
}
