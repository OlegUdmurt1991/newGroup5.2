package HW.Lesson54;

/**
 * В классе объявлена статическая переменная строкого типа со значением (кавычки не включены):
 * «Циклом называется многократное выполнение одних и тех же действий.»
 * <p>
 * Используя только методы класса String (без циклов, условий), напишите программу, которая печатает количество букв (без пробелов и точки) в переменной до определенного символа (не включая его).
 * Значение символа передается через аргумент командной строки.
 * <p>
 * Пример:
 * Через аргументы передается "Ц", Вывод: 0.
 * Через аргументы передается "а", Вывод: 7.
 * Через аргументы передается ".", Вывод: 57.
 */
public class Task1 {
    /**
     * статическая переменная строкого типа
     */
    static String str = "Циклом называется, многократное выполнение одних и тех же действий.";
    /**
     * Создаем статическая переменную которая ссылается на аргумент из main
     */
    public static String arg;
    /**
     * Меняем регистр если в аргументе большая буква
     */
    String argLowerCase = arg.toLowerCase();

    /**
     * Метод возвращающий строку без пробелов и точек, а так же обрезающий строку до введенного аргумента
     */
    public String print3() {
        return (str.replaceAll("\\.|\\s", "").substring(0, str.indexOf(argLowerCase)));
    }

    public static void main(String[] args) {
        arg = args[0];//Значение символа передаваемое через аргумент
        Task1 a = new Task1();//Создается ссылка но объект класса Task1
        System.out.println("Через аргументы передается " + arg + " , " + "Вывод: " + a.print3().length());
    }
}
