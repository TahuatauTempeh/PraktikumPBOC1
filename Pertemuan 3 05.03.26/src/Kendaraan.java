public class Kendaraan {
    private String noPlat;
    private String types;

    public Kendaraan(){
        noPlat = "_";
        types = "_";
    }

    public Kendaraan(String No, String TP){
        noPlat = No;
        types = TP;
    }

    public String getNoPlat(){
        return noPlat;
    }

    public String getType(){
        return types;
    }

    public void setNoPlat(String NP){
        noPlat = NP;
    }

    public void setType(String TTP){
        types = TTP;
    }
}

