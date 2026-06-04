/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.model;

/**
 *  File:   Mahasiswa.java
 *  Desc:   Mahasiswa file
 */
public class Mahasiswa {
//    attributes
    private int id;
    private String name;
    
//    methods
    public Mahasiswa() {
        
    }

    public Mahasiswa(int ids, String namee) {
        id = ids;
        name = namee;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int ids) {
        id = ids;
    }

    public void setName(String namee) {
        name = namee;
    }
    
    @Override
    public String toString(){
        return "Mahasiswa {" + "id = " + id + ", name = " + name + "}";
    }
}
