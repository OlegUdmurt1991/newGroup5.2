package HW.Lesson47.Task4;

/*В основном классе программы объявлена и инициализиована целочисленная переменная n.
Реализуйте метод boolean isPrime(int x), который возвращает true, если x - простое число.
Реализуйте метод int nextInt(int x),

который возвращает случайно сгенерированное целое число от 0 до x, x не включая.


Используя эти методы, напишите программу, которая генерит целые
числа до тех пор, пока не сгенерит простое число.
Для генерации простых чисел можно пользоваться классом
java.lang.Math или java.util.Random.*/

public class Four {
    static int n = 12;

    static boolean isPrime(int x) {

        return ((x > 1) || (x % 1 == 0) || (x < n));
    }

    static int nextInt(int x) {

           return (int) Math.random()*x;

    }

    public static void main(String[] args) {
        int randomNum;
        while (true) {
            randomNum = nextInt(n - 1) + 1;

        }

//            System.out.println(nextInt(3));


    }
}
