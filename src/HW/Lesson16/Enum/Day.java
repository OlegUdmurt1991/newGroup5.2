package HW.Lesson16.Enum;


public class Day {


    String firstDayOfWeek = DaysOfWeek.MONDAY.getNameDayOfWeek();
    String secondDayOfWeek = DaysOfWeek.TUESDAY.getNameDayOfWeek();
    String thirdDayOfWeek = DaysOfWeek.WEDNESDAY.getNameDayOfWeek();
    String fourthDayOfWeek = DaysOfWeek.THURSDAY.getNameDayOfWeek();
    String fiveDayOfWeek = DaysOfWeek.FRIDAY.getNameDayOfWeek();
    String sixthDayOfWeek = DaysOfWeek.SATURDAY.getNameDayOfWeek();
    String sevenDayOfWeek = DaysOfWeek.SUNDAY.getNameDayOfWeek();
    String[] months = new String[]
            {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
    String[] dayWeek = new String[]
            {firstDayOfWeek, secondDayOfWeek, thirdDayOfWeek, fourthDayOfWeek, fiveDayOfWeek, sixthDayOfWeek, sevenDayOfWeek};
    int dayNew;

    public Day(int numFirstMondayInWeek, int dayOfWeek) {


        int dayOfYear = (numFirstMondayInWeek-1) * 7 + 3; // Порядковый номер понедельника в году. Для 2022 года считаем первую неделю с 03.01.2022

        for (int k = 0; k <=6; k++) {
            if (dayOfYear <= 31) {
                System.out.println(dayWeek[dayOfWeek++] + " - " + dayOfYear + " число" + "(месяц: " + months[0] + ")");
                dayOfYear++;

            }
            if (dayOfYear > 31 && dayOfYear <= (31 + 28)) {
                dayNew = dayOfYear - 31;
                System.out.println(dayWeek[dayOfWeek++] + " - " + dayNew + " число" + "(месяц: " + months[1] + ")");
                dayOfYear++;
            }
            if (dayOfYear > 59 && dayOfYear <= (59 + 31)) {
                dayNew = dayOfYear - 59;
                System.out.println(dayWeek[dayOfWeek++] + " - " + dayNew + " число" + "(месяц: " + months[2] + ")");
                dayOfYear++;
            }
            if (dayOfYear > 90 && dayOfYear <= (90 + 30)) {
                dayNew = dayOfYear - 90;
                System.out.println(dayWeek[dayOfWeek++] + " - " + dayNew + " число" + "(месяц: " + months[3] + ")");
                dayOfYear++;
            }
            if (dayOfYear > 120 && dayOfYear <= (120 + 31)) {
                dayNew = dayOfYear - 120;
                System.out.println(dayWeek[dayOfWeek++] + " - " + dayNew + " число" + "(месяц: " + months[4] + ")");
                dayOfYear++;
            }
            if (dayOfYear > 151 && dayOfYear <= (151 + 30)) {
                dayNew = dayOfYear - 151;
                System.out.println(dayWeek[dayOfWeek++] + " - " + dayNew + " число" + "(месяц: " + months[5] + ")");
                dayOfYear++;
            }
            if (dayOfYear > 181 && dayOfYear <= (181 + 31)) {
                dayNew = dayOfYear - 181;
                System.out.println(dayWeek[dayOfWeek++] + " - " + dayNew + " число" + "(месяц: " + months[6] + ")");
                dayOfYear++;
            }
            if (dayOfYear > 212 && dayOfYear <= (212 + 31)) {
                dayNew = dayOfYear - 212;
                System.out.println(dayWeek[dayOfWeek++] + " - " + dayNew + " число" + "(месяц: " + months[7] + ")");
                dayOfYear++;
            }
            if (dayOfYear > 243 && dayOfYear <= (243 + 30)) {
                dayNew = dayOfYear - 243;
                System.out.println(dayWeek[dayOfWeek++] + " - " + dayNew + " число" + "(месяц: " + months[8] + ")");
                dayOfYear++;
            }
            if (dayOfYear > 273 && dayOfYear <= (273 + 31)) {
                dayNew = dayOfYear - 273;
                System.out.println(dayWeek[dayOfWeek++] + " - " + dayNew + " число" + "(месяц: " + months[9] + ")");
                dayOfYear++;
            }
            if (dayOfYear > 304 && dayOfYear <= (304 + 30)) {
                dayNew = dayOfYear - 304;
                System.out.println(dayWeek[dayOfWeek++] + " - " + dayNew + " число" + "(месяц: " + months[10] + ")");
                dayOfYear++;
            }
            if (dayOfYear > 334 && dayOfYear <= (334 + 31)) {
                dayNew = dayOfYear - 334;
                System.out.println(dayWeek[++dayOfWeek] + " - " + dayNew + " число" + "(месяц: " + months[11] + ")");
                dayOfYear++;
            }
        }


    }

}