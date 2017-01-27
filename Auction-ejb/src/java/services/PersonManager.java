/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Person;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

/**
 *
 * @author root
 */
@Stateless
public class PersonManager implements PersonManagerLocal {

    @PersistenceUnit(unitName = "Auction-ejbPU")
    private EntityManagerFactory factory;
    private EntityManager em;
    @Override
    public Person addPerson(Person person) {
        em = factory.createEntityManager();
        em.persist(person);
        
        return person;
    }
}
