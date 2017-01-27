
import entities.Person;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author root
 */
public class Main {
    
    @PersistenceContext
    private static EntityManager em;
    public static void main (String args[]) {
        Main main = new Main();
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        em.find(Person.class, "abc");
    }
}
