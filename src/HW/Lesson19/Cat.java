package HW.Lesson19;

public class Cat extends Animal {
    Cat(String name, String location, String food, HealthState health, int counter) {
        super(name);
        super.location = location;
        this.food = food;
        this.health = health;
        this.counter = counter;
    }

    @Override
    public void makeSound() {
        System.out.println("Издает звук: Мяу Мяу ");
    }

    @Override
    public void eat() {
        System.out.println("Лижет сметанку ");
    }

    @Override
    public void sleep() {
        System.out.println("сладко мурлыкает во сне ");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}