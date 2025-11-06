package likovi;

public class Krug extends Likovi {
    //private String naziv;
    private double r;
    private double opseg;
    private double povrsina;

    public Krug(String naziv, double r) {
        super(naziv);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double opseg(){
        opseg = 2 * r * Math.PI;
        return opseg;
    }

    @Override
    public double povrsina(){
        povrsina = Math.pow(r, 2) * Math.PI;
        return povrsina;
    }
}
