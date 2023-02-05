package HW.Lesson19;

public class Dog extends Animal {
    Dog(String name, String location, String food, HealthState health, int counter) {
        super(name);
        super.location = location;
        this.food = food;
        this.health = health;
        this.counter = counter;
    }

    @Override
    public void makeSound() {
        System.out.println("Издает звук: Ав Ав Ав Ав ");
    }

    @Override
    public void eat() {
        System.out.println("Грызет кость ");
    }

    @Override
    public void sleep() {
        System.out.println("Песик храпит");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}