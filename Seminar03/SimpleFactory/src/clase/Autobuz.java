package clase;

public class Autobuz extends MijlocTransport{
    public Autobuz(int numarRoti, String numarInmatriculare) {
        super(numarRoti, numarInmatriculare);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("Autobuzul ").append(super.numarInmatriculare);
        sb.append(" are ").append(super.numarRoti).append(" roti.");
        System.out.println(sb);
    }
}
