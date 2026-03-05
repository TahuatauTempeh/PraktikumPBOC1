import java.util.ArrayList;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatkul;
    private Dosen dosenwali;
    private Kendaraan vroom_vroom;
    
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


}
    