/**
 *  File:   Data.java
 *  Desc:   Generic class?
 */
public class Data<T> {
    // attributes
    private Object[] ruang;
    private int banyak;

    // methods
    Data() {
        ruang = new Object[100];
        banyak = 0;
    }

    public void setIsi(int posisi, T objek) {
        if (ruang[posisi - 1] == null) {
            banyak++;
        }
        ruang[posisi - 1] = objek;
    }

    @SuppressWarnings("unchecked")
    public T getIsi(int posisi) {
        return (T) ruang[posisi - 1];
    }

    public int getSize() {
        return banyak;
    }
}