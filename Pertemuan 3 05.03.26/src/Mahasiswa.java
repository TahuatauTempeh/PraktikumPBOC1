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
    

    // constructor

    // create a Mahasiswa object with no parameters
    public Mahasiswa(){
        nim = "_";
        nama = "_";
        prodi = "_";
        listMatkul = new ArrayList<>();
        dosenwali = new Dosen();
        vroom_vroom = new Kendaraan();
    }

    // create a Mahasiswa object with parameters
    public Mahasiswa(String ne, String ia, String pre){
        nim = ne;
        nama = ia;
        prodi = pre;
        listMatkul = new ArrayList<>();
        dosenwali = new Dosen();
        vroom_vroom = new Kendaraan();
    }

    // selector

    // returns the value of NIM
    public String getNIM(){
        return  nim;
    }

    // returns the value of Nama
    public String getNamaM(){
        return nama;
    }

    // returns the value of Prodi
    public String getProdiM(){
        return prodi;
    }

    // returns the listMatkul
    public ArrayList<MataKuliah> getListMatkul() {
        return listMatkul;
    }

    // returns the dosenwali
    public Dosen getDosen(){
        return dosenwali;
    }

    // returns the vehicle
    public Kendaraan getVehicle(){
        return vroom_vroom;
    }

    // mutator

    // change the value of the NIM
    public void setNIM(String N){
        nim = N;
    }

    // change the value of the Nama
    public void setNama_M(String M){
        nama = M;
    }

    // change the value of Prodi
    public void setProdi(String P){
        prodi = P;
    }

    // add a Matkul to the listMatkul if the length of the list is < 50
    public void addMatkul(MataKuliah M){
        if (listMatkul.size() < 50) {
            listMatkul.add(M);
        }
    }

    // change the vehicle dosenwali
    public void setDosenWali(Dosen D){
        dosenwali = D;
    }

    // change the value of the vehicle
    public void setVroom_vroom(Kendaraan K) {
        vroom_vroom = K;
    }

    // other method(s)

    // prints each attributes of the Mahasiswa to the terminal
    // also includes the attributes of Dosen, Kendaraan, and Matkul
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

    // prints out all the values inside of listMatkul along with its details regarding each attributes from the corresponding classes used
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

    // returns the total Sks from the listMatkul
    public int getTotalSKS(){
        int count = 0;

        for (int i = 0; i < listMatkul.size(); i++) {
            count += listMatkul.get(i).getSKS();
        }

        return count;
    }

    // returns the size of listMatkul
    public int getJumlahMatkul(){
        return listMatkul.size();
    }
}
    