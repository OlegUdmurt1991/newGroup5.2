package HW.Lesson4dot4.First;
/**Создайте интерфейс Function, который объявляет абстрактный метод evaluate.
 Метод принимает параметр int и возвращает int.

 Создайте классы Half, Double, Exact, Square, реализующие интерфейс Function.
 В этих классах реализуется метод evaluate:
 - у класса Half метод evaluate делит полученный параметр на 2
 - у класса Double метод evaluate умножает полученный параметр на 2
 - у класса Exact метод evaluate возвращет параметр без изменения
 - у класса Square метод evaluate возвращет параметр, умноженный на сам себя

 Напишите в отдельном классе программу, которая через аргументы командной строки
 получает последовательность целых чисел и название операции, которую надо применить числам.
 При выполнении печатается исходная последовательность чисел, а потом печатается последовательность,
 полученная применением операции к числам.
 Название операции передается первым аргументом, а далее передаются числа.
 Название операции соответствует названиям классов Half, Double, Exact, Square.

 Для реализации программы создайте метод applyFunction, который на вход получает два аргумента:
 - массив из переданных чисел
 - объект типа Function.
 Этот метод возвращает новый массив, где каждый элемент является результатом применения
 метода evaluate объякта типа Function к соответствующему элементу исходного массива.

 При обработке аргументов командной строки добавьте следующие проверки:
 - Если не передано название операции, то программа завершается с соответствующим сообщением об ошибке.
 - Если передано неподдерживаемое название класса, то программа завершается с соответствующим сообщением.
 - Если не передано хотя бы одно число, то программа завершается, с соответствующим сообщением об ошибке.

 Пример:
 1) Переданные аругменты:
 Вывод: Не передано название операции.
 2) Переданные аругменты: Exact
 Вывод: Не переданы числа для операции.
 3) Переданные аругменты: Triple
 Вывод: Операция Triple не поддерживается.
 4) Переданные аругменты: Half 1 2 4 8
 Вывод:
 1 2 4 8
 0 1 2 4*/
public class MainClass {
    /**
     * Метод применяет функцию к массиву чисел и возвращает новый массив с результатами
     *
     * @param arr массив переданных чисел
     * @param function объект типа Function
     * @return новый массив, числа в массиве измененены в соответствии с операцией
     */

    public static int[] commonMethod(Function function, int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = function.evaluate(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        //Получаем название операции
        String operationName = args[0];
        if (operationName == null) {
            System.out.println("Не передано название операции");
        }
        // Создаем объект типа Function, соответствующий операции
        Function operation;
        switch (operationName) {
            case "Half":
                operation = new Half();
                break;
            case "Double":
                operation = new Double();
                break;
            case "Exact":
                operation = new Exact();
                break;
            case "Square":
                operation = new Square();
                break;
            default:
                System.out.println("Операция " + operationName + " не поддерживается.");
                return;
        }
        // Проверяем наличие чисел для операции
        if (args.length < 2) {
            System.out.println("Не переданы числа для операции");
        }
        // Получаем числа для операции и выводим их на экран
        int[] numbers = new int[args.length - 1];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(args[i + 1]);
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        // Применяем операцию к числам и выводим результат на экран
        int[] result = commonMethod(operation, numbers);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}