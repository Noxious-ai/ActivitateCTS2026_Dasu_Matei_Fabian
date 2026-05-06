package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    List<Command> commandList;

    public Operator() {
        this.commandList = new ArrayList<>();
    }

    public void adaugaComanda(Command comanda){
        commandList.add(comanda);
    }

    public void executaComanda(){
        if(commandList.size() > 0){
            commandList.get(0).pleacaInCursa();
            commandList.remove(0);
        }

    }
}
