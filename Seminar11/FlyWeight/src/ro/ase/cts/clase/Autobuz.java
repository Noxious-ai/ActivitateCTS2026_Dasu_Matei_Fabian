package ro.ase.cts.clase;

public class Autobuz {
    private String model;
    private int anFabricatie;
    private int numarLocuri;

    public Autobuz(String model, int anFabricatie, int numarLocuri) {
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.numarLocuri = numarLocuri;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("model='").append(model).append('\'');
        sb.append(", anFabricatie=").append(anFabricatie);
        sb.append(", numarLocuri=").append(numarLocuri);
        sb.append('}');
        return sb.toString();
    }

    public int getNumarLocuri() {
        return numarLocuri;
    }
}
