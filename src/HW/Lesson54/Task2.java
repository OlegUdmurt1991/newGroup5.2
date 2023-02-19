package HW.Lesson54;
/**Через аругмент командной строки передается строка - путь до некоторого файла -
 содержащая знак «/» или «\». Например, "/bin/java" или "C:\Program Files\Java\bin\java".

 Напишите программу, которая для обоих вариантов разделителей, может вывести отдельно путь и имя файла.
 Если имя файла отсутствует, т.е. строка оканчивается на "\" или "/",
 то выдать ошибку: "Введен некорректный путь до файла."

 Пример:
 1) Через аргументы передается "/bin/java", выводится:
 Путь: /bin/
 Имя файла: java

 2) Через аргументы передается "C:\Program Files\Java\bin\java", выводится:
 Путь: C:\Program Files\Java\bin\
 Имя файла: java

 3) Через аргументы передается "/", выводится:
 Введен некорректный путь до файла.
 Проверку на наличие и корректность аргумента делать не надо.*/
public class Task2 {
    /**
     * Создаем метод, в котором определяем путь файла и имя файла и заносим их в массив
     */
    public String[] getPathAndFileName(String str) {
        /**Создаем переменную которая проверяет на каком месте находится последний "/" или "\" */
        int lastIndex = str.lastIndexOf("/");
        if (lastIndex == -1)
            lastIndex = str.lastIndexOf("\\");
        /**Записываем в переменную от перевого символа до последнего "\" или"/"*/
        String path = str.substring(0, lastIndex + 1);
        /**Записываем в переменную от последнего "\" или"/" и до конца строки*/
        String fileName = str.substring(lastIndex + 1, str.length());
        /**Полученные значения заносим в массив*/
        return new String[]{path, fileName};
    }

    /**
     * Создаем метод выводящий на экран текст
     */
    public void print(String arg) {
        /**Создаем переменную которая принимает значение последнего символа*/
        String lastSymbol = arg.substring(arg.length() - 1);
        /**Проверяет, равен ли последний символ "\" или"/"*/
        if (lastSymbol.equals("\\") || lastSymbol.equals("/")) {
            System.out.println("Введен некорректный путь до файла.");
            return;
        }
        /**Если условие выше не сработало, то создаем массив строк и в массив заносим значения
         * из аргумента согласно логике метода getPathAndFileName  */
        String[] result = this.getPathAndFileName(arg);
        System.out.println("путь: " + result[0]);
        System.out.println("файл: " + result[1]);
    }

    public static void main(String[] args) {
        Task2 a = new Task2();
        a.print(args[0]);
    }
}
