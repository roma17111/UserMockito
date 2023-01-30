package org.example;

import org.example.dao.UserDaoImpl;

public class Main {
    public static void main(String[] args) {
        UserDaoImpl userDao = new UserDaoImpl();
        System.out.println(userDao.findAllUsers());
    }
}