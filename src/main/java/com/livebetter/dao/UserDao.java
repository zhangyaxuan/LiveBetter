package com.livebetter.dao;

import com.livebetter.model.User;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDao extends AbstractDao<User>{

    public void saveUser(User user){
        persist(user);
    }
}
