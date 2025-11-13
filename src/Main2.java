import likovi.*;
import java.util.Collections;

public class Main2 {
    public static void main(String[] args) {
        Ucilica u = new Ucilica();

        Krug krug = new Krug("Krug", 25);
        Trokut trokut = new Trokut("Trokut", 3, 4, 5);
        Pravokutnik pravokutnik = new Pravokutnik ("Pravokutnik", 4, 5);

        u.getLikovi().add(krug);
        u.getLikovi().add(trokut);
        u.getLikovi().add(pravokutnik);

        // Ispis prije sortiranja
        for (Likovi l : u.getLikovi()){
            System.out.println(l);
        }

        Collections.sort(u.getLikovi());

        // Ispis poslije sortiranja
        for (Likovi l : u.getLikovi()){
            System.out.println(l);
        }


    }
}
