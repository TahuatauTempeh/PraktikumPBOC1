// File         : Anabul.java
// Deskripsi    : subclass of anabul
// NIM / Nama   : 24060124140195 / Azka Aqylla Maulana
// Tanggal      : 23.04.26

public class Kucing extends Anabul{
    // methods
    Kucing(String nem){
        super(nem);
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
