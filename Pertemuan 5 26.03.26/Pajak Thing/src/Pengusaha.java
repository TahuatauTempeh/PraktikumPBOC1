// File         : Pengusaha.java
// Deskripsi    : pengusaha class file
// NIM / Nama   : 24060124140195 / Azka Aqylla Maulana
// Tanggal      : 26.03.26

import java.time.LocalDate;

public class Pengusaha extends Manusia implements Pajak{
    // attributes
    private String NPWP;
    private static int counter_pengusaha;

    // methods

    // constrctors
    // no parameters
    public Pengusaha(){
        super();
        NPWP = "_";
        counter_pengusaha ++;
    }

    // with parameters
    public Pengusaha(String name, String date, String address, double salary, String NPWPs){
        super(name, date, address, salary);
        NPWP = NPWPs;
        counter_pengusaha ++;
    }

    // selectors

    public String getNPWP() {
        return NPWP;
    }


    public static int getCounter_pengusaha() {
        return counter_pengusaha;
    }

    // mutators
    public void setNPWP(String nPWP) {
        NPWP = nPWP;
    }

    // other methods
    @Override
    public int hitungMasaKerja(){
        if (tngl_mulai_kerja != null) {
            int current_year = LocalDate.now().getYear();
            int start_year = tngl_mulai_kerja.getYear();

            int how_long = (current_year - start_year) + 9;

            return how_long;
        }

        return 0;
    }

    @Override
    public void printInfoManusia(){
        super.printInfoManusia();
        System.out.println("NPWP: " + NPWP);
        System.out.println("Pengusaha");
    }

    @Override
    public double hitungPajak(){
        return pendapatan * 0.15;
    }
}
