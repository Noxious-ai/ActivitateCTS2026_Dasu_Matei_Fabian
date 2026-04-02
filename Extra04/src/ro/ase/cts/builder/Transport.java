package ro.ase.cts.builder;

public class Transport {
    private String denumire;

    protected Transport(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Transport{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
