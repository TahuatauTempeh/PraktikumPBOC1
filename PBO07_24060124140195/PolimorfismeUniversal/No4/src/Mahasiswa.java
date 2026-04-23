// File         : Mahasiswa.java
// Deskripsi    : subtype of CivitasAkademi
// NIM / Nama   : 24060124140195 / Azka Aqylla Maulana
// Tanggal      : 23.04.26

public class Mahasiswa extends CivitasAkademi{
    // attributes
    private String NIM;
    private Dosen DosenWali;

    // methods
    Mahasiswa(String nem, String nim){
        super(nem);
        NIM = nim;
        DosenWali = null;
    }

    public void setDosenWali(Dosen dsn){
        DosenWali = dsn;
    }

    public void tampilDataMahasiswa(){
        String lecturerName = null;
        
        if (DosenWali != null){
            lecturerName = DosenWali.getNama();
        }
        else{
            lecturerName = "None";
        }

        System.out.println("Name: " + getNama());
        System.out.println("NIM: " + NIM);
        System.out.println("Lecturer: " + lecturerName);
    }

    @Override
    public String getNomor(){
        return NIM;
    }
}
