/**
 *  File:   OpertatorGenerik.java
 *  Desc:
 */
public class OpertatorGenerik {
    public static <T> void Tukar(Datum<T> a, Datum<T> b){
        T temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }

    public static <T extends Kucing> double Bobot2(T kucingA, T kucingB) {
        return kucingA.getBobot() + kucingB.getBobot();
    }
}