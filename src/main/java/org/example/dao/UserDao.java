package org.example.dao;

import org.example.models.User;

import java.util.List;
import java.util.Optional;

public interface UserDao {


    User getUserByName(String name);

    List<User> findAllUsers();
}
