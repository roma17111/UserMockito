package org.example.services;

import org.example.dao.UserDao;
import org.example.dao.UserDaoImpl;
import org.example.models.User;

public class UserServiceImpl implements UserService{

    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = new UserDaoImpl();
    }

    @Override
    public Boolean checkUserExist(User user) {
        if (userDao.findAllUsers().contains(user)) {
            return userDao.findAllUsers().contains(user);
        } else {
            return false;
        }
    }

}
