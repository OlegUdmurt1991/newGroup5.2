package HW.Lesson39.second;

public class Summa {
    /*Это метод возвращающий сумму int от 2х переменных int*/
    int sum(int a, int b) { //****
        return (a + b);
    }

    /*Это метод возвращающий сумму double от 3х переменных int*/
    double sum(int a, int b, int c) {  //****
        return (a + b + c);
    }

    /*Это метод возвращающий сумму double от 2х переменных double*/
    double sum(double x, double y) {
        return x + y;
    }

    /*Это метод возвращающий сумму double от 3х переменных double*/
    double sum(double x, double y, double z) {
        return x + y + z;
    }

    /*Метод возвращающий сумму double от 1 int и от 2х переменных double*/
    double sum(int a, double x, double y) {
        return a + x + y;
    }

    /*возвращающий double из 2х переменных типа Integer*/
    double sum(Integer x, Integer y) {
        return (x + y);
    }
}