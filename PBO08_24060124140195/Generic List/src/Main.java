// File         : Main.java
// Deskripsi    : main file with generic operator testing
// NIM / Nama   : 24060124140195 / Azka Aqylla Maulana
// Tanggal      : 12.05.26

public class Main {
    public static void main(String[] args) {
        // existing initialization logic
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

        Datum<String> datum1 = new Datum<>("Apel");
        Datum<String> datum2 = new Datum<>("Mangga");

        System.out.println("\n=== Sebelum Tukar ===");
        System.out.println("Datum 1: " + datum1.getIsi());
        System.out.println("Datum 2: " + datum2.getIsi());

        OperatorGenerik.Tukar(datum1, datum2);

        System.out.println("\n=== Sesudah Tukar ===");
        System.out.println("Datum 1: " + datum1.getIsi());
        System.out.println("Datum 2: " + datum2.getIsi());

        Anggora cat_a = new Anggora("Luna", 3.5);
        KembangTelon cat_b = new KembangTelon("Mochi", 4.2);

        double total_bobot = OperatorGenerik.Bobot2(cat_a, cat_b);
        
        System.out.println("\n=== Total Bobot Menggunakan OperatorGenerik ===");
        System.out.println("Total : " + total_bobot + " kg");

        
        System.out.println("\n=== Generic List ===");
        Data<Anabul> dataAnabul = new Data<>();

        dataAnabul.setIsi(1, new Anggora("Loki", 3.2));
        dataAnabul.setIsi(2, new KembangTelon("Sari", 2.8));
        dataAnabul.setIsi(3, new Anjing("Bruno"));

        System.out.println("Size : " + dataAnabul.getSize());

        for (int i = 1; i <= dataAnabul.getSize(); i++) {
            Anabul pet = dataAnabul.getIsi(i);
            System.out.print("Isi(" + i + ") : " + pet.Nama + " -> ");
            pet.Bersuara();
        }
    }
}