package com.abby.model;

import com.abby.entity.User;
import com.abby.util.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class UserModel {

    public UserModel() {

    }

    public boolean isUserInDataBase(User user){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria cr = session.createCriteria(User.class);
        cr.add(Restrictions.eq("login", user.getLogin()));
        cr.add(Restrictions.eq("password", user.getPassword()));
        return cr.list().size() > 0;
    }

    public User getUser(User user){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria cr = session.createCriteria(User.class);
        cr.add(Restrictions.eq("login", user.getLogin()));
        cr.add(Restrictions.eq("password", user.getPassword()));
        return (User)cr.list().get(0);
    }

    public void addUser(User user){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        session.close();
    }

}
