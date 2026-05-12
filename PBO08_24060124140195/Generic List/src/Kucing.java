// File         : Kucing.java
// Deskripsi    : subclass of anabul
// NIM / Nama   : 24060124140195 / Azka Aqylla Maulana
// Tanggal      : 30.04.26

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
