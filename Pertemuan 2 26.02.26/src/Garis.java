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

        return delta_y / delta_x;
    }

    public Titik getTitikTengah(){
        double middle_of_x = (this.beginning.getAbsis() + this.ending.getAbsis()) / 2;
        double middle_of_y = (this.beginning.getOrdinat() + this.ending.getOrdinat()) / 2;

        return new Titik(middle_of_x, middle_of_y);
    }

    public boolean isSejajarGaris(Garis line){
        return this.getGradien() == line.getGradien();
    }

    public boolean isTegakLurusGaris(Garis line){
        return (this.getGradien() * line.getGradien()) == -1;
    }

    public void printGaris(){
        System.out.println("Line from point (" + this.beginning.getAbsis() + ", " + this.beginning.getOrdinat() + ") to point (" + this.ending.getAbsis() + ", " + this.ending.getOrdinat() + ")");
    }

    public String getFormula(){
        double m = this.getGradien();
        double cons = this.beginning.getOrdinat() - (m * this.beginning.getAbsis());

        return "y = " + m + "x + (" + cons + ")";
    }
}
