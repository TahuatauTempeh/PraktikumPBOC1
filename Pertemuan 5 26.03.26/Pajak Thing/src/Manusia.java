// File         : Manusia.java
// Deskripsi    : abstract class
// NIM / Nama   : 24060124140195 / Azka Aqylla Maulana
// Tanggal      : 26.03.26

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

abstract class Manusia{
    // attributes
    protected String nama;
    protected LocalDate tngl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counter_manusia;
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    // methods
    
    // constructor
    // no parameters
    public Manusia(){
        nama = "_";
        tngl_mulai_kerja = null;
        alamat = "_";
        pendapatan = 0;
        counter_manusia ++;
    }

    // with parameters
    public Manusia(String name, String date, String address, double salary){
        nama = name;
        tngl_mulai_kerja = LocalDate.parse(date, FORMATTER);
        alamat = address;
        pendapatan = salary;
        counter_manusia ++;
    }

    // selectors
    public String getNama(){
        return nama;
    }

    public LocalDate getTngl_mulai_kerja() {
        return tngl_mulai_kerja;
    }

    public String getAlamat() {
        return alamat;
    }

    public static int getCounter_manusia() {
        return counter_manusia;
    }

    // mutators
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setTngl_mulai_kerja(String tngl_mulai_kerja) {
        this.tngl_mulai_kerja = LocalDate.parse(tngl_mulai_kerja, FORMATTER);
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    // other methods
    public void printInfoManusia(){
        System.out.println("Name: " + nama);
        System.out.println("Address: " + alamat);
        System.out.println("Salary: " + pendapatan);
        System.out.println("Start date for working: " + tngl_mulai_kerja);
        System.out.println("Stayed in the company for: " + hitungMasaKerja() + "years");
    }

    public abstract int hitungMasaKerja();

}
