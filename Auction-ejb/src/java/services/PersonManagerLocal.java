/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Person;
import javax.ejb.Local;

/**
 *
 * @author root
 */
@Local
public interface PersonManagerLocal {
    public Person addPerson(Person person);
}
