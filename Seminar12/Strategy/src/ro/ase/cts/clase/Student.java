package ro.ase.cts.clase;

public class Student {
    private ModSustinere modSustinere;


    public Student(){
        this.modSustinere = new Grila();
    }

    public Student(ModSustinere modSustinere) {
        this.modSustinere = modSustinere;
    }


    public void setModSustinere(ModSustinere modSustinere) {
        this.modSustinere = modSustinere;
    }

    public void examinare(){
        modSustinere.sustineExamen();
    }
}
