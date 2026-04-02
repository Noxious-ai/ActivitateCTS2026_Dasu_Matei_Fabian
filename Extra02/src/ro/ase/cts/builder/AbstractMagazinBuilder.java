package ro.ase.cts.builder;

public interface AbstractMagazinBuilder {
    Magazin build();
    AbstractMagazinBuilder setNumarIntrari(int numarIntrari);
    AbstractMagazinBuilder setDuritatePodea(int duritatePodea);
    AbstractMagazinBuilder setDenumire(String denumire);
}
