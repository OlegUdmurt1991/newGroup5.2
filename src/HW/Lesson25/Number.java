package HW.Lesson25;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.GregorianCalendar;

/*1: Необходимо выполнить 4 задания
1) Создайте объект даты вашего рождения
и выведите на экран 5ю различными форматами вывода.
Повторите, используя каждый класс для работы с датой:
Date, LocalDate, LocalDateTime, ZonedDateTime, GregorianCalendar

2) Для каждого класса из задания 1 создайте объект текущего времени
и сравните с датой вашего рождения соответствующего типа.
Выведите разницу на экран.

3) Посчитайте общее количество времени,
за которое выполняется программа из 1го задания
и выведите результат на экран.
Используйте класс по желанию.
Пример вывода:
Alltime - ms

4) Аналогично 3му заданию, время выполнения в миллисекундах
(создание объекта + вывод на экран),
но для каждого класса из первого задания по отдельности.
Пример вывода:
Date - ms
LocalDate - ms
LocalDateTime - ms
(для 5 классов из 1го задания)*/
public class Number {
    public static void main(String[] args) {
// Класс Data
        LocalDateTime startDate = LocalDateTime.now();//Входная точка для для 3 задания
        Date dayMyBirthdayDate = new Date(91, 7, 8, 6, 15, 49); // Инициализируем объект Date с заданной датой
        System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(dayMyBirthdayDate)); // Зад-е 1
        System.out.println(new SimpleDateFormat("yy-MM-dd-EE").format(dayMyBirthdayDate)); // Зад-е 1
        System.out.println(new SimpleDateFormat("yy-MM-dd-EE-HH").format(dayMyBirthdayDate)); // Зад-е 1
        System.out.println(new SimpleDateFormat("yy-MM-dd-EE-HH-mm-ss").format(dayMyBirthdayDate)); // Зад-е 1
        System.out.println(new SimpleDateFormat().format(dayMyBirthdayDate)); // Зад-е 1
        LocalDateTime endDate = LocalDateTime.now();//Выходная точка для для 3 задания
        Duration diffStartDateEndDate = Duration.between(startDate, endDate); // Зад-е 3
        Date nowDate = new Date();
        Duration dayMyBirthdayDiffNowDate = Duration.ofMillis(nowDate.getTime() - dayMyBirthdayDate.getTime());//Зад-е 2
        System.out.println("Разница между текущей датой и ДР в днях по классу Date: " + dayMyBirthdayDiffNowDate); //Зад-е 2
        System.out.println("Время, за которое выполняется программа из 1го задания по классу Date: "
                + diffStartDateEndDate + '\n' + '\n'); //Зад-е 3 и4

// Класс LocalDate
        LocalDateTime startLocalDate = LocalDateTime.now(); //Входная точка для для 4 задания
        LocalDate dayMyBirthdayLocalDate = LocalDate.of(1991, 8, 8);// Инициализируем объект с заданной датой
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(dayMyBirthdayLocalDate));// Зад-е 1
        System.out.println(DateTimeFormatter.ISO_DATE.format(dayMyBirthdayLocalDate)); // Зад-е 1
        System.out.println(DateTimeFormatter.BASIC_ISO_DATE.format(dayMyBirthdayLocalDate)); // Зад-е 1
        System.out.println(DateTimeFormatter.ISO_LOCAL_DATE.format(dayMyBirthdayLocalDate)); // Зад-е 1
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(dayMyBirthdayLocalDate)); // Зад-е 1
        LocalDateTime endLocalDate = LocalDateTime.now(); //Выходная точка для для 4 задания
        Duration difStartLDandLD = Duration.between(startLocalDate, endLocalDate);// Зад-е 4
        LocalDate nowLocalDate = LocalDate.now();
        long difMyBirthdayLDNowLocalDate = ChronoUnit.DAYS.between(dayMyBirthdayLocalDate, nowLocalDate); //Зад-е 2
        System.out.println("Разница между текущей датой и ДР в днях по классу LocalDate:  " + difMyBirthdayLDNowLocalDate);
        System.out.println("Время, за которое выполняется программа из 1го задания по классу LocalDate: " +
                difStartLDandLD + '\n' + '\n'); // Зад-е 4

