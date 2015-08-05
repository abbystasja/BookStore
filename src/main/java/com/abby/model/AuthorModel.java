package com.abby.model;

import com.abby.entity.Author;
import com.abby.util.HibernateUtil;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class AuthorModel {
    private List<Author> authors;

    public AuthorModel(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        authors = session.createCriteria(Author.class).list();
    }

    public List<Author> getAllAuthors(){
        return authors;
    }

}
