package org.example.service;

import com.google.inject.Inject;
import org.example.dao.UserDao;

public class UserService {
    @Inject
    private UserDao userDao;

    public void say() {
        userDao.say();
    }
}
