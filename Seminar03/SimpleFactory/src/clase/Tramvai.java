package clase;

public class Tramvai extends MijlocTransport{
    public Tramvai(int numarRoti, String numarInmatriculare) {
        super(numarRoti, numarInmatriculare);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tramvaiul ").append(super.numarInmatriculare);
        sb.append(" are ").append(super.numarRoti).append(" roti.");
        System.out.println(sb);
    }

}
