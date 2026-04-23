public class Burung extends Anabul{
    Burung(String nem){
        super(nem);
    }

    @Override
    public void Gerak(){
        System.out.println(Nama + " terbang");
    }
    
    @Override
    public void Bersuara(){
        System.out.println(Nama + " cuit");
    }
}

