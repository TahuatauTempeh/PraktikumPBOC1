public class MataKuliah {
    private String idMatkul;
    private String nama_matkul;
    private int sks;

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

    public String getIDMatkul(){
        return idMatkul;
    }

    public String getNamaMatkul(){
        return nama_matkul;
    }

    public int getSKS(){
        return sks;
    }

    public void setIDMatkul(String id){
        idMatkul = id;
    }

    public void setNamaMatkul(String nama){
        nama_matkul = nama;
    }

    public void setSks(int ss){
        sks = ss;
    }
}
