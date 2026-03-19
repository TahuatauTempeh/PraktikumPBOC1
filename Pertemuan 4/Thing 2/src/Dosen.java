// File         : Dosen.java
// Deskripsi    : subclass of pegawai
// NIM / Nama   : 24060124140195 / Azka Aqylla Maulana
// Tanggal      : -

public class Dosen extends Pegawai {
    // attributes
    private String fakultas;

    // constructors
    public Dosen() {

    }

    public Dosen(String NIP, String name, String dob, String TMT, double gaji, String faku) {
        super(NIP, name, dob, TMT, gaji);

        this.fakultas = faku;
    }

    // selectors
    public String getFakultas() {
        return this.fakultas;
    }

    // mutators
    public void setFakultas(String faku) {
        this.fakultas = faku;
    }

    // others
    @Override
    public void printDetail() {
        super.printDetail();
        System.out.println("Fakultas: " + this.fakultas);
    }
}