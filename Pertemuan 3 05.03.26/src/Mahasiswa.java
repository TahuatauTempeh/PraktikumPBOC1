// File         : Mahasiswa
// Deskripsi    : Mahasiswa
// NIM / Nama   : 24060124140195
// Tanggal      : 06.03.26

import java.util.ArrayList;

public class Mahasiswa {
    // attributes
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatkul;
    private Dosen dosenwali;
    private Kendaraan vroom_vroom;
    
    // methods 

    // constructor
    public Mahasiswa(){
        nim = "_";
        nama = "_";
        prodi = "_";
        listMatkul = new ArrayList<>();
        dosenwali = new Dosen();
        vroom_vroom = new Kendaraan();
    }

    public Mahasiswa(String ne, String ia, String pre){
        nim = ne;
        nama = ia;
        prodi = pre;
        listMatkul = new ArrayList<>();
        dosenwali = new Dosen();
        vroom_vroom = new Kendaraan();
    }

    // selector
    public String getNIM(){
        return  nim;
    }

    public String getNamaM(){
        return nama;
    }

    public String getProdiM(){
        return prodi;
    }

    public ArrayList<MataKuliah> getListMatkul() {
        return listMatkul;
    }

    public Dosen getDosen(){
        return dosenwali;
    }

    public Kendaraan getVehicle(){
        return vroom_vroom;
    }

    // mutator
    public void setNIM(String N){
        nim = N;
    }

    public void setNama_M(String M){
        nama = M;
    }

    public void setProdi(String P){
        prodi = P;
    }

    public void addMatkul(MataKuliah M){
        if (listMatkul.size() < 50) {
            listMatkul.add(M);
        }
    }

    public void setDosenWali(Dosen D){
        dosenwali = D;
    }

    public void setVroom_vroom(Kendaraan K) {
        vroom_vroom = K;
    }

    // other method(s)
    public void printDetailMahasiswa(){
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        System.out.println("Data Dosen Wali:");
        dosenwali.printDosen();

        System.out.println("Data Kendaraan:");
        vroom_vroom.printKendaraan();

        System.out.println("Data Mata Kuliah:");
        getListMatkulDatas();
    }

    public void getListMatkulDatas(){
        System.out.print("[");

        for (int i = 0; i < listMatkul.size(); i++){
            System.out.print("<" + listMatkul.get(i).getIDMatkul() + ", " + listMatkul.get(i).getNamaMatkul() + ", " + listMatkul.get(i).getSKS() + ">");
            
            if (i < (listMatkul.size() - 1)) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }
}
    