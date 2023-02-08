package HW.Lesson47.Task4;

/*В основном классе программы объявлена и инициализиована целочисленная переменная n.
Реализуйте метод boolean isPrime(int x), который возвращает true, если x - простое число.
Реализуйте метод int nextInt(int x),

который возвращает случайно сгенерированное целое число от 0 до x, x не включая.



Используя эти методы, напишите программу, которая генерит целые
числа в диапазоне от 1 до n (не включая n) до тех пор, пока не сгенерит простое число.
Для генерации простых чисел можно пользоваться классом
java.lang.Math или java.util.Random.*/

import java.util.Random;

public class Four {
    static int n = 152;
    static Random random = new Random();

    static boolean isPrime(int x) {

        if ((x <= 1) || (x % 1 != 0) || (x == n)) {
            return false;
        }
        return true;
    }

    static int nextInt(int x) {
        return random.nextInt(x);
    }

    public static void main(String[] args) {
        while (true) {
            int x = nextInt(n);
            if (isPrime(x)) {
                System.out.println("Генерируем случайное число: " + x);
                break;
            }
        }
    }
}