package ro.ase.cts.clase;

public class Plecare implements Command{
    private Autobuz autobuz;
    private int numarLinie;

    @Override
    public void pleacaInCursa() {
        autobuz.pleacaPeTraseu(numarLinie);
    }

    public Plecare(Autobuz autobuz, int numarLinie) {
        this.autobuz = autobuz;
        this.numarLinie = numarLinie;
    }
}
