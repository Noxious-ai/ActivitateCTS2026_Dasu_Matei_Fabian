package ro.ase.cts.builder;

public class Cazare {
    private int durata;
    private String camera;
    private int stele;

    protected Cazare(int durata, String camera, int stele) {
        this.durata = durata;
        this.camera = camera;
        this.stele = stele;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cazare{");
        sb.append("durata=").append(durata);
        sb.append(", camera='").append(camera).append('\'');
        sb.append(", stele=").append(stele);
        sb.append('}');
        return sb.toString();
    }
}
