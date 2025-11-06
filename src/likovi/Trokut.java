package likovi;

public class Trokut extends Likovi {
    //private String naziv;
    private double a;
    private double b;
    private double c;
    private double opseg;
    private double povrsina;


    public Trokut(String naziv, double a, double b, double c) {
        super(naziv);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double opseg(){
        opseg = a + b + c;
        return opseg;
    }

    @Override
    public double povrsina(){
        opseg = a + b + c;
        povrsina = Math.sqrt(opseg/2 * (opseg/2 - a) * (opseg/2 - b) * (opseg/2 -c));
        return povrsina;
    }

    @Override
    public String toString() {
        return  "Naziv trokuta=" + super.getNaziv() + ", " +
                "Opseg trokuta=" + opseg() + ", " +
                "Površina trokuta=" + povrsina();
    }
}
