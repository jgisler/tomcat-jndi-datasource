package org.gislers.tomcat.jndi.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseDaoImpl {

    private SessionFactory sessionFactory;

    @Autowired
    protected void setSessionFactory( SessionFactory sessionFactory ) {
        this.sessionFactory = sessionFactory;
    }

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    protected void persist( Object entity ) {
        getSession().persist( entity );
    }

    protected void delete( Object entity ) {
        getSession().delete( entity );
    }
}
