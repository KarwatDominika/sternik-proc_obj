package pl.sternik.dk.proc_obj.proceduralnie;

public class MainPoc {

    public static void main(String[] args) {

        Kwadrat k = new Kwadrat(2);
        System.out.println("Kwadrat pole: " + ProceduryPola.countPole(k));

        Prostokat p = new Prostokat(2, 4);
        System.out.println("Prostokąt pole: " + ProceduryPola.countPole(p) );

    }
}
