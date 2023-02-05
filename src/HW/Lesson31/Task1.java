package HW.Lesson31;

/*Даны две целые переменные a, b. Напишите программу, после исполнения которой значения переменных
поменялись бы местами (новое значение a равно старому значению b и наоборот).
Выведите исходные значения и результат. Например:
     Дано: a = 4, b = 5
     После перестановки: a = 5, b = 4*/
public class Task1 {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        System.out.println("a = " + a);
        System.out.println("b = " + b + '\n');
        int buf = a; //буферная переменная
        a = b;
        b = buf;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}