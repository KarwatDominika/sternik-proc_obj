package pl.sternik.dk.proc_obj.obiektowo;

public class Prostokat extends Figura {

    public int a;
    public int b;

    public Prostokat(int a, int b) {

        this.a = a;
        this.b = b;
    }

    @Override
    double countPole() {
        return a*b;
    }
}