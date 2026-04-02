package ro.ase.cts.builder;

public class ActivitateExtra {
    String denumire;

    protected ActivitateExtra(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ActivitateExtra{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
