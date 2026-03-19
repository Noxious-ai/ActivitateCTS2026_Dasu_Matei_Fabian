package ro.ase.cts.cts.animale;

public class Monkey extends Animal{
    public Monkey(String name, int age, FoodType foodType) {
        super(name, age, foodType);
    }

    @Override
    public void eat(String zooKeeperName) {
        System.out.println("ZooKeeper " + zooKeeperName + " feeds " + super.name + " " + super.foodType);
    }
}
