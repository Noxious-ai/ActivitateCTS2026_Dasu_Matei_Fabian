package ro.ase.cts.clase;

public class SupaLegume extends Supa{

    public SupaLegume(float pret, float gramaj) {
        super(pret, gramaj);
    }

    @Override
    public void afisare() {
        final StringBuilder sb = new StringBuilder("SupaLegume{");
        sb.append("pret=").append(pret);
        sb.append(", gramaj=").append(gramaj);
        sb.append('}');

        System.out.println(sb);
    }
}