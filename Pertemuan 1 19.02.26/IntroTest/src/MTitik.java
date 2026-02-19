public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();
        Titik T2 = new Titik();

        T1.setAbsis(2);
        T1.setOrdinat(2);

        T2.setAbsis(9);
        T2.setOrdinat(13);



        System.out.println("Absis: " + T1.getAbsis());
        System.out.println("Ordinat: " + T1.getOrdinat());

        System.out.println("Kuadran: " + T1.getKuadran());

        System.out.println("Distance from origin: " + T1.distanceFromOrigin());

        System.out.println("Distance of T1 from T2: " + T1.distanceFromOther(T2));

        System.out.println("Reflection to X: " + T1.viewReflectionX());

        System.out.println("Reflection to Y: " + T1.viewReflectionY());
    }
}
