// File         : Main
// Deskripsi    : Main file
// NIM / Nama   : 24060124140195
// Tanggal      : 06.03.26

public class Main_Program {
    public static void main(String[] args) {
        // dosen
        Dosen Jackson = new Dosen("AA01", "Jackson Black", "Mineralogy Department");
        Dosen Hugh = new Dosen("AA02", "Hugh Baker", "Languange Department");

        // kendaraan
        Kendaraan Battle_Hopper = new Kendaraan("H 3876 FE", "Motor");
        Kendaraan Batmobile = new Kendaraan("BE 67 E", "Mobil");

        // matakuliah
        MataKuliah Bio_Oil = new MataKuliah("BIOL", "Bio Oil 101", 3);
        MataKuliah English = new MataKuliah("ENG", "English 101", 1);
        MataKuliah Rocks = new MataKuliah("RCK", "Introduction to Rock Studies 101", 3);

        // mahasiswa
        Mahasiswa Sylvester = new Mahasiswa("001001001", "Sylvester Wotcjockwich", "Mineralogy Department");

        Sylvester.setDosenWali(Jackson);

        Sylvester.setVroom_vroom(Batmobile);

        Sylvester.addMatkul(Bio_Oil);
        Sylvester.addMatkul(Rocks);
        Sylvester.addMatkul(English);

        // prints
        System.out.println("||  Check Matakuliah  ||");

        Bio_Oil.printMatkul();
        English.printMatkul();

        System.out.println("");

        System.out.println("||  Check Dosen  ||");

        Jackson.printDosen();
        Hugh.printDosen();

        System.out.println("");

        System.out.println("||  Check Kendaraan  ||");

        Battle_Hopper.printKendaraan();
        Batmobile.printKendaraan();
    
        System.out.println("");

        System.out.println("||  Check Mahasiswa  ||");

        Sylvester.printDetailMahasiswa();

        System.out.println("Total SKS: " + Sylvester.getTotalSKS());
    }
}
