public class Student{

    private String Namn;
    private String Efternamn;
    private String Skola;
    private int Ålder;

    Student(String Namn, String Efternamn, String Skola, int Ålder){
        this.Namn = Namn;
        this.Efternamn = Efternamn;
        this.Skola = Skola;
        this.Ålder = Ålder;

    }
    String getNamn(){
        return this.Namn;
    }
    String getEfternamn(){
        return this.Efternamn;
    }
    String getSkola(){
        return this.Skola;
    }
    String getÅlder(){
        return this.Ålder+"År";
    }

    void setNamn(String Namn){
        this.Namn = Namn;
    }
    void setEfternamn(String Efternamn){
        this.Efternamn = Efternamn;
    }
    void setSkola(String Skola){
        this.Skola = Skola;
    }
    void setÅlder(int Ålder){
        this.Ålder = Ålder;
    }
}

