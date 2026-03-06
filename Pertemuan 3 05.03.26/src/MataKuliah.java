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
    public MataKuliah(){
        idMatkul = "_";
        nama_matkul = "_";
        sks = 0;
    }

    public MataKuliah(String id, String nama, int s){
        idMatkul = id;
        nama_matkul = nama;
        sks = s;
    }

    // selector
    public String getIDMatkul(){
        return idMatkul;
    }

    public String getNamaMatkul(){
        return nama_matkul;
    }

    public int getSKS(){
        return sks;
    }

    // mutator
    public void setIDMatkul(String id){
        idMatkul = id;
    }

    public void setNamaMatkul(String nama){
        nama_matkul = nama;
    }

    public void setSks(int ss){
        sks = ss;
    }

    // other method(s)
    public void printMatkul(){
        System.out.println("ID Matakuliah: " + idMatkul);
        System.out.println("Nama Matkul: " + nama_matkul);
        System.out.println("Jumlah SKS: " + sks);
    }
}
