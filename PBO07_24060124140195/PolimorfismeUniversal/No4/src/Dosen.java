// File         : Dosen.java
// Deskripsi    : subtype of CivitasAkademi
// NIM / Nama   : 24060124140195 / Azka Aqylla Maulana
// Tanggal      : 23.04.26

public class Dosen extends CivitasAkademi{
    // attributes
    private String NIP;

    // methods
    Dosen(String nem, String nip){
        super(nem);
        NIP = nip;
    }

    public String getNIP(){
        return NIP;
    }

    public String getNomor(){
        return NIP;
    }
}
