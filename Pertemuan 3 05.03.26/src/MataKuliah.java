// File         : Matakuliah.java
// Deskripsi    : Mata kuliah :0
// NIM / Nama   : 24060124140195
// Tanggal      : 06.03.26

public class MataKuliah {
    // attributes
    private String idMatkul;
    private String nama_matkul;
    private int sks;

    // constructore

    // create a MataKuliah object with no parameters
    public MataKuliah(){
        idMatkul = "_";
        nama_matkul = "_";
        sks = 0;
    }

    // create a MataKuliah object with parameters
    public MataKuliah(String id, String nama, int s){
        idMatkul = id;
        nama_matkul = nama;
        sks = s;
    }

    // selector

    // returns the idMatkul
    public String getIDMatkul(){
        return idMatkul;
    }

    // returns the NamaMatkul
    public String getNamaMatkul(){
        return nama_matkul;
    }

    // returns the Sks
    public int getSKS(){
        return sks;
    }

    // mutator

    // changet the value of the idMatkul
    public void setIDMatkul(String id){
        idMatkul = id;
    }

    // change the value of the NamaMatkul
    public void setNamaMatkul(String nama){
        nama_matkul = nama;
    }

    // change the value of the Sks
    public void setSks(int ss){
        sks = ss;
    }

    // other method(s)

    // prints each attributes of the MataKuliah to the terminal
    public void printMatkul(){
        System.out.println("ID Matakuliah: " + idMatkul);
        System.out.println("Nama Matkul: " + nama_matkul);
        System.out.println("Jumlah SKS: " + sks);
    }
}
