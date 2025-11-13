package likovi;

public class Pravokutnik extends Likovi {
    //private String naziv;
    private double a;
    private double b;
    private double opseg;
    private double povrsina;

    public Pravokutnik(String naziv, double a, double b) {
        super(naziv);
        this.a = a;
        this.b = b;
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

    @Override
    public double povrsina() {
        povrsina = a * b;
        return povrsina;
    }

    @Override
    public double opseg() {
        opseg = 2 * a + 2 * b;
        return opseg;
    }

    @Override
    public int compareTo(Likovi o) {
        return Double.valueOf(povrsina()).compareTo(Double.valueOf(o.povrsina()));
    }
}
