// File         : MainProgram.java
// Deskripsi    : main file
// NIM / Nama   : 24060124140195 / Azka Aqylla Maulana
// Tanggal      : -

public class MainProgram {
    public static void main(String[] args) {
        // dosen tetap
        DosenTetap Andi = new DosenTetap("9545647548", "Andi", "5 Mei 1990", "1 Januari 2015", 5000000.0, "Fakultas Sains dan Matematika", "78647324");
        
        // dosen tamu
        DosenTamu Budi = new DosenTamu("9545647549", "Budi", "10 Juni 1985", "1 Maret 2020", 4500000.0, "Fakultas Teknik", "88776655", "31 Desember 2026");

        // tenaga kependidikan
        TenagaPendidikan Charly = new TenagaPendidikan("9545647550", "Charly", "15 Agustus 1995", "1 Juli 2018", 4000000.0, "Akademik");

        // prints
        System.out.println("||  Check Dosen Tetap  ||");
        Andi.printDetail();

        System.out.println("");

        System.out.println("||  Check Dosen Tamu  ||");
        Budi.printDetail();

        System.out.println("");

        System.out.println("||  Check Tenaga Pendidikan  ||");
        Charly.printDetail();

        System.out.println("");

        // testing mutators
        System.out.println("||  Testing Salary Update  ||");
        Andi.setGaji_pokok(6000000.0);
        System.out.println("New Base Salary: " + Andi.getGaji_pokok());
    }
}