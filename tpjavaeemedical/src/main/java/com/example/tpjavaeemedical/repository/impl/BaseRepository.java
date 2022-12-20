package com.example.tpjavaeemedical.repository.impl;

import com.example.tpjavaeemedical.utile.HibernateSession;

import javax.transaction.Transaction;

public abstract class BaseRepository<T> implements IRepository<T> {

    protected Transaction transaction;
    protected BaseRepository() {
        transaction = HibernateSession.getInstance().getTransaction();
    }
    @Override
    public boolean create(T element) {
        Serializable s = HibernateSession.getInstance().save(element);
        transaction.commit();
        HibernateSession.getInstance().close();
        return s != null;
    }


