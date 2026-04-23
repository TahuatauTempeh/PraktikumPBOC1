public class Main {
    public static void main(String[] args) {
        // objects
        Anabul oyen = new Kucing("Oyen");

        Anabul doge = new Anjing("Doge");

        Anabul birb = new Burung("Birb");

        // testings
        System.out.println("||      Cat     ||");

        oyen.Bersuara();
        oyen.Gerak();

        System.out.println("||      Dog     ||");

        doge.Bersuara();
        doge.Gerak();

        System.out.println("||      Bird     ||");

        birb.Bersuara();
        birb.Gerak();
    }
}
