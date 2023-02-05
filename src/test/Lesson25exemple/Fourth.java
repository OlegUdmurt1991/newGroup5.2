package test.Lesson25exemple;

import java.time.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.GregorianCalendar;

public class Fourth {
    public static void main(String[] args) {
        Date nowDate = new Date();
        Date nowDate2 = new Date();
        System.out.println((nowDate.getSeconds() - nowDate2.getSeconds()) / 1000 + " - ms");

        LocalDateTime dateLocal = LocalDateTime.now();
        LocalDateTime dateLocal2 = LocalDateTime.now();
//        double dateLocal3 = Duration.between(dateLocal, dateLocal2);
//        System.out.println(dateLocal.getChronology() - dateLocal2.getChronology());
        long period = Duration.between(dateLocal, dateLocal2).toMillis(); //Находим разницу между датами с помощью класса Period и метода between

        System.out.println(period);

        GregorianCalendar nowGreg = new GregorianCalendar();
        GregorianCalendar nowGreg2 = new GregorianCalendar();
//Сравниваем первую и вторую дату и приводим их к миллисекундам
        double nowGreg3 = Duration.between(nowGreg.toZonedDateTime(), nowGreg2.toZonedDateTime()).toMillis();
        System.out.println(nowGreg3 + " - msl ");
    }
}
