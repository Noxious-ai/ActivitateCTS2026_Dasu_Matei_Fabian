package ro.ase.cts.simpleFactory.model.clase;

public class Usa implements IComponenta{
    protected String denumire;
    protected String culoare;

    @Override
    public void afiseazaDenumire() {
        StringBuilder sb = new StringBuilder();
        sb.append("Denumire: ").append(this.denumire);
        sb.append("Culoare: ").append(this.culoare);
        System.out.println(sb.toString());
    }

    public Usa(String denumire, String culoare) {
        this.denumire = denumire;
        this.culoare = culoare;
    }
}
