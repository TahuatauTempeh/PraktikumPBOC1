// File         : Main.java
// Deskripsi    : main file
// NIM / Nama   : 24060124140195 / Azka Aqylla Maulana
// Tanggal      : 23.04.26

public class Main {
    public static void main(String[] args){
        // objects
        Seminar sem = new Seminar();

        Dosen d1 = new Dosen("Dr. Smith Bottle", "19700101");
        Dosen d2 = new Dosen("Prof. Miller Dew", "19800202");

        Mahasiswa m1 = new Mahasiswa("Jack Illie", "24060124");
        Mahasiswa m2 = new Mahasiswa("Jane Doe", "24060125");
        Mahasiswa m3 = new Mahasiswa("Bob Marley", "24060126");
        Mahasiswa m4 = new Mahasiswa("Alicia Winter", "24060127");
        Mahasiswa m5 = new Mahasiswa("Charlie Chaplin", "24060128");
        Mahasiswa m6 = new Mahasiswa("Leon Kenndey", "240698");

        // doswal
        m1.setDosenWali(d1);
        m4.setDosenWali(d1);
        m6.setDosenWali(d2);

        // testings
        // input the things
        sem.registrasi(d1);
        sem.registrasi(d2);
        sem.registrasi(m1);
        sem.registrasi(m2);
        sem.registrasi(m3);
        sem.registrasi(m4);
        sem.registrasi(m5);
        sem.registrasi(m6);

        // print
        sem.tampilPeserta();

        System.out.println("||      Total Participants         ||");
        System.out.println("Total: " + sem.countPeserta());
        System.out.println("Mahasiswa: " + sem.countMahasiswa());

        System.out.println("||      Student Details   ||");
        
        m1.tampilDataMahasiswa();
        m4.tampilDataMahasiswa();
        m6.tampilDataMahasiswa();
        m2.tampilDataMahasiswa();
    }
}