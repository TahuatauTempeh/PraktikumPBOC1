public class Main_Program {
    public static void main(String[] args) {
        Mahasiswa Sylvester = new Mahasiswa();
        Dosen Jackson = new Dosen("AA01", "Jackson Black", "Ilmu Pengangguran");
        

        System.out.println("First Dosen:");
        System.out.println("NIP: " + Jackson.getNIP());
        System.out.println("Nama: " + Jackson.getNama());
        System.out.println("Prodi: " + Jackson.getProdi());
        
    }
}
