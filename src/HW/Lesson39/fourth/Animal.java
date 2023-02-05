package HW.Lesson39.fourth;

public class Animal {
    static String planet = "Земля";

    public Animal(String planet) {
        this.planet = planet;
    }

    public Animal() {
        this.planet = planet;
    }

    String print() {
        return planet;
    }

    @Override
    public String toString() {
        return planet;
    }
}
