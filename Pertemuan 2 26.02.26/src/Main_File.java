public class Main_File {
    public static void main(String[] args) {
        // titik
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

        T1.getRefleksiX();
        T1.getRfleksiY();

        // garis
        // allocate garis
        Garis line_1 = new Garis();
        Garis line_2 = new Garis();
        
        // allocate titik 
        Titik line_1_T1 = new Titik();
        Titik line_1_T2 = new  Titik();
        Titik line_2_T1 = new Titik();
        Titik line_2_T2 = new Titik();

        // create titik for garis line_1
        line_1_T1.setAbsis(10);
        line_1_T1.setOrdinat(10);
        line_1_T2.setAbsis(20);
        line_1_T2.setOrdinat(-30);

        // create titik for garis line_2
        line_2_T1.setAbsis(-10);
        line_2_T1.setOrdinat(-1);
        line_2_T2.setAbsis(2);
        line_2_T2.setOrdinat(2);

        // create line_1
        line_1.setStartTitik(line_1_T1);
        line_1.setEndTitik(line_1_T2);

        // create line_2
        line_2.setStartTitik(line_2_T1);
        line_2.setEndTitik(line_2_T2);

        // check total garis and total titik
        System.out.println("Total line: " + Garis.getCounterGaris());
        System.out.println("Total dots: " + Titik.getCounterTitik());

        // print garis
        line_1.printGaris();
        line_2.printGaris();

        // get the gradien
        System.out.println("Gradient of line_1: " + line_1.getGradien());
        System.out.println("Gradient of line_2: " + line_2.getGradien());

        // is line_1 sejajar with line_2?
        System.out.println("Is line_1 sejajar with line_2: " + line_1.isSejajarGaris(line_2));

        // is line_1 tegak lurus with line_2?
        System.out.println("Is line_1 tegak lurus with line_2: " + line_1.isTegakLurusGaris(line_2));

        // get the middle dot of line_1
        line_1.getTitikTengah().printTitik();

        // get formula of line_1
        System.out.println("Formula of line_1: " + line_1.getFormula());

    }
}
