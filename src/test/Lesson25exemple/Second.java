package test.Lesson25exemple;

import java.time.*;
import java.util.Date;
import java.util.GregorianCalendar;

/*2) Для каждого класса из задания 1 создайте объект текущего времени
        и сравните с датой вашего рождения соответствующего типа.
        Выведите разницу на экран*/
public class Second {
    public static void main(String[] args) {
        Date now = new Date(); // Инициализируем объект Date с текущей датой
        Date customDateTime = new Date(91, 7, 8);// Инициализируем объект Date с заданной датой
        System.out.println(now.after(customDateTime));
        /*Вычислил все по отдельности, не понял как сделать это в одну строчку*/
        System.out.print(now.getYear() - customDateTime.getYear() + " Года ");
        System.out.print(now.getMonth() - customDateTime.getMonth() + " Месяцев ");//Не пойму как сделать что бы месяца
        // корректно считались, или (-7) это норм результат?
        System.out.println(now.getDate() - customDateTime.getDate() + " Дней   Разница в формате Date");

        LocalDate date = LocalDate.now(); //Создает объект проинициализированный текущей датой
        LocalDate date2 = LocalDate.of(1991, 8, 8);//Создает объект проинициализированный заданной датой
        System.out.println(date.equals(date2)); //Сравниваем даты
        date = date.minusYears(date2.getYear());
        date = date.minusDays(date2.getDayOfYear()); // если че duration
        System.out.println(date + "Разница в формате LocalDate");  //Выходит 0031-06-09, не понятно почему разница в днях 09 ? ниже есть другой вариант через Period
//Period period = Period.between(date2, date); //Находим разницу между датами с помощью класса Period и метода between
//System.out.println(period.getYears() + " года " + period.getMonths() + " месяцев " + period.getDays() + " дней ");

        LocalDateTime nowLocal = LocalDateTime.now();
//получаем объект класса LocalDateTime с заданными параметрами.
        LocalDateTime dateTime = LocalDateTime.of(1991, 8, 8, 16, 8, 34);
        nowLocal = nowLocal.minusYears(dateTime.getYear());
        nowLocal = nowLocal.minusDays(dateTime.getDayOfYear());
        System.out.println(nowLocal + " Разница в формате LocalDateTime");

//Создает объект с текущей датой временем и локальной временной зоной
        ZonedDateTime nowZonedDT = ZonedDateTime.now(); //текущая дата
        ZonedDateTime zonedDT = ZonedDateTime.parse("1991-08-08T15:45:00Z[Europe/Moscow]");
        nowZonedDT = nowZonedDT.minusYears((zonedDT.getYear()));
        nowZonedDT = nowZonedDT.minusDays(zonedDT.getDayOfYear());
        System.out.println(nowZonedDT + " Дата в формате ZonedDateTime ");

        GregorianCalendar nowCalendar = new GregorianCalendar();
        GregorianCalendar calendar = new GregorianCalendar(1991, 7, 8, 04, 15, 45);
        Duration GregCalendar = Duration.between(nowCalendar.toZonedDateTime(), calendar.toZonedDateTime());
        System.out.println(GregCalendar.toString());
    }
}


//        System.out.println(date.getYear() - date2.getYear());
//        System.out.println(date.getMonth() + date2.getMonth());
//        System.out.println(date.getDayOfMonth()-date2.getDayOfMonth() + " Дней ");
//        SimpleDateFormat format = new SimpleDateFormat("yy-MM-dd");
//        String reFormat = format.format(now);
//        System.out.println(format.format(now) - customDateTime.getTime());

//        long diffInMillies = Math.abs(now.getTime() - customDateTime.getTime());
//        System.out.println(diffInMillies);