package com.bookhub.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bookhub.model.Book;

@Repository
public class BookDAOImpl implements BookDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(Book book) {
        sessionFactory.getCurrentSession().saveOrUpdate(book);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Book> getAllBooks() {
        return sessionFactory.getCurrentSession().createQuery("from Book").list();
    }
}
