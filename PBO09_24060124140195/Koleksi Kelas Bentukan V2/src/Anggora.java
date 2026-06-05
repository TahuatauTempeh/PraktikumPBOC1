/**
 *  File:   Anggora.java
 *  Desc:   Anggora file
 */
public class Anggora extends Kucing{
    // methods
    Anggora(String nem, double weight) {
        super(nem, weight);
    }
    @Override
    public void Bersuara() {
        System.out.println(Nama + " purrr (Anggora)");
    }
}