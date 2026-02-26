public class Titik {
    // attributes
    double absis;
    double ordinat;
    static int countertitik = 0;

    // methods
    Titik(){
        this(0, 0);
    }

    Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        countertitik += 1;
    }

    public double getAbsis(){
        return this.absis;
    }

    public double  getOrdinat(){
        return this.ordinat;
    }

    public void setAbsis(double x){
        this.absis = x;
    }

    public void setOrdinat(double y){
        this.ordinat = y;
    }

    public void geser(double x, double y){
        this.absis = x;
        this.ordinat = y;
    }

    public void printTitik(){
        System.out.println("The dot: (" + this.absis + ", " + this.ordinat + ")");
    }

    public String getKuadran(){
        if (this.absis > 0 && this.ordinat > 0) {
            return "The first quadrant";
        }
        else if (this.absis < 0 && this.ordinat > 0) {
            return "The second quadrant";
        }
        else if (this.absis < 0 && this.ordinat < 0) {
            return "The third quadrant";
        }
        else if (this.absis > 0 && this.ordinat < 0) {
            return "The fourth quadrant";
        }
        else{
            return "Origin";
        }
    }

    public double getJarakPusat(){
        double xs = Math.pow(this.absis, 2);

        double ys = Math.pow(this.ordinat, 2);

        return Math.sqrt(xs + ys);
    }

    public double getJarakTitik(Titik T){
        double sub_x = Math.pow(Math.abs(this.absis - T.absis), 2);
        double sub_y = Math.pow(Math.abs(this.ordinat - T.ordinat), 2);

        return Math.sqrt(sub_x + sub_y);
    }

    public void refleksiX(){
        this.ordinat *= -1;

        // for (int i = 0; i < 2; i++) {
        //     this.refleksiX();
        // }
    }
}
