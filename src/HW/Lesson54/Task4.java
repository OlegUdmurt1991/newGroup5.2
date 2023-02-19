package HW.Lesson54;
/**Через аргумент командной строки передается строка.
 Используя StringBuilder, напишите программу, которая в переданной строке удаляет из неё всё, кроме цифр.
 Выведите результирующую строку.

 1)
 Пример аргумента: 01a10vt0101c
 Вывод: 01100101

 2)
 Пример аргумента: avtc
 Вывод:

 Проверку на наличие и корректность аргумента делать не надо.*/
public class Task4 {
    /**Создаем метод который на вход принимает строковое значение arg */
    public static void print(String arg) {
        /**Создаем объект класса StringBuilder*/
        StringBuilder sb = new StringBuilder(arg);
        /**В цикле пока i меньше длины строки, i увеличивается*/
        for (int i = 0; i < sb.length(); i++) {
            /**Character.isDigit() возвращает true, если переданный символ является цифрой.*/
            if (!Character.isDigit(sb.charAt(i))) {
                /**Метод deleteCharAt() удаляет символ в заданной позиции в строке*/
                sb.deleteCharAt(i);
                i--;
            }
        }
        System.out.println("Вывод: " + sb);
    }

    public static void main(String[] args) {
        print(args[0]);
    }
}
