package ro.ase.cts.zoo;

import ro.ase.cts.animale.Animal;

import java.util.List;

public class ZooKeeper {
    private String name;

    public ZooKeeper(String name){
        this.name = name;
    }

    public void feedAnimal(Animal animal) {
        animal.eat(this.name);
    }
}
