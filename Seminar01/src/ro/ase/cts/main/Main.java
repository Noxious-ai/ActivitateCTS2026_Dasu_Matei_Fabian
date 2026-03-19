package ro.ase.cts.main;

import ro.ase.cts.cts.animale.FoodType;
import ro.ase.cts.cts.animale.Lion;
import ro.ase.cts.cts.animale.Monkey;
import ro.ase.cts.cts.animale.Zebra;
import ro.ase.cts.cts.zoo.Zoo;
import ro.ase.cts.cts.zoo.ZooKeeper;

public class Main {
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper("John");
        Zoo zoo = new Zoo("Circului", zooKeeper);

        Zebra zebra = new Zebra("zebra", 20, FoodType.GRASS, 30);
        Lion lion = new Lion("lion", 15, FoodType.MEAT, 200);
        Monkey monkey = new Monkey("monkey", 3, FoodType.FRUCTE);

        zoo.addAnimal(zebra);
        zoo.addAnimal(lion);
        zoo.addAnimal(monkey);

        zoo.feedAllAnimals();
    }
}