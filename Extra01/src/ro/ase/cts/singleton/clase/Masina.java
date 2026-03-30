package ro.ase.cts.singleton.clase;

public class Masina extends AMasina{

    public Masina(int an, String marca) {
        super(an, marca);
    }

    @Override
    public void afiseaza() {
        System.out.println("Masina:" + this.marca);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Masina{");
        sb.append("an=").append(an);
        sb.append(", marca='").append(marca).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
