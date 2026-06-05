import java.util.*;

/**
 *  File:   LambdaMap.java
 *  Desc:   Testings
 */
public class LambdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();

        mahasiswaMap.put("24060124140195", "Azka");
        mahasiswaMap.put("24060124140101", "Ica");
        mahasiswaMap.put("24060124140102", "John Umamusume");
        mahasiswaMap.put("24060124140103", "Agemasen");

        System.out.println("Daftar Mahasiswa:");
        System.out.println("=================");

        mahasiswaMap.forEach((nim, nama)
                -> System.out.println("NIM: " + nim + " | Nama: " + nama)
        );
    }
}