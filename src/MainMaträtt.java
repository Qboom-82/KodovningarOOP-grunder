import java.util.ArrayList;

public class MainMaträtt {

    public static void main(String[] args) {

        ArrayList<Maträtt> meny = new ArrayList<>();

        meny.add(new Maträtt("Köttbullar med mos", 115.0, "Kött", 700));
        meny.add(new Maträtt("Linsgryta", 95.0, "Vegansk", 400));
        meny.add(new Maträtt("Halloumisallad", 110.0, "Vegetarisk", 550));

        System.out.println(" Dagens Lunchmenu; ");
        for (Maträtt maträtt : meny){
        System.out.println(maträtt.getNamn() + " (" + maträtt.getKostval() + ") - " + maträtt.getPris() + " kr (" + maträtt.getAntalKalorier() + " kalorier)");
    }
        }
    }