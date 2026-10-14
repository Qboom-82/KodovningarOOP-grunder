public class Person {
    String Födelsedatum;
    String Namn;
    String GatuAdress;
    String PostNummer;
    String Postort;

    Person(String Födelsedatum){
        this.Födelsedatum = Födelsedatum;
    }
    String getFödelsedatum(){
        return this.Födelsedatum;
    }
    String getNamn(){
        return this.Namn;
    }
    String getGatuAdress(){
        return this.GatuAdress;
    }
    String getPostNummer(){
        return this.PostNummer;
    }
    String getPostort(){
        return this.Postort;

    }
    void setNamn(String Namn){
        this.Namn = Namn;
    }
    void setGatuAdress(String GatuAdress){
        this.GatuAdress = GatuAdress;
    }
    void setPostNummer(String PostNummer){
        this.PostNummer = PostNummer;
    }
    void setPostort(String Postort){
        this.Postort = Postort;
    }
    public void FlyttaIn(Person AnnanKompis) {
        this.GatuAdress = AnnanKompis.getGatuAdress();
        this.PostNummer = AnnanKompis.getPostNummer();
        this.Postort = AnnanKompis.getPostort();
    }
    public void SkrivUtInfo() {
        System.out.println(" (" + Namn +"): " + GatuAdress + ", " + PostNummer + " " + Postort);

    }
}

