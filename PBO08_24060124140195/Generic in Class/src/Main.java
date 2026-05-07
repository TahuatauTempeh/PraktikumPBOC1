// File         : Main.java
// Deskripsi    : main file
// NIM / Nama   : 24060124140195 / Azka Aqylla Maulana
// Tanggal      : 30.04.26

public class Main {
    public static void main(String[] args) {
        Anggora anggora1 = new Anggora("Luna", 3.5);
        Datum<Anabul> datumAnabul = new Datum<>(anggora1);
        
        System.out.println("=== Datum berisi Anggora ===");
        System.out.println("Nama  : " + datumAnabul.getIsi().Nama);
        System.out.println("Bobot : " + ((Kucing) datumAnabul.getIsi()).bobot + " kg");
        System.out.print("Suara : ");
        
        datumAnabul.getIsi().Bersuara();
        
        System.out.print("Gerak : ");
        
        datumAnabul.getIsi().Gerak();

        KembangTelon kembl = new KembangTelon("Mochi", 4.2);

        datumAnabul.setIsi(kembl);

        System.out.println("\n=== Datum setelah setIsi (KembangTelon) ===");
        System.out.println("Nama  : " + datumAnabul.getIsi().Nama);
        System.out.println("Bobot : " + ((Kucing) datumAnabul.getIsi()).bobot + " kg");
        System.out.print("Suara : ");
        
        datumAnabul.getIsi().Bersuara();
        
        System.out.print("Gerak : ");
        
        datumAnabul.getIsi().Gerak();

        Anjing anjing1 = new Anjing("Rex");
        
        datumAnabul.setIsi(anjing1);
        
        System.out.println("\n=== Datum setelah setIsi (Anjing) ===");
        System.out.println("Nama  : " + datumAnabul.getIsi().Nama);
        System.out.print("Suara : ");
        
        datumAnabul.getIsi().Bersuara();
        
        System.out.print("Gerak : ");
        
        datumAnabul.getIsi().Gerak();

        
        Kucing kucing1 = new Kucing("Kitty", 2.5);
        Datum<Kucing> datumKucing = new Datum<>(kucing1);
        
        System.out.println("\n=== Datum<Kucing> berisi Kucing ===");
        System.out.println("Nama  : " + datumKucing.getIsi().Nama);
        System.out.println("Bobot : " + datumKucing.getIsi().bobot + " kg");
        System.out.print("Suara : ");
        
        datumKucing.getIsi().Bersuara();
    }
}