package HW.Lesson16.Enum;



public class Week {

    Day day1;
    Week(int weekNum) {
        int numFirstMondayInWeek = weekNum;
        day1 = new Day(numFirstMondayInWeek, 0);

    }
}
