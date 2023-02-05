package HW.Lesson47.Task1;

/*Напишите программу, которая получает два целых числа m и n
через аргументы командной строки и печатает целые числа x:
     m <= x <= n, которые делятся на 3, но не делятся на 5.


Проверку на наличие аргументов делать не надо.*/
public class First {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]); //Введеный аргумент 1
        int n = Integer.parseInt(args[1]); //Введеный аргумент 18
        int x;
        for (x = 3; x <= n && x >= m; x++)
            if (x % 3 == 0 && x % 5 != 0) {
                System.out.println(x);
            }
    }
}