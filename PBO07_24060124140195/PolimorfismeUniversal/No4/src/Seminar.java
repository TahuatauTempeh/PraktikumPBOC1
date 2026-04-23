// File         : Seminar.java
// Deskripsi    : seminar file
// NIM / Nama   : 24060124140195 / Azka Aqylla Maulana
// Tanggal      : 23.04.26

public class Seminar {
    // attributes
    private CivitasAkademi[] pesertas;
    private int BanyakPeserta;

    // methods
    Seminar(){
        pesertas = new CivitasAkademi[100];
        BanyakPeserta = 0;
    }

    public void registrasi(CivitasAkademi person){
        if (BanyakPeserta < 100){
            pesertas[BanyakPeserta] = person;
            BanyakPeserta += 1;
        }
        else{
            System.out.println("Full");
        }
    }

    public int countPeserta(){
        return BanyakPeserta;
    }

    public int countMahasiswa(){
        int counter = 0;

        for (int i = 0; i < BanyakPeserta; i++) {
            if (pesertas[i] instanceof Mahasiswa){
                counter += 1;
            }
        }

        return counter;
    }

    public void tampilPeserta(){
        System.out.println("||      List of Members     ||");

        for (int i = 0; i < BanyakPeserta; i++) {
            System.out.println("ID: " + pesertas[i].getNomor() + ", Name: " + pesertas[i].getNama());
        }
    }
}
