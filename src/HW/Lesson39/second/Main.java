package HW.Lesson39.second;
/*Создать класс Summa, в нем cоздать и перегрузить метод sum
- возвращающий сумму int от 2х переменных int
- возвращающий сумму double от 3х переменных int
- возвращающий сумму double от 2х и от 3х переменных double
- возвращающий сумму double от 1 int и от 2х переменных double
- возвращающий double из 2х переменных типа Integer

Сделать класс с методом main, в методе объявить и инициализировать переменные а и b типа int ,
переменные x, y, z типа double. Вызовите созданные методы класса Summa, используя объявленные переменные.
Полученные результаты вывести на экран.*/
public class Main {
    public static void main(String[] args) {

        Summa firstExe = new Summa();
        System.out.println("Первое задание " + firstExe.sum(4,5));
        Summa secondExe = new Summa();
        System.out.println("Второе задание " + secondExe.sum(2,6,8));
        Summa thirdExe = new Summa();
        System.out.println("Третье задание " + thirdExe.sum(5,5,2.3));
        Summa fourthExe = new Summa();
        System.out.println("Четвертое задание " + fourthExe.sum(6,5.7,6.1));
        Summa fiveExe = new Summa();
        System.out.println("Пятое задание " + fiveExe.sum(66,24));
    }
}