package ro.ase.cts.clase;

public class Papanasi extends Desert{

    public Papanasi(float pret, float gramaj, int calorii) {
        super(pret, gramaj, calorii);
    }

    @Override
    public void afisare() {
        final StringBuilder sb = new StringBuilder("Papanasi{");
        sb.append("pret=").append(pret);
        sb.append(", gramaj=").append(gramaj);
        sb.append(", calorii=").append(calorii);
        sb.append('}');

        System.out.println(sb);
    }
}