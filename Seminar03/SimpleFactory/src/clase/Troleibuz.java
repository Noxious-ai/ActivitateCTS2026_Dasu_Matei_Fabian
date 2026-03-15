package clase;

public class Troleibuz extends MijlocTransport{
    public Troleibuz(int numarRoti, String numarInmatriculare) {
        super(numarRoti, numarInmatriculare);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("Troleibuzul ").append(super.numarInmatriculare);
        sb.append(" are ").append(super.numarRoti).append(" roti.");
        System.out.println(sb);
    }

}

