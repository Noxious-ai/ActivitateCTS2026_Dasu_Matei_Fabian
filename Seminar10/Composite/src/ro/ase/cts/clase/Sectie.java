package ro.ase.cts.clase;

public class Sectie implements Structura{
    private String numeSectie;
    private int nrAngajati;

    public Sectie(String numeSectie, int nrAngajati) {
        this.numeSectie = numeSectie;
        this.nrAngajati = nrAngajati;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sectie{");
        sb.append("numeSectie='").append(numeSectie).append('\'');
        sb.append(", nrAngajati=").append(nrAngajati);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afiseazaDetaliiStructura(String spatii) {
        System.out.println(spatii + this.toString());
    }
}
