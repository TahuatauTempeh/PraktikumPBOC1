// File         : PNS.java
// Deskripsi    : pns class file
// NIM / Nama   : 24060124140195 / Azka Aqylla Maulana
// Tanggal      : 26.03.26

import java.time.LocalDate;

public class PNS extends Manusia implements Pajak{
    // attributes
    private String NIP;
    private static int counter_pns;

    // methods

    // construcots
    // no parameters
    public PNS(){
        super();
        NIP = "_";
        counter_pns ++;
    }

    // with parameters
    public PNS(String name, String date, String address, double salary, String NIPS){
        super(name, date, address, salary);
        NIP = NIPS;
        counter_pns ++;
    }

    // methods

    // selectors
    public String getNIP(){
        return NIP;
    }

    // mutators
    public void setNIP(String nIP) {
        NIP = nIP;
    }

    public static int getCounter_pns() {
        return counter_pns;
    }

    // other methods
    @Override
    public int hitungMasaKerja(){
        if (tngl_mulai_kerja != null) {
            int current_year = LocalDate.now().getYear();
            int start_year = tngl_mulai_kerja.getYear();

            int how_long = (current_year - start_year) + 5;

            return how_long;
        }

        return 0;
    }

    @Override
    public void printInfoManusia(){
        super.printInfoManusia();
        System.out.println("NIP: " + NIP);
        System.out.println("PNS");
    }

    @Override
    public double hitungPajak(){
        return pendapatan * 0.10;
    }
}
