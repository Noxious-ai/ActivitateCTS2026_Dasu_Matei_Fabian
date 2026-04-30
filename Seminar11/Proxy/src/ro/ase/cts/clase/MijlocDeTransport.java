package ro.ase.cts.clase;

public interface MijlocDeTransport {
    void opresteInStatie(StatieAutobuz statieAutobuz);
    int getNumarPasageri();

    int getNumarLinie();

    TipCursa getTipCursa();
}
