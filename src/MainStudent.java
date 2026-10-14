public class MainStudent {
    public static void main(String[] args) {

        Student student = new Student(" Hanna ", " Larsson ", " Nackademin ", 22);


        System.out.println("Namn: " + student.getNamn() + "Efternamn: " + student.getEfternamn() +"Skola: " + student.getSkola()+"Ålder: " + student.getÅlder());


        student.setÅlder(23);

        System.out.println("Nya ålder: " + student.getÅlder());

    }
}

