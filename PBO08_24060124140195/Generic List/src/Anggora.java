// File         : Anggora.java
// Deskripsi    : subclass of Kucing
// NIM / Nama   : 24060124140195 / Azka Aqylla Maulana
// Tanggal      : 30.04.26

public class Anggora extends Kucing {
    // methods
    Anggora(String nem, double weight) {
        super(nem, weight);
    }
    @Override
    public void Bersuara() {
        System.out.println(Nama + " purrr (Anggora)");
    }
}