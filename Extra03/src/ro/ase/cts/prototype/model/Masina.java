package ro.ase.cts.prototype.model;

public class Masina implements IMasina{
    protected String denumire;
    protected int anFabricatie;

    public Masina(String denumire, int anFabricatie) {
        this.denumire = denumire;
        this.anFabricatie = anFabricatie;
    }

    public String getDenumire() {
        return denumire;
    }

    public int getAnFabricatie() {
        return anFabricatie;
    }

    @Override
    public void afiseazaDetalii() {
        final StringBuilder sb = new StringBuilder("Masina{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", anFabricatie=").append(anFabricatie);
        sb.append('}');
        System.out.println(sb.toString());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Masina{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", anFabricatie=").append(anFabricatie);
        sb.append('}');
        return sb.toString();
    }
}
