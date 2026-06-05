/**
 *  File:   KembangTelon.java
 *  Desc:
 */
public class KembangTelon extends Kucing {
    KembangTelon(String nem, double weight) {
        super(nem, weight);
    }
    @Override
    public void Bersuara() {
        System.out.println(Nama + " meong~ (Kembangtelon)");
    }
}