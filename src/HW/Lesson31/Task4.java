package HW.Lesson31;

/*Напишите программу, которая вычисляет и выводит сумму,
которую вы получите через t лет при размещении суммы P на счете под ежегодный процент r.
Это расчитывается по формуле: P*e^(r*t).
Для вычисления экспоненты воспользуйтесь функцией стандартной библиотеки Math.exp().
Значение суммы P, процент r и кол-во лет t необходимо получать через аргументы командной строки.
Проверку на кол-во введенных аргументов делать не надо.*/
public class Task4 {
    public static void main(String[] args) {
        double P = Double.parseDouble(args[0]);
        double r = Double.parseDouble(args[1]);
        double t = Double.parseDouble(args[2]);
        System.out.println("Дано: P = " + P + ", r = " + r + ", t = " + t + '\n' + P * Math.exp(r * t));
    }
}