/**
 *  File:   Kucing.java
 *  Desc:   Kucing class
 */
public class Kucing extends Anabul{
     // attributes
    double bobot;

    // methods
    Kucing(String nem, double weight){
        super(nem);
        bobot = weight;
    }

    public double getBobot() {
        return bobot;
    }
    
    @Override
    public void Gerak(){
        System.out.println(Nama + " melata");
    }
    
    @Override
    public void Bersuara(){
        System.out.println(Nama + " meong");
    }
}