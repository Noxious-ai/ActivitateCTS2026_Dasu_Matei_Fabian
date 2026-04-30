package ro.ase.cts.clase;

public class StatieAutobuz {
    private String nume;
    private int numarPersoane;

    public StatieAutobuz(String nume, int numarPersoane) {
        this.nume = nume;
        this.numarPersoane = numarPersoane;
    }

    public String getNume() {
        return nume;
    }

    public int getNumarPersoane() {
        return numarPersoane;
    }
}
