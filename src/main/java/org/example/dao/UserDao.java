package org.example.dao;

import com.google.inject.Singleton;

@Singleton
public class UserDao {
    public void say(){
        System.out.println("userDao say hello to guice");
    }
}
