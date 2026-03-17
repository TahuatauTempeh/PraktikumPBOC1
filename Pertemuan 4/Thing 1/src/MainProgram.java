// File         : MainProgram.java
// Deskripsi    : Main file
// NIM / Nama   : 24060124140195
// Tanggal      : -

public class MainProgram {
    public static void main(String[] args) {
        // bangung datar
        BangunDatar Triangle = new BangunDatar(3, "Red", "Dashed");
        BangunDatar Pentagon = new BangunDatar(5, "Yellow", "Dotted");

        // persegi
        Persegi Box_Small = new Persegi(4.0, "Blue", "Solid");
        Persegi Box_Big = new Persegi(10.5, "Green", "Double");

        // prints
        System.out.println("||  Check BangunDatar  ||");

        Triangle.printInfo();
        System.out.println("");
        Pentagon.printInfo();

        System.out.println("");

        System.out.println("||  Check Persegi  ||");

        Box_Small.printInfo();
        System.out.println("");
        Box_Big.printInfo();

        System.out.println("");

        // testings logic
        System.out.println("||  Check Calculations  ||");

        System.out.println("Diagonal of Box_Small: " + Box_Small.getDiagonal());
        
        System.out.println("Box after new values are set");
        Box_Small.setSisi(8.0);
        
        System.out.println("New Area: " + Box_Small.getLuas());
        System.out.println("New Perimeter: " + Box_Small.getKeliling());
    }
}