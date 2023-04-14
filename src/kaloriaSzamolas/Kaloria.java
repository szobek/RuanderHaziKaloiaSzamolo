package kaloriaSzamolas;

public final class Kaloria {
    private final String nev;
    private double napiKaloria;

    public Kaloria(String nev) {
        this.nev = nev;
        this.napiKaloria=0;
    }

    public String getNev() {
        return nev;
    }

    public double getNapiKaloria() {
        return napiKaloria;
    }


    public void taplalkozas(int kcal){
        this.napiKaloria+=kcal;
    }
    public void sportolas(double sportOra){
        System.out.println(sportOra*600);
        this.napiKaloria-=(sportOra*600);
        System.out.println(this.napiKaloria);
    }
    public void pihenes(double pihenesOra){
        this.napiKaloria-=(pihenesOra*40);
    }


    public void napiErtek(){
        System.out.println(this.napiKaloria);
        System.out.println(" A nap végén: "+this.napiKaloria+"kcal.");
    }
}
