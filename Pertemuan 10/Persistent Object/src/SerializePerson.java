/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *  File:   SerializePerson.java
 *  Desc:   Converter for Person file to .ser
 */
import java.io.*;

//
//class Person implements Serializable{
//    private String name;
//
//    public Person(String names) {
//        name = names;
//    }
//
//    public String getName() {
//        return name;
//    }
//}

public class SerializePerson{
    public static void main(String[] args){
        Person person = new Person("Panji");
        
        try{
            FileOutputStream f = new FileOutputStream("person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(person);
            System.out.println("Done writing person object");
            s.close();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
