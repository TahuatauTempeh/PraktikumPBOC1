// File         : DosenTamu.java
// Deskripsi    : subclass of dosen
// NIM / Nama   : 24060124140195 / Azka Aqylla Maulana
// Tanggal      : -

public class DosenTamu extends Dosen {
    // attributes
    private String NIDK;
    private String tgl_selesai_kontrak;

    // constructors
    public DosenTamu() {

    }

    public DosenTamu(String NIP, String name, String dob, String TMT, double gaji, String faku, String nidkk, String tgl_kontrakk) {
        super(NIP, name, dob, TMT, gaji, faku);
        
        this.NIDK = nidkk;

        this.tgl_selesai_kontrak = tgl_kontrakk;
    }

    // selectors
    public String getNIDK() {
        return this.NIDK;
    }

    public String getTglSelesaiKontrak() {
        return this.tgl_selesai_kontrak;
    }

    // mutators
    public void setNIDK(String nidkk) {
        this.NIDK = nidkk;
    }

    public void setTglSelesaiKontrak(String tgl_kontrakk) {
        this.tgl_selesai_kontrak = tgl_kontrakk;
    }

    // others
    @Override
    public void printDetail() {
        System.out.println("Jabatan: Dosen Tamu");
        super.printDetail();
        System.out.println("NIDK: " + this.NIDK);
        System.out.println("Selesai Kontrak: " + this.tgl_selesai_kontrak);
    }
}