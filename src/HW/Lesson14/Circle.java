package HW.Lesson14;

/*
Создать класс Circle, который содержит
        - переменную radius;
        - методы, вычисляющие площадь и длину окружности;
        - константу PI. */
public class Circle {
    double radius;
    final double PI = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void squareCircle() { //площадь круга
        double valueSquare = PI * (radius * radius);
        System.out.println("Радиус = " + radius + " Площадь круга = " + valueSquare);
    }

    public void lengthCircle() { //Длина круга
        double valueLenght = PI * (radius + radius);
        System.out.println("Радиус = " + radius + " Длина круга = " + valueLenght);
    }
}
