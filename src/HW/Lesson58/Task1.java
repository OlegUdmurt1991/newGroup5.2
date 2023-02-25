package HW.Lesson58;
/**
 * Реализуйте метод void fillArray(int[] a),
 * который устанавливает элементам целочисленного массива а случайные целые числа -9 до 9.
 * <p>
 * Напишите программу, которая создает массив из 20 целочисленных элементов,
 * заполняет его случайными значениями, используя метод fillArray,
 * и печатает его элементы в одну строку, разделив пробелами.
 */

import java.util.Random;

public class Task1 {
    public static void fillArray(int[] a) {
/**Создаем объект класса Random*/
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            /**Устанавливаем случайное число в диапазоне от -9 до 9*/
            a[i] = random.nextInt(19) - 9;
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        /**Создаем массив целых чисел размером 20 элементов.*/
        int[] a = new int[20];
        /**Вызов метода*/
        fillArray(a);
    }
}