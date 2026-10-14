public class Maträtt {

    private String Namn;
    private double Pris;
    private String Kostval;
    private int AntalKalorier;

    Maträtt(String Namn, double Pris, String Kostval, int AntalKalorier) {
        this.Namn = Namn;
        this.Pris = Pris;
        this.Kostval = Kostval;
        this.AntalKalorier = AntalKalorier;
    }

    String getNamn() {
        return Namn;
    }
    double getPris() {
        return Pris;
    }
    String getKostval() {
        return Kostval;
    }
    int getAntalKalorier() {
        return AntalKalorier;
    }
}