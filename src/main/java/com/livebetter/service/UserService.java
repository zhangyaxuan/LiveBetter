package com.livebetter.service;

import com.livebetter.dao.UserDao;
import com.livebetter.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserService {
    @Autowired
    private UserDao dao;

    public void saveUser(User user) {
        dao.saveUser(user);
    }
}
