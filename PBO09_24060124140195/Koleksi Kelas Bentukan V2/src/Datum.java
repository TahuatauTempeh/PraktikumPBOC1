/**
 *  File:   Datum.java
 *  Desc:
 */
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