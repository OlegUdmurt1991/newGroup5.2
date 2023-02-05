package HW.Lesson39.second;

public class Summa {
    int sum(int a, int b) { //Это метод возвращающий сумму int от 2х переменных int
        return (a + b);
    }

    double sum(int a, int b, int c) { //Метод возвращающий сумму double от 3х переменных int
        c = b;
        return (a + b + c);
    }

    double sum(double x, double y, double z) { //Метод возвращающий сумму double от 2х и от 3х переменных double
        double xy = x + y;
        double xyz = x + y + z;
        System.out.print(xy + " и ");
        return xyz;
    }

    double sum(int a, double x, double y) { //Метод возвращающий сумму double от 1 int и от 2х переменных double
        return a + x + y;
    }

    double sum(Integer a, Integer b) {// возвращающий double из 2х переменных типа Integer
        return a + b;
    }
}