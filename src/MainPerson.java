public class MainPerson {

    public static void main(String[] args) {

        Person jag = new Person(" 01-04-16 ");
        jag.setNamn("Biniam");
        jag.setGatuAdress("Lättingebacken 6");
        jag.setPostNummer("162 63");
        jag.setPostort("Spånga");


        Person kompis = new Person("04-10-24");
        kompis.setNamn("Hanna");
        kompis.setGatuAdress("Norgegatan 6");
        kompis.setPostNummer("164 52");
        kompis.setPostort("Kista");

        System.out.println(" Flyttar ifrån; ");
        jag.SkrivUtInfo();

        System.out.println(" Flyttar till; ");
        kompis.SkrivUtInfo();

    }
}

