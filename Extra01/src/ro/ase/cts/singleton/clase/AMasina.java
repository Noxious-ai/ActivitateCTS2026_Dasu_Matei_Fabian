package ro.ase.cts.singleton.clase;

public abstract class AMasina {
    int an;
    String marca;

    public abstract void afiseaza();

    public AMasina(int an, String marca) {
        this.an = an;
        this.marca = marca;
    }
}
