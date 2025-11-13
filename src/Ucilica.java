import likovi.Likovi;

import java.util.ArrayList;

public class Ucilica {
    private ArrayList<Likovi> likovi;

    public Ucilica(ArrayList<Likovi> likovi) {
        this.likovi = likovi;
    }

    public ArrayList<Likovi> getLikovi() {
        return likovi;
    }

    public Ucilica() {
        this.likovi = new ArrayList<>();
    }

}
