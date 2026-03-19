// File         : Persegi.java
// Deskripsi    : Persegi file
// NIM / Nama   : 24060124140195 / Azka Aqylla Maulana
// Tanggal      : -

public class Persegi extends BangunDatar {
    // attributes
    private double sisi;

    // constructors

    // no parameters
    public Persegi() {
        setJmlSisi(4);
    }

    // with parameters
    public Persegi(double sissii, String colour, String borderr) {
        super(4, colour, borderr);

        this.sisi = sissii;
    }

    // selectors

    // returns the sisi
    public double getSisi() {
        return this.sisi;
    }

    // mutators

    // set the value of sisi to sissii
    public void setSisi(double sissii) {
        this.sisi = sissii;
    }

    // others

    // returns the area of the square
    public double getLuas() {
        return this.sisi * this.sisi;
    }

    // returns the perimeter of the square
    public double getKeliling() {
        return 4 * this.sisi;
    }

    // returns the diagonal of the square
    public double getDiagonal() {
        return Math.sqrt(2) * this.sisi;
    }

    // printss the info of Persegi
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi: " + this.sisi);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }
}