package com.company.DAO;

import com.company.beans.Roles;
import com.company.beans.Users;

import java.util.ArrayList;
import java.util.List;

public class RolesDAO {
    private DBImpl impl = DBImpl.init();

    public void create (Roles role){
        impl.roles.put(role.getId() , role);
    }

    public void update (Roles role){
        impl.roles.put(role.getId(),  role);
    }

    public void delete (long id){
        impl.roles.remove(id);
    }

    public Roles getById (long Id){
        return impl.roles.get(Id);
    }

    public List<Roles> getAll(){
        ArrayList<Roles> list = new ArrayList<>(impl.roles.values());
        return list;
    }
}
