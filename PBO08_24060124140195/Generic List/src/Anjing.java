// File         : Anjing.java
// Deskripsi    : subclass of Anabul
// NIM / Nama   : 24060124140195 / Azka Aqylla Maulana
// Tanggal      : 30.04.26

public class  Anjing extends Anabul{
    // methods
    Anjing(String nem){
        super(nem);
    }

    @Override
    public void Gerak(){
        System.out.println(Nama + " melata");
    }
    
    @Override
    public void Bersuara(){
        System.out.println(Nama + " guk-guk");
    }
}

