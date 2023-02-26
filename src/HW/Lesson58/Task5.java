package HW.Lesson58;

import java.util.Arrays;
import java.util.Random;

/**
 * Напишите программу, которая создает зубчатый массив целочисленных элементов,
 * сгенеренных случайным образов в диапазоне -9 до 9.
 * Массив должен содержать не более 5 строк и каждая строка иметь не более 7 столбцов.
 * Выведите массив на экран в порядке убывания сумм элементов строк.
 */
public class Task5 {
    public static void print() {
        int maxRows = 5;
        int maxCols = 7;
        /**объявление перенной-ссылки на двумерный массив, где первый индекс указывает количество строк */
        int[][] jaggedArray = new int[maxRows][];
        Random random = new Random();
        /** заполнение массива случайными числами*/
        /** пока i меньше количества строк*/
        for (int i = 0; i < jaggedArray.length; i++) {
            /**переменная которая указывает на количество значений в строке(колонок)*/
            int cols = random.nextInt(maxCols) + 1;
            /**ссылка на массив с индексом i(строки)*/
            jaggedArray[i] = new int[cols];
            /**пока j меньше количества значений в строке*/
            for (int j = 0; j < cols; j++) {
                /**строке с индексом i генерим новые значения пока их количество не станет = cols*/
                jaggedArray[i][j] = random.nextInt(19) - 9;
            }
        }
        /**сортировка массива по убыванию сумм элементов строк с использованием метода sortJaggedArray*/
        sortJaggedArray(jaggedArray);

        /**вывод массива после сортировки*/
        System.out.println("Массив после сортировки:");
        /**пока i меньше ммакс. количества строк*/
        for (int i = 0; i < maxRows; i++) {
            System.out.println(Arrays.toString(jaggedArray[i]));
        }
    }

    /**
     * Метод для вычисления суммы элементов массива который принимает одномерный массив целых чисел array
     */
    private static int getSum(int[] array) {
        /**Эта переменная будет использоваться для накопления суммы элементов массива.*/
        int sum = 0;
        /**Пока i меньше длинны массива array */
        for (int i = 0; i < array.length; i++) {
            /** проходим по всем элементам массива row и добавляем их значения к переменной sum*/
            sum += array[i];
        }
/**После того как мы прошлись по всем элементам массива, мы возвращаем сумму, которую мы накопили в переменной sum*/
        return sum;
    }

    /**
     * метод для сортировки зубчатого массива по убыванию сумм элементов строк
     */
    private static void sortJaggedArray(int[][] jaggedArray) {
/**Arrays.sort это метод который используется для сортировки массивов.
 * а лямбда выражение принимает параметры a и b b и сравнивает их суммы*/
        Arrays.sort(jaggedArray, (a, b) -> Integer.compare(getSum(b), getSum(a)));
    }

    public static void main(String[] args) {
        print();
    }
}