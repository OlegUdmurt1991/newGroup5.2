package HW.Lesson39.first;

public class Cat {
    int numberOfYears; //количество лет
    String eyeColor; //Цвет глаз
    double weight; //Вес
    String coatColor; //Цвет шерсти
    /*Этот конструктор вызывается в cat*/
    public Cat(int numberOfYears, String eyeColor, double weight, String coatColor) {
        this.numberOfYears = numberOfYears;
        this.eyeColor = eyeColor;
        this.weight = weight;
        this.coatColor = coatColor;
    }
    /*Этот конструктор вызывается другим конструктором, который вызывается cat2*/
    public Cat(String eyeColor, int numberOfYears, double weight, String coatColor) {
        this.numberOfYears = numberOfYears;
        this.eyeColor = eyeColor;
        this.weight = weight;
        this.coatColor = coatColor;
    }
    /*Этот конструктор вызывается в cat3*/
    public Cat(double weight) {
        this.weight = weight;
        this.numberOfYears = 6;
        this.eyeColor = "Серо-бырый";
        this.coatColor = "Рыжий";
    }
/*Этот конструктор вызывается в cat4*/
    public Cat(int numberOfYears) {
        this(numberOfYears, "Бежевые",7.6,"Белый");
    }
    /*Этот конструктор вызывается в cat2*/
    public Cat(String eyeColor) {
        this(eyeColor, 2,3.5,"Фиолетовый");
    }
    /*Этот конструктор вызывается в cat5*/
    public Cat(String eyeColor, String coatColor) {
        this.eyeColor = eyeColor;
        this.coatColor = coatColor;
        this.weight = 0.8;
        this.numberOfYears = 15;
    }
    /*Этот конструктор вызывается в cat6*/
    public Cat(double weight, String eyeColor) {
        this.weight = weight;
        this.eyeColor = eyeColor;
        this.coatColor = "Серый";
        this.numberOfYears = 9;
    }

    @Override
    public String toString() {
        return "Количество лет = " + numberOfYears +
                ", Цвет глаз = '" + eyeColor + '\'' +
                ", Вес =" + weight +
                ", Цвет шерсти ='" + coatColor + '\'';
    }
}