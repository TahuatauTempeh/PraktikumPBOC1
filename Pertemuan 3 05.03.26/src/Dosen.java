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

    // creaete a Dosen object with no parameters
    public Dosen(){
        nip = "_";
        nama = "_";
        prodi = "_";
    }

    // create a Dosen object with parameters
    public Dosen(String NIP, String name, String Pro){
        nip = NIP;
        nama = name;
        prodi = Pro;
    }

    // selector

    // returns the value of NIP
    public String getNIP(){
        return nip;
    }

    // returns the name of the Dosen
    public String getNama(){
        return nama;
    }

    // returns the Prodi
    public String getProdi(){
        return prodi;
    }

    // mutator

    // change the value of NIP
    public void setNIP(String NIP){
        nip = NIP;
    }

    // change the value of Nama
    public void setNama(String Nama){
        nama = Nama;
    }

    // change the value of Prodi
    public void setProdi(String Prodi){
        prodi = Prodi;
    }

    // other method(s)

    // prints the values of each attributes of Dosen onto the terminal
    public void printDosen(){
        System.out.println("NIP: " + nip);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }
}
