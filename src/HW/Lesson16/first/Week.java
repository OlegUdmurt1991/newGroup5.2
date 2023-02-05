package HW.Lesson16.first;


public class Week {
    Day day0;

    Week(int weekNum) {
        int numFirstMondayInWeek = weekNum;
        day0 = new Day(numFirstMondayInWeek, 0);

    }
}
