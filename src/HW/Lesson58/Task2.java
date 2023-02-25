package HW.Lesson58;

/**
 * Через аргументы командной строки передаются "слова" - последовательность строчных латинских букв и цифр. Каждый аргумент - отдельное "слово".
 * Напишите программу, которая выводит слова наибольшей длины.
 * <p>
 * Сделайте проверку на наличие аргументов командной строки.
 * Если аргументы не переданы, то выведите соответствующее сообщение и завершите программу.
 * Сделайте проверку, что "слова" состоят только из строчных латинских букв и цифр.
 * Иначе выведите сообщение об ошибке и завершите программу.
 * <p>
 * Например:
 * Ввод: 123 abcd b33f 0s 12
 * Вывод: abcd b33f
 */
public class Task2 {
    /**Создаем массив строк "str"*/
    static String[] str;

    public static void print(String[] str) {
/**Проверяем, есть ли аргументы*/
        if (str.length == 0) {
            System.out.println("Нет аргументов командной строки.");
        } else {
            System.out.println("Аргументы командной строки:");
            /**перебираем аргументы и выводим их на экран*/
            for (int i = 0; i < str.length; i++) {
                /**Если в аргументе значения = латинице или строковые цифры*/
                if (str[i].toLowerCase().matches("[a-z0-9]+")) {
                    System.out.println("Аргумент " + i + ": " + str[i]);
                } else {
                    System.out.println("Аргумент " + i + ": " + "содержит не подобающие символы");
                }
            }
        }
    }

    public static void main(String[] args) {
        /** создание массива строк из аргументов командной строки*/
        str = args;
        /** вызов метода и передача ему массива аргументов*/
        print(str);
    }
}