package ro.ase.cts.singleton.main;


import ro.ase.cts.singleton.clase.Masina;
import ro.ase.cts.singleton.clase.Service;

public class Main {
    public static void main(String[] args) {
        Service service = Service.getInstance("Service", 3);

        Masina m1 = new Masina(3, "BMW");
        service.addMasina(m1);
        service.afiseaza();
        service.addMasina(new Masina(5, "Porsche"));
        service.afiseaza();


        Service service1 = Service.getInstance("Ser", 5);
        service1.afiseaza();
    }
}