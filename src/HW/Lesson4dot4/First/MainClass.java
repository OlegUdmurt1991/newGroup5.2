package HW.Lesson4dot4.First;

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