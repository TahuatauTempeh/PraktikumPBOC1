// File         : MainProgram.java
// Deskripsi    : main file
// NIM / Nama   : 24060124140195 / Azka Aqylla Maulana
// Tanggal      : 23.04.26

public class MainProgram {
    public static void main(String[] args) {
        // declare some stuff
        Mahasiswa John_Carter = new Mahasiswa();

        Mahasiswa Jimmy_Cake = new Mahasiswa("2094756", "Jimmy Cake", "Archeology");

        Mahasiswa Dupe_of_Jimmy = new Mahasiswa(Jimmy_Cake);

        // intitaln value
        System.out.println("||      Informations of the Students      ||");

        System.out.println("==      John Carter     ==");
        John_Carter.printInfo();

        System.out.println("==      Jimmy Cake    ==");
        Jimmy_Cake.printInfo();

        System.out.println("==      Duplicate of Jimmy      ==");
        Dupe_of_Jimmy.printInfo();

        // after mods
        System.out.println("||      Mods      ||");

        System.out.println("==      No parameters       ==");
        Jimmy_Cake.setProgramStudi();
        Jimmy_Cake.printInfo();

        System.out.println("==      With params as a string     ==");
        Jimmy_Cake.setProgramStudi("Aerospace");
        Jimmy_Cake.printInfo();


        System.out.println("==      Dupe        ==");
        Dupe_of_Jimmy.setProgramStudi(Jimmy_Cake);
        Dupe_of_Jimmy.printInfo();
    }
}
