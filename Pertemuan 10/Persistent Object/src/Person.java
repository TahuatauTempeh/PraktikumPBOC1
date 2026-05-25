/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *  File:   Person.java
 *  Desc:   The file containing the Person class?
 */

import java.io.*;

public class Person implements Serializable{
//    attributes
    private int id;
    private String name;
    
//    methods
    public Person(String input_name){
        name = input_name;
    }
    
    public Person(int idd, String input_name){
        id = idd;
        name = input_name;
    }
    
    public int getID(){
        return id;
    }

    public String getName() {
        return name;
    }
}