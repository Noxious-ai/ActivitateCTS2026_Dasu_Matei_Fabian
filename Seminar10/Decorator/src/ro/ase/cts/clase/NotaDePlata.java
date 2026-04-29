package ro.ase.cts.clase;

public class NotaDePlata implements NotaDePlataAbstract{
    private float pret;
    private String data;

    public NotaDePlata(String data, float pret) {
        this.data = data;
        this.pret = pret;
    }

    @Override
    public void printeaza() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("NotaDePlata{");
        sb.append("pret=").append(pret);
        sb.append(", data='").append(data).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
