// File         : Datum.java
// Deskripsi    : generic class Datum
// NIM / Nama   : 24060124140195 / Azka Aqylla Maulana
// Tanggal      : 30.04.26

public class Datum<T> {
    // attributes
    private T isi;
    
    // methods
    Datum(T isiBaru) {
        isi = isiBaru;
    }
    public T getIsi() {
        return isi;
    }
    public void setIsi(T isiBaru) {
        isi = isiBaru;
    }
}