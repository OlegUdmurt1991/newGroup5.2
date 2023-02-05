package test.Lesson25exemple;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.GregorianCalendar;
/*1) Создайте объект даты вашего рождения
и выведите на экран 5ю различными форматами вывода.
Повторите, используя каждый класс для работы с датой:
Date, LocalDate, LocalDateTime, ZonedDateTime, GregorianCalendar*/
public class DateMyBirthday {

    public static void main(String[] args) {
        Date customDateTime = new Date(91, 7, 8); // Инициализируем объект Date с заданной датой
        System.out.println(customDateTime);

        //Создает объект проинициализированный заданной датой
        LocalDate date2 = LocalDate.of(1991, 7, 8);
        System.out.println(date2);

        //получаем объект класса LocalDateTime с заданными параметрами.
        LocalDateTime dateTime = LocalDateTime.of(1991, 8, 8, 16, 8, 34);
        System.out.println(dateTime);

        //Получаем дату, время и временную зону из строки
        ZonedDateTime zonedDT = ZonedDateTime.parse("1991-08-08T15:45:00Z[Europe/Moscow]");
        System.out.println(zonedDT);

        //Инициализируетобъект Calendar заданной датой
        GregorianCalendar calendar = new GregorianCalendar(1991, 7, 8, 04, 15, 45);
        System.out.println(calendar.getTime());

    }
}


//        System.out.println(newSimpleDateFormat("HH-mm dd-MM-yyyy").format(newDate()));


//    Date date = new Date("Aug 08 15:00:00 1991 "); // Создаем объект date из строки
//        System.out.println(date);