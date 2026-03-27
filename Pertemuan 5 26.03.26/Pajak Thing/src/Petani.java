// File         : Petani.java
// Deskripsi    : petani class file
// NIM / Nama   : 24060124140195 / Azka Aqylla Maulana
// Tanggal      : 26.03.26

import java.time.LocalDate;

public class Petani extends Manusia {
    // attirubtes
    private String asal_kota;
    private static int counter_petani;

    // methods

    // constructor
    // no parameters
    public Petani(){
        super();
        asal_kota = "_";
        counter_petani ++;
    }

    // with parameters
    public Petani(String name, String date, String address, double salary, String origin_city){
        super(name, date, address, salary);
        asal_kota = origin_city;
        counter_petani ++;
    }

    // selectors
    public String getAsal_kota() {
        return asal_kota;
    }

    public static int getCounter_petani() {
        return counter_petani;
    }

    // mutators
    public void setAsal_kota(String asal_kota) {
        this.asal_kota = asal_kota;
    }

    // other methods
    @Override
    public int hitungMasaKerja(){
        if (tngl_mulai_kerja != null) {
            int current_year = LocalDate.now().getYear();
            int start_year = tngl_mulai_kerja.getYear();

            int how_long = (current_year - start_year) + 1;

            return how_long;
        }

        return 0;
    }

    @Override
    public void printInfoManusia(){
        super.printInfoManusia();
        System.out.println("Origin city: " + asal_kota);
        System.out.println("Petani");
    }
}
