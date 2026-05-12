// File         : OperatorGenerik.java
// Deskripsi    : generic operator class
// NIM / Nama   : 24060124140195 / Azka Aqylla Maulana
// Tanggal      : 30.04.26

public class OperatorGenerik {
    public static <T> void Tukar(Datum<T> a, Datum<T> b){
        T temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }

    public static <T extends Kucing> double Bobot2(T kucingA, T kucingB) {
        return kucingA.getBobot() + kucingB.getBobot();
    }

}
