public class Kendaraan {
    private String noPlat;
    private String types;

    public Kendaraan(){
        noPlat = "_";
        types = "_";
    }

    public Kendaraan(String No, String TP){
        if (TP.equals("Mobil") || TP.equals("mobil") || TP.equals("Motor") || TP.equals("motor")) {
            noPlat = No;
            types = TP;   
        }
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

