package org.example.dao;

import org.example.models.User;

import java.util.List;

public interface UserDao {


    String getUserByName(String name);

    List<User> findAllUsers();
}
