package ro.ase.cts.singleton.clase;

public class SingletonLicentaTurism implements AbstractLicentaTurism{

    private String name;

    private static SingletonLicentaTurism instance = null;

    private SingletonLicentaTurism(String name) {
        this.name = name;
    }


    public static synchronized SingletonLicentaTurism getInstance(String name){
        if (instance == null){
            instance = new SingletonLicentaTurism(name);
        }

        return instance;
    }


    @Override
    public void afiseazaDetalii() {
        System.out.println(this.name);
    }
}
