package ro.ase.cts.clase;

public class Autobuz implements MijlocDeTransport{
    private int numarPasageri;
    private int numarLinie;
    private TipCursa tipCursa;

    public Autobuz(int numarPasageri, int numarLinie) {
        this.numarPasageri = numarPasageri;
        this.numarLinie = numarLinie;
        this.tipCursa = TipCursa.CURSA_NORMALA;
    }

    public Autobuz(int numarPasageri, int numarLinie, TipCursa tipCursa) {
        this.numarPasageri = numarPasageri;
        this.numarLinie = numarLinie;
        this.tipCursa = tipCursa;
    }

    @Override
    public void opresteInStatie(StatieAutobuz statieAutobuz) {
        System.out.println("Autobuzul de pe linia " + this.numarLinie + " a oprint in statia " + statieAutobuz.getNume());
    }

    @Override
    public int getNumarPasageri() {
        return this.numarPasageri;
    }

    public int getNumarLinie() {
        return this.numarLinie;
    }

    @Override
    public TipCursa getTipCursa() {
        return this.tipCursa;
    }
}
