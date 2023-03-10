package HW.Lesson43.Task3;

public class Third {
    /*Через аргументы командной строки передается число - года (целое, положительное, не превышает 30000).

Напишите программу вычисляющую является ли данный год високосным.

Напомним, что год является високосным, если его номер кратен 4, но не кратен 100, а также если он кратен 400.

Требуется вывести слово YES, если год является високосным и NO - в противном случае.



Проверку на наличие аргументов делать не надо.

Надо проверить, что переданное число находится в заданном диапазоне.

В противном случае нужно вывести пользователю сообщение об ошибке, и завершить программу.

*/
    public static void main(String[] args) {
        int year = Integer.parseInt(args[0]); //Через аргументы командной строки передается число - года (целое, положительное, не превышает 30000)
        if (year < 0 || year > 30000) {
            System.out.println("Переданное число вне диапозона");
        } else if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("No");
        }
    }
}