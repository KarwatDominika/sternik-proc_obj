package pl.sternik.dk.proc_obj.proceduralnie;

public class ProceduryPola {

    public static double countPole(Kwadrat k) {
        double wynik = 0;
        wynik = k.a * k.a;
        return wynik;
    }

    public static double countPole(Prostokat p) {
        double wynik = 0;
        wynik = p.a * p.b;
        return wynik;
    }

}