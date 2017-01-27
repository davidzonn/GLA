/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import entities.Person;
import services.PersonManager;
import services.PersonManagerLocal;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author root
 */
@ManagedBean
@RequestScoped
public class managedBean {

    @EJB
    PersonManagerLocal personManager;
    /**
     * Creates a new instance of managedBean
     */
    public managedBean() {
        
    }
    
    public String addPerson() {
        
        Person person = new Person();
        personManager.addPerson(person);
        return person.toString() + " Inserted into the database";
    }
    
}
