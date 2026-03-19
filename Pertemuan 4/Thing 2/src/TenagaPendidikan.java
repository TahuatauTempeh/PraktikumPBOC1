// File         : TenagaPendidikan.java
// Deskripsi    : subclass of pehawai
// NIM / Nama   : 24060124140195 / Azka Aqylla Maulana
// Tanggal      : -

public class TenagaPendidikan extends Pegawai {
    // attributes
    private String bidang;

    // constructors
    public TenagaPendidikan() {

    }

    public TenagaPendidikan(String NIP, String name, String dob, String TMT, double gaji, String bidd) {
        super(NIP, name, dob, TMT, gaji);

        this.bidang = bidd;
    }

    // selectors
    public String getBidang() {
        return this.bidang;
    }

    // mutators
    public void setBidang(String bidd) {
        this.bidang = bidd;
    }

    // others
    @Override
    public void printDetail() {
        System.out.println("Jabatan: Tenaga Kependidikan");
        super.printDetail();
        System.out.println("Bidang: " + this.bidang);
    }
}