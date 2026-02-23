package ro.ase.cts.zoo;

import ro.ase.cts.animale.Animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String nume;
    private ZooKeeper zooKeeper;
    private List<Animal> animalList;

    public Zoo(String nume, ZooKeeper zooKeeper) {
        this.nume = nume;
        this.zooKeeper = zooKeeper;
        this.animalList = new ArrayList<>();
    }

    public void addAnimal(Animal animal){
        this.animalList.add(animal);
    }

    public void feedAllAnimals(){
        for(Animal animal : animalList){
            this.zooKeeper.feedAnimal(animal);
        }
    }




}
