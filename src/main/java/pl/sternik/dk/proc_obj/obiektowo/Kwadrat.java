package pl.sternik.dk.proc_obj.obiektowo;

public class Kwadrat extends Figura {
    public int a;


    public Kwadrat(int a) {

        this.a = a;
    }

    @Override
    double countPole() {
        return a*a;
    }

}
