/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhusudhan.jh.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author mkonda
 */
public class JPATest {

    private EntityManagerFactory factory = null;
    private EntityManager em = null;

    private void init() {
        factory = Persistence.createEntityManagerFactory("trading-entities");
        em = factory.createEntityManager();
        System.out.println("Manager created: " + em);
    }

    private void persistNewInstrument() {

        Instrument instrument = new Instrument();
        instrument.setIssue("IBM");
        em.getTransaction().begin();
        em.persist(instrument);
        em.getTransaction().commit();
    }

    public static void main(String[] args) {
//        Persistence.generateSchema("samplePU", null);
        JPATest test = new JPATest();
        test.init();
        test.persistNewInstrument();
    }
}
