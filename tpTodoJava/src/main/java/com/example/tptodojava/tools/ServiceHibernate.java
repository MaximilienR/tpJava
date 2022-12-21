package com.example.tptodojava.tools;
import org.hibernate.Session;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

import java.awt.*;

@Service
@RequestScope
public class ServiceHibernate {

    private org.hibernate.Session _session;

    private ServiceHibernate(){
        try {
            _session=HibernateUtil.getSessionFactory().openSession();
        }catch (HeadlessException e){
            throw new RuntimeException(e);
        }
    }
    public Session getsession(){return _session};
}
