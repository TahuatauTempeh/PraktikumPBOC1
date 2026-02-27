public class Garis {
    Titik beginning;
    Titik ending;
    static  int counterGaris = 0;

    public Garis(){
        this.beginning = new Titik(0, 0);
        this.ending = new Titik(1, 1);
        counterGaris ++;
    }

    public Garis(Titik start, Titik end){
        this.beginning = start;
        this.ending = end;
        counterGaris ++;
    }

    public Titik getStartTitik(){
        return this.beginning;
    }

    public Titik getEndTitik(){
        return this.ending;
    }

    public void setStartTitik(Titik starTitik){
        this.beginning = starTitik;
    }

    public void setEndTitik(Titik endTitik){
        this.ending = endTitik;
    }

    public static int getCounterGaris(){
        return counterGaris;
    }

    public double getPanjangGaris(){
        double x_length = Math.pow(Math.abs(this.beginning.getAbsis() - this.ending.getAbsis()), 2);
        double y_length = Math.pow(Math.abs(this.beginning.getOrdinat() - this.ending.getOrdinat()), 2);

        return Math.sqrt(x_length + y_length);
    }

    public double getGradien(){
        double delta_x = this.ending.getAbsis() - this.beginning.getAbsis();
        double delta_y = this.ending.getOrdinat() - this.beginning.getOrdinat();

        return delta_x / delta_y;
    }

    
}
