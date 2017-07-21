package com.livebetter.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * Created by mac on 21/07/2017.
 */
public abstract class AbstractDao<T> {
    @Autowired
    private SessionFactory sessionFactory;

    protected Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    public void persist(T entity){
        getSession().persist(entity);
    }
}
