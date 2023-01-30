package org.example.services;

import org.example.dao.UserDao;
import org.example.models.User;

public class UserServiceImpl implements UserService{

    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public boolean checkUserExist(User user) {
        if (userDao.findAllUsers().contains(user)) {
            return true;
        } else {
            return false;
        }
    }
}
