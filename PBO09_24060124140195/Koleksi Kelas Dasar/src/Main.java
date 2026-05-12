public class Main {
    public static void main(String[] args) {
        // initiate
        Teman Teman_1 = new Teman();

        // some variable
        int elements = Teman_1.getNbelm();

        System.out.println("||====================||");
        System.out.println(elements);

        System.out.println("||====================||");
        System.out.println("Name: " + Teman_1.getNama(elements));
        System.out.println("||====================||");

        
        Teman_1.addNama("Linggo Ding");
        Teman_1.addNama("Bingo Ding");
        Teman_1.addNama("Bogos Binted");
        Teman_1.addNama("6 7");
        Teman_1.addNama("What da dog doin");

        System.out.println(Teman_1.getNbelm());
        System.out.println("||====================||");
        
        for (int i = 0; i < Teman_1.getNbelm(); i++) {
            System.out.println("Name: " + Teman_1.getNama(i));
        }
        System.out.println("||====================||");

        Teman_1.setNama(2, "Rimuru");

        for (int i = 0; i < Teman_1.getNbelm(); i++) {
            System.out.println("Name: " + Teman_1.getNama(i));
        }

        System.out.println("||====================||");

        Teman_1.delNama("Bogos Binted");

        for (int i = 0; i < Teman_1.getNbelm(); i++) {
            System.out.println("Name: " + Teman_1.getNama(i));
        }

        System.out.println("||====================||");

        boolean isRimuruThere = Teman_1.isMember("Rimuru");

        System.out.println("Is Rimuru there? " + isRimuruThere);

        System.out.println("||====================||");

        int totalName = Teman_1.countNama("6 7");

        System.out.println("How many times does 6 7 show up? " + totalName);

        System.out.println("||====================||");
    }
}
