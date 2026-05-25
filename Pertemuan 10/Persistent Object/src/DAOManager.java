/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *  File:   DAOManager.java
 *  Desc:   kind of like the controller?
 */
public class DAOManager {
//    attributes
    private PersonDAO personDAO;
    
//    methods
    public void setPersonDAO(PersonDAO person){
        personDAO = person;
    }

    public PersonDAO getPersonDAO() {
        return personDAO;
    }
}
