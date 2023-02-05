package HW.Lesson16.Enum;

public enum DaysOfWeek {

    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресенье");

    private String nameDayOfWeek;

    DaysOfWeek(String nameDayOfWeek){
        this.nameDayOfWeek = nameDayOfWeek;

    }

    public String getNameDayOfWeek() {
        return nameDayOfWeek;
    }

    public void setNameDayOfWeek(String nameDayOfWeek) {
        this.nameDayOfWeek = nameDayOfWeek;
    }
}
