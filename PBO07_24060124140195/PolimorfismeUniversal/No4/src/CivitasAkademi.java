// File         : CivitasAkademi.java
// Deskripsi    : supertype file
// NIM / Nama   : 24060124140195 / Azka Aqylla Maulana
// Tanggal      : 23.04.26

public abstract class CivitasAkademi {
    // attributes
    String Nama;

    // methods
    public CivitasAkademi(String nem){
        Nama = nem;
    }

    public String getNama(){
        return Nama;
    }

    public void setNama(String nem){
        Nama = nem;
    }

    public abstract String getNomor();
}
