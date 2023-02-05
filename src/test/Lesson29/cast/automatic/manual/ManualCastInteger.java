package test.Lesson29.cast.automatic.manual;

public class ManualCastInteger {
    public static void main(String[] args) {
        long longVariable = 123456789456L;
        int intVariable = 12345;

        intVariable = (int) longVariable;
        System.out.println(intVariable);
        System.out.println(longVariable);

        System.out.printf("%x\n", longVariable); //Переводим в 16 - ти ричную систему измерения
        System.out.printf("%x\n", intVariable); //Переводим в 16 - ти ричную систему измерения

    }
}
