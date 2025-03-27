public class Wydarzenie {
    private String nazwa;
    private String data;
    private String miejsce;
    final int maxliczbamiesjc=100;
    private int dostepneMiejsce=0;
    private double cena;
    public Wydarzenie(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }
    public Wydarzenie(String nazwa,double cena,String data) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.data = data;
    }
    public Wydarzenie(String nazwa,double cena,String data,String miejsce) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.data = data;
        this.miejsce = miejsce;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getMiejsce() {
        return miejsce;
    }

    public void setMiejsce(String miejsce) {
        this.miejsce = miejsce;
    }

    public int getMaxliczbamiesjc() {
        return maxliczbamiesjc;
    }

    public int getDostepneMiejsce() {
        return dostepneMiejsce;
    }

    public void setDostepneMiejsce(int dostepneMiejsce) {
        this.dostepneMiejsce = dostepneMiejsce;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
    public String toString(){

        return  "Nazwa:"+getNazwa()+"Data:"+getData()+"miejsce:"+getMiejsce()+"cena:"+getCena();

    }
    public void zarezerwujMiejsce(){
        dostepneMiejsce=dostepneMiejsce-1;
    }
}
