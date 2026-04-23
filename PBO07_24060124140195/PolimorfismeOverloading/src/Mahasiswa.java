// File         : Mahasiswa.java
// Deskripsi    : mahasiswa file
// NIM / Nama   : 24060124140195 / Azka Aqylla Maulana
// Tanggal      : 23.04.26

public class Mahasiswa {
    // attributes
    String NIM;
    String Nama;
    String ProgramStudi;

    // methods
    Mahasiswa(){
        NIM = "-999";
        Nama = "n/a";
        ProgramStudi = "n/a";
    }
    
    Mahasiswa(String nim, String nem, String studies){
        NIM = nim;
        Nama = nem;
        ProgramStudi = studies;
    }

    Mahasiswa(Mahasiswa MM){
        NIM = MM.NIM;
        Nama = MM.Nama;
        ProgramStudi = MM.ProgramStudi;
    }

    public String getNama(){
        return Nama;
    }

    public String getNIM() {
        return NIM;
    }

    public String getProgramStudi() {
        return ProgramStudi;
    }

    public void setProgramStudi(){
        ProgramStudi = "Kosong";
    }

    public void setProgramStudi(String studies){
        ProgramStudi = studies;
    }

    public void setProgramStudi(Mahasiswa MMM){
        ProgramStudi = MMM.ProgramStudi;
    }

    public void printInfo(){
        System.out.println("Name: " + Nama);
        System.out.println("NIM: " + NIM);
        System.out.println("Major: " + ProgramStudi);
    }
}
