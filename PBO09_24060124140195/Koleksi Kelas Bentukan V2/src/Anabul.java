/**
 *  File:   Anabul.java
 *  Desc:   Anabul Class
 */
public abstract class Anabul {
    // attributes
    String Nama;

    // methods
    Anabul(String nem){
        Nama = nem;
    }

    public abstract void Gerak();

    public abstract void Bersuara();
}