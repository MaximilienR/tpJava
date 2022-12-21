package com.example.tptodojava.service;

import com.example.tptodojava.entity.Todo;
import com.example.tptodojava.interfaces.IDAO;

import com.example.tptodojava.tools.ServiceHibernate;
import com.mysql.cj.Query;
import jakarta.websocket.Session;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService  implements IDAO<Todo> {

    private ServiceHibernate serviceHibernate;
    private Session session;

    @Override
    public boolean create(Todo o) {
        session.beginTransaction();
        session.save(o);

        return  true;
    }

    @Override
    public boolean update(Todo o) {
        session.beginTransaction();
        session.delete(o);
        return true;
    }


    @Override
    public boolean delete(Todo o) {
        session.beginTransaction();
        session.delete(o);
        return true;
    }

    @Override
    public Todo findById(int id) {
        return null;
    }

    @Override
    public List<Todo> findAll() {
        session.beginTransaction();
        Query<Todo> todoQuery=session.createQuerrt("from Todo");
        return null;
    }
}
