package HW.Lesson19.ru.pflb.details;

public class Engine {
    int power; //значение мощности двигателя в ваттах
    String vendor; //название производителя

    public Engine(int power, String vendor) {
        this.power = power;
        this.vendor = vendor;
    }

    @Override
    public String toString() { //возвращает строку с информацией о двигателе
        return (vendor + " - " + power);
    }
}