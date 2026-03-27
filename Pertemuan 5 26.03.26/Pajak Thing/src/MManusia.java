// File         : MManusia.java
// Deskripsi    : main program file
// NIM / Nama   : 24060124140195 / Azka Aqylla Maulana
// Tanggal      : 26.03.26

public class MManusia {
    public static void main(String[] args) {
        // pns objects
        PNS p1 = new PNS("Satriyo", "01-04-2006", "Jl. Seroja", 15000000, "198302032006041002");
        PNS p2 = new PNS("Panji", "01-04-2010", "Semarang", 10000000, "198004212010041002");
        p2.setAlamat("Jl. Panorama 111 Tembalang");

        // pengusaha objects
        Pengusaha pe1 = new Pengusaha("Adhy", "01-01-2000", "Jl. Air", 55000000, "000-556-773-212-000-5");

        // petani objects
        Petani pt1 = new Petani("Nugraha", "09-01-1977", "Jl. Bunga 9 Tembalang", 5000000, "wonogiri");

        // check counters
        System.out.println("|| Counter ||");
        System.out.println("Jumlah Manusia = " + Manusia.getCounter_manusia());
        System.out.println("Jumlah PNS = " + PNS.getCounter_pns());
        System.out.println("Jumlah Pengusaha = " + Pengusaha.getCounter_pengusaha());
        System.out.println("Jumlah Petani = " + Petani.getCounter_petani());
        System.out.println("");

        // check tax and working duration
        System.out.println("|| Calculations ||");
        System.out.println("Pajak PNS p1 = " + p1.hitungPajak());
        System.out.println("Pajak Pengusaha pe1 = " + pe1.hitungPajak());
        
        // idk
        System.out.println("Masa Kerja p1 = " + p1.hitungMasaKerja());
        System.out.println("Masa Kerja pe1 = " + pe1.hitungMasaKerja());
        System.out.println("Masa Kerja pt1 = " + pt1.hitungMasaKerja());
        System.out.println("");

        // check detailed info
        System.out.println("|| Info ||");
        p1.printInfoManusia();
        System.out.println("");
        pe1.printInfoManusia();
        System.out.println("");
        pt1.printInfoManusia();
    }
}