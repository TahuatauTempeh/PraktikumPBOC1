// File         : Dosen
// Deskripsi    : Dosen
// NIM / Nama   : 24060124140195
// Tanggal      : 06.03.26

public class Dosen {
    // attributes
    private String nip;
    private String nama;
    private String prodi;

    // constructor
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

    // selector
    public String getNIP(){
        return nip;
    }

    public String getNama(){
        return nama;
    }

    public String getProdi(){
        return prodi;
    }

    // mutator
    public void setNIP(String NIP){
        nip = NIP;
    }

    public void setNama(String Nama){
        nama = Nama;
    }

    public void setProdi(String Prodi){
        prodi = Prodi;
    }

    // other method(s)
    public void printDosen(){
        System.out.println("NIP: " + nip);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }
}
