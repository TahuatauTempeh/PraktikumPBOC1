public class Main_titik {
    public static void main(String[] args) throws Exception {
        Titik T1 = new Titik();
        Titik T2 = new Titik();
        
        T1.setAbsis(67);
        T1.setOrdinat(69);

        T2.setAbsis(-69);
        T2.setOrdinat(-30);

        System.out.println("The absis of T1: " + T1.getAbsis());

        System.out.println("The ordinance of T1: " + T1.getOrdinat());

        System.out.printf("Distance from origin: %.2f%n", T1.getJarakPusat());

        System.out.printf("Distance from origin: %.2f%n", T1.getJarakTitik(T2));
    }
}
