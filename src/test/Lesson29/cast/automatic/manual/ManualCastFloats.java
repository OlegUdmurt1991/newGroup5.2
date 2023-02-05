package test.Lesson29.cast.automatic.manual;

public class ManualCastFloats {
    public static void main(String[] args) {
        double tooBigDouble = 9999999999999992.128;
        double tooMinDouble = -9999999999999992.128;
        double doubleWithFloat = 123456.789;

        int intVariable = (int) doubleWithFloat;
        System.out.println(intVariable);

        intVariable = (int) tooBigDouble;
        System.out.println(intVariable);//java порезала число до граничного значения
        intVariable = (int) tooMinDouble;
        System.out.println(intVariable);//java порезала число до граничного значения



    }
}
