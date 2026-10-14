import java.util.ArrayList;

public class MainMaträtt {

    public static void main(String[] args) {

        ArrayList<Maträtt> meny = new ArrayList<>();

        meny.add(new Maträtt("Köttbullar med mos", 115.0, "Kött", 700));
        meny.add(new Maträtt("Linsgryta", 95.0, "Vegansk", 400));
        meny.add(new Maträtt("Halloumisallad", 110.0, "Vegetarisk", 550));

        System.out.println(" Dagens Lunchmenu; ");

        System.out.println(matratt.getNamn() + " (" + matratt.getKostval() + ") - " + matratt.getPris() + " kr (" + matratt.getAntalKalorier() + " kalorier)");
    }
}