package ro.ase.cts.cts.animale;

public class Zebra extends Animal{
    private int linesCount;

    public Zebra(String name, int age, FoodType foodType, int linesCount) {
        super(name, age, foodType);
        this.linesCount = linesCount;
    }

    @Override
    public void eat(String zooKeeperName) {
        System.out.println("ZooKeeper " + zooKeeperName + " feeds " + super.name + " " + super.foodType);
    }
}
