package HW.Lesson31;

/*Даны две целые переменные a, b. Напишите программу, после исполнения которой
значения переменных поменялись бы местами (новое значение a равно старому значению b и наоборот),
но без использования дополнительной переменной.
Выведите исходные значения и результат. Например:
     Дано: a = 4, b = 5
     После перестановки: a = 5, b = 4*/
public class Task2 {
    public static void main(String[] args) {
        int a = 6;
        int b = 3;
        System.out.println("a = " + a);
        System.out.println("b = " + b + '\n');
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
