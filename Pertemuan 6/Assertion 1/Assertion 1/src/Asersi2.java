/**
 *  File:   Asersi2.java
 *  Desc:   Asersi 2 file
 */

class Lingkaran {
    private double jariJari;

    public Lingkaran(double jariJarii) {
        jariJari = jariJarii;
    }
    
    public double hitungKeliling(){
        double keliling = 2 * Math.PI *jariJari;
        
        return keliling;
    }
    
    
}

public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        
        assert(jariJari > 0) : "can't be zero mate";
        
        Lingkaran uno = new Lingkaran(jariJari);
        
        double kelilingLingkaran = uno.hitungKeliling();
        
        System.out.println("Keliling thing: " + kelilingLingkaran);
    }
}