package HW.Lesson39.first;

public class Cat {
    int numberOfYears; //количество лет
    String eyeColor; //Цвет глаз
    double weight; //Вес
    String coatColor; //Цвет шерсти

    public Cat(int numberOfYears, String eyeColor, double weight, String coatColor) {
        this.numberOfYears = numberOfYears;
        this.eyeColor = eyeColor;
        this.weight = weight;
        this.coatColor = coatColor;
    }

    public Cat(String eyeColor, int numberOfYears, double weight, String coatColor) {
        this.numberOfYears = numberOfYears;
        this.eyeColor = eyeColor;
        this.weight = weight;
        this.coatColor = coatColor;
    }

    public Cat(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public Cat(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public Cat(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Количество лет = " + numberOfYears +
                ", Цвет глаз = '" + eyeColor + '\'' +
                ", Вес =" + weight +
                ", Цвет шерсти ='" + coatColor + '\'';
    }
}