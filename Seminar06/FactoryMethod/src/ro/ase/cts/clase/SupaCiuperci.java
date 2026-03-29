package ro.ase.cts.clase;

public class SupaCiuperci extends Supa{

    public SupaCiuperci(float pret, float gramaj) {
        super(pret, gramaj);
    }

    @Override
    public void afisare() {
        final StringBuilder sb = new StringBuilder("SupaCiuperci{");
        sb.append("pret=").append(pret);
        sb.append(", gramaj=").append(gramaj);
        sb.append('}');

        System.out.println(sb);
    }
}