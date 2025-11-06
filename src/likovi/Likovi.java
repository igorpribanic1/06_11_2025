package likovi;

public abstract class Likovi {
    private String naziv;
    public abstract double povrsina();
    public abstract double opseg();


    public Likovi(String naziv) {
        this.naziv = naziv;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    @Override
    public String toString() {
        return  "Naziv=" + naziv + ", " +
                "Opseg=" + opseg() + ", " +
                "Površina=" + povrsina();
    }
}