//Класс LocalDateTime
        LocalDateTime startLocalDateTime = LocalDateTime.now(); //Входная точка для для 4 задания
        LocalDateTime dayMyBirthdayLDT = LocalDateTime.of(1991, 8, 8, 16, 8, 34);// Инициализируем объект с заданной датой
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(dayMyBirthdayLDT));// Зад-е 1
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(dayMyBirthdayLDT));// Зад-е 1
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(dayMyBirthdayLDT));// Зад-е 1
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(dayMyBirthdayLDT));// Зад-е 1
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(dayMyBirthdayLDT));// Зад-е 1
        System.out.println(DateTimeFormatter.BASIC_ISO_DATE.format(dayMyBirthdayLDT));// Зад-е 1
        LocalDateTime endLocalDateTime = LocalDateTime.now(); //Выходная точка для для 4 задания
        Duration difStartLDTEndLDT = Duration.between(startLocalDateTime, endLocalDateTime);// Зад-е 4
        LocalDateTime nowLocalDateTime = LocalDateTime.now();
        Duration difMyBirthdayLDTNowLDT = Duration.between(nowLocalDateTime, dayMyBirthdayLDT); //Зад-е 2
        System.out.println("Разница между текущей датой и ДР по классу LocalDateTime:  " + difMyBirthdayLDTNowLDT);
        System.out.println("Время, за которое выполняется программа из 1го задания по классу LocalDateTime: " +
                difStartLDTEndLDT + '\n' + '\n');// Зад-е 4

//Класс ZonedDateTime
        LocalDateTime startZonedDateTime = LocalDateTime.now(); //Входная точка для для 4 задания
        ZonedDateTime dayMyBirthdayZDT = ZonedDateTime.parse("1991-08-08T15:45:00Z[Europe/Moscow]");// Инициализируем объект с заданной датой
        System.out.println(DateTimeFormatter.BASIC_ISO_DATE.format(dayMyBirthdayZDT));// Зад-е 1
        System.out.println(DateTimeFormatter.ISO_INSTANT.format(dayMyBirthdayZDT));// Зад-е 1
        System.out.println(DateTimeFormatter.ISO_DATE.format(dayMyBirthdayZDT));// Зад-е 1
        System.out.println(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(dayMyBirthdayZDT));// Зад-е 1
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(dayMyBirthdayZDT));// Зад-е 1
        LocalDateTime endZonedDateTime = LocalDateTime.now(); //Выходная точка для для 4 задания
        Duration difStartZDTEndZDT = Duration.between(startZonedDateTime, endZonedDateTime);// Зад-е 4
        ZonedDateTime nowZDT = ZonedDateTime.now();
        Duration difMyBirthdayZDTNowZDT = Duration.between(nowZDT, dayMyBirthdayZDT);//Зад-е 2
        System.out.println("Разница между текущей датой и ДР по классу ZonedDateTime:  " + difMyBirthdayZDTNowZDT);
        System.out.println("Время, за которое выполняется программа из 1го задания по классу ZonedDateTime: " +
                difStartZDTEndZDT + '\n' + '\n');// Зад-е 4

//Класс GregorianCalendar
        LocalDateTime startGregCal = LocalDateTime.now(); //Входная точка для для 4 задания
        GregorianCalendar dayMyBirthdayGregCal = new GregorianCalendar(1991, 7, 8, 04, 15, 45);
        System.out.println(dayMyBirthdayGregCal.getTime());// Зад-е 1
        System.out.println(dayMyBirthdayGregCal.toZonedDateTime());// Зад-е 1
        System.out.println(DateTimeFormatter.ISO_DATE.format(dayMyBirthdayGregCal.toZonedDateTime()));// Зад-е 1
        System.out.println(DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(dayMyBirthdayGregCal.toZonedDateTime()));// Зад-е 1
        System.out.println(DateTimeFormatter.ISO_INSTANT.format(dayMyBirthdayGregCal.toZonedDateTime()));// Зад-е 1
        LocalDateTime endGregCal = LocalDateTime.now(); //Выходная точка для для 4 задания
        Duration difStartGregCalEndGregCal = Duration.between(startGregCal, endGregCal);// Зад-е 4
        GregorianCalendar nowGregCal = new GregorianCalendar();
        Duration difMyBirthdayNowGrecCal = Duration.between(nowGregCal.toZonedDateTime(), dayMyBirthdayGregCal.toZonedDateTime());//Зад-е 2
        System.out.println("Разница между текущей датой и ДР по классу GregorianCalendar  " + difMyBirthdayNowGrecCal);
        System.out.println("Время, за которое выполняется программа из 1го задания по классу GregorianCalendar: " +
                difStartGregCalEndGregCal + '\n' + '\n');// Зад-е 4
    }
}