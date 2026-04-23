package ro.ase.cts.clase;

public class Pacient {
    private int gravitate;
    private String nume;

    public String getNume() {
        return nume;
    }

    public Pacient(String nume, int gravitate) {
        this.nume = nume;
        this.gravitate = gravitate;

    }

    public int getGravitate() {
        return gravitate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("gravitate=").append(gravitate);
        sb.append(", nume='").append(nume).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
