public class Dosen {
    private String nip;
    private String nama;
    private String prodi;

    public Dosen(){
        nip = "_";
        nama = "_";
        prodi = "_";
    }

    public Dosen(String NIP, String name, String Pro){
        nip = NIP;
        nama = name;
        prodi = Pro;
    }

    public String getNIP(){
        return nip;
    }

    public String getNama(){
        return nama;
    }

    public String getProdi(){
        return prodi;
    }

    public void setNIP(String NIP){
        nip = NIP;
    }

    public void setNama(String Nama){
        nama = Nama;
    }

    public void setProdi(String Prodi){
        prodi = Prodi;
    }
}
