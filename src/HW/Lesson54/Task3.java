package HW.Lesson54;
/**Через аргумент командной строки передается строка.
 Используя StringBuilder, напишите программу,
 которая в переданной строке заменяет все нули на единицы и наоборот.
 Остальные символы не должны изменится.
 Выведите результирующую строку.

 Пример аргумента: 01a10vt0101c
 Вывод: 10a01vt1010c
 Проверку на наличие и корректность аргумента делать не надо.*/
public class Task3 {
    /**Создаем метод который на вход принимает строковое значение arg */
    public static void print(String arg) {
        /**Создаем объект класса StringBuilder*/
        StringBuilder sb = new StringBuilder(arg);
        /**К объекту sb применяем метод замены символов*/
        sb.replace(0, sb.length(), sb.toString().replace("0", "temporarily")
                .replace("1", "0").replace("temporarily", "1"));
        System.out.println(sb);
    }

    public static void main(String[] args) {
        print(args[0]);
    }
}
