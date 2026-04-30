package ro.ase.cts.clase;

public class Linie implements LinieAbstract {
    private String primaStatie;
    private String ultimaStatie;
    private int nrLinie;

    public Linie(int nrLinie, String primaStatie, String ultimaStatie) {
        this.primaStatie = primaStatie;
        this.ultimaStatie = ultimaStatie;
        this.nrLinie = nrLinie;
    }

    @Override
    public void descrereLinie(Autobuz autobuz) {
        System.out.println("Linia " + this.nrLinie + " prima statie " + this.primaStatie + " ultima statie " + this.ultimaStatie + " " + autobuz.toString());
    }

    @Override
    public void numarMaximPasageriPeLinie(Autobuz autobuz) {
        System.out.println("Numarul maxim de pasageri pe linia " + this.nrLinie + " este " + autobuz.getNumarLocuri());
    }

    public int getNrLinie() {
        return nrLinie;
    }
}
