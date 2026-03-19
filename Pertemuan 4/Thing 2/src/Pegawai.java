// File         : Pegawai.java
// Deskripsi    : superclass of all
// NIM / Nama   : 24060124140195 / Azka Aqylla Maulana
// Tanggal      : -

public class Pegawai {
    // attributes
    private String NIP;
    private String nama;
    private String tanggal_lahir;   // the date format here is dd month yyyy
    private String TMT;             // format's the same as tanggal_lahir
    private double gaji_pokok;

    // methods

    // constructors
    // no parameters
    public Pegawai(){

    }

    // with parameters
    public Pegawai(String NIP, String name, String dob, String TMT, double gaji){
        this.NIP = NIP;
        this.nama = name;
        this.tanggal_lahir = dob;
        this.TMT = TMT;
        this.gaji_pokok = gaji;
    }

    // selectors
    public String getNIP() {
        return this.NIP;
    }

    public String getNama() {
        return this.nama;
    }

    public String getTanggal_lahir() {
        return this.tanggal_lahir;
    }

    public String getTMT() {
        return this.TMT;
    }
    
    public double getGaji_pokok() {
        return this.gaji_pokok;
    }

    // mutators
    public void setNIP(String nipp) {
        this.NIP = nipp;
    }

    public void setNama(String namaa) {
        this.nama = namaa;
    }

    public void setTanggal_lahir(String dobb) {
        this.tanggal_lahir = dobb;
    }

    public void setTMT(String tmtt) {
        this.TMT = tmtt;
    }

    // set the value of gaji_pokok to gajii
    public void setGaji_pokok(double gajii) {
        this.gaji_pokok = gajii;
    }


    // others
    public void printDetail(){
        System.out.println("NIP: " + this.NIP);
        System.out.println("Name: " + this.nama);
        System.out.println("Date of birth: " + this.tanggal_lahir);
        System.out.println("TMT: " + this.TMT);
        System.out.println("Base salary: " + this.gaji_pokok);
    }
    

}
