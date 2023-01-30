package org.example.dao;

import org.example.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao{


    private static List<User> users = new ArrayList<>();

    public UserDaoImpl() {
        users.add(new User("Roman"));
        users.add(new User("Veronika"));
        users.add(new User("Egor"));
    }

    @Override
    public User getUserByName(String name) {
        if (users.contains(name)) {
            return new User(name);
        } else {
            return null;
        }
    }

    @Override
    public List<User> findAllUsers() {
        return users;
    }
}
