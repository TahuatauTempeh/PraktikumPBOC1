// File         : DosenTetap.java
// Deskripsi    : subclass of dosen
// NIM / Nama   : 24060124140195 / Azka Aqylla Maulana
// Tanggal      : -

public class DosenTetap extends Dosen {
    // attributes
    private String NIDN;

    // constructors
    public DosenTetap() {

    }

    public DosenTetap(String NIP, String name, String dob, String TMT, double gaji, String faku, String nidnn) {
        super(NIP, name, dob, TMT, gaji, faku);
        
        this.NIDN = nidnn;
    }

    // selectors
    public String getNIDN() {
        return this.NIDN;
    }

    // mutators
    public void setNIDN(String nidnn) {
        this.NIDN = nidnn;
    }

    // others
    @Override
    public void printDetail() {
        System.out.println("Jabatan: Dosen Tetap");
        super.printDetail();
        System.out.println("NIDN: " + this.NIDN);
    }
}