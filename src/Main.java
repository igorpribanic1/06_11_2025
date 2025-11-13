import java.util.Scanner;
import likovi.*;

public class Main{
    public static void main(String[] args) {
        String lik = "";
        String naziv = "";
        double a;
        double b;
        double c;
        double r;
        Scanner sc = new Scanner(System.in);

        System.out.println("Odaberite lik:\n\tTrokut: T\n\tKrug: K\n\tPravokutnik: P\n");

        lik = sc.nextLine();

        switch (lik) {
            case "T":
                System.out.println("Upišite naziv lika: ");
                naziv = sc.nextLine();
                System.out.println("Upišite duljinu 1. stranice: ");
                a = Double.valueOf(sc.nextLine());
                System.out.println("Upišite duljinu 2. stranice: ");
                b = Double.valueOf(sc.nextLine());
                System.out.println("Upišite duljinu 3. stranice: ");
                c = Double.valueOf(sc.nextLine());
                Trokut trokut = new Trokut(naziv, a, b, c);
                System.out.println("Opseg trokuta je: " + trokut.opseg());
                System.out.println("Površina trokuta je: " + trokut.povrsina());
                System.out.println(trokut.toString());
                break;
            case "K":
                System.out.println("Upišite naziv lika: ");
                naziv = sc.nextLine();
                System.out.println("Upišite radijus (polumjer): ");
                r = Double.valueOf(sc.nextLine());
                Krug krug = new Krug(naziv, r);
                System.out.println("Opseg kruga je: " + krug.opseg());
                System.out.println("Površina kruga je: " + krug.povrsina());
                System.out.println(krug.toString());
                break;
            case "P":
                System.out.println("Upišite naziv lika: ");
                naziv = sc.nextLine();
                System.out.println("Upišite duljinu 1. stranice: ");
                a = Double.valueOf(sc.nextLine());
                System.out.println("Upišite duljinu 2. stranice: ");
                b = Double.valueOf(sc.nextLine());
                Pravokutnik pravokutnik = new Pravokutnik(naziv, a, b);
                System.out.println("Opseg pravokutnika je: " + pravokutnik.opseg());
                System.out.println("Površina pravokutnika je: " + pravokutnik.povrsina());
                System.out.println(pravokutnik.toString());
                break;
            default:
                System.out.println("Odabrani lik nije ispravan");
        }

    }
}
