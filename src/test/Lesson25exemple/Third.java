package test.Lesson25exemple;

import java.time.Duration;
import java.util.GregorianCalendar;

/*3) Посчитайте общее количество времени,
за которое выполняется программа из 1го задания
и выведите результат на экран.
Используйте класс по желанию.
Пример вывода:
Alltime - ms*/
public class Third {
    public static void main(String[] args) {
        GregorianCalendar now = new GregorianCalendar();
        GregorianCalendar now2 = new GregorianCalendar();
//Сравниваем первую и вторую дату и приводим их к миллисекундам
        double now3 = Duration.between(now.toZonedDateTime(), now2.toZonedDateTime()).toMillis();
        System.out.println(now3 + " - ms ");
    }
}