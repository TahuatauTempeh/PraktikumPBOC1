/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Akka
 */
public class Person {
    // atrtributes
    private int id;
    private String name;

    // methrs
    public Person(int ids, String namee) {
        id = ids;
        name = namee;
    }
    
    public Person(String namee) {
        name = namee;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
