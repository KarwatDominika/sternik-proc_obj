package pl.sternik.dk.proc_obj.obiektowo;

public class MainObj {

    public static void main(String[] args) {
        Figura f = new Prostokat(2, 4);
        System.out.println("Prostokąt pole: " + f.countPole());

        f = new Kwadrat(2);
        System.out.println("Kwadrat pole: " + f.countPole());

    }
}