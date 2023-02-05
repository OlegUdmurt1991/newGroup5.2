package HW.Lesson19;

public class Horse extends Animal {
    Horse(String name, String location, String food, HealthState health, int counter) {
        super(name);
        super.location = location;
        this.food = food;
        this.health = health;
        this.counter = counter;
    }

    @Override
    public void makeSound() {
        System.out.println("Издает звук: Игого игого ");
    }

    @Override
    public void eat() {
        System.out.println("Жует как жевачку ");
    }

    @Override
    public void sleep() {
        System.out.println("Спит стоя ");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}