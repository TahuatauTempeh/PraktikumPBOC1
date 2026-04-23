public class  Anjing extends Anabul{
    Anjing(String nem){
        super(nem);
    }

    @Override
    public void Gerak(){
        System.out.println(Nama + " melata");
    }
    
    @Override
    public void Bersuara(){
        System.out.println(Nama + " guk-guk");
    }
}

