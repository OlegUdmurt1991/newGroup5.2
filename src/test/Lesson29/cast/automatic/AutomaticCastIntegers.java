package test.Lesson29.cast.automatic;

public class AutomaticCastIntegers {
    public static void main(String[] args) {
        byte byteVariable = 127;
        short shortVariable = 32767;
        int intVariable = 2147483647;

//        System.out.println(byteVariable);
//        System.out.println(shortVariable);
//        System.out.println(intVariable);
///////////
//        intVariable = shortVariable;
//        System.out.println(intVariable);
//
//        shortVariable = byteVariable;
//        System.out.println(shortVariable);
//
//        intVariable = byteVariable;
//        System.out.println(intVariable);
///////////////
//        char charVariable = 10;
//        System.out.println(charVariable); // \n
//        intVariable = charVariable;
//        System.out.println(intVariable);
/////////////
//        shortVariable =charVariable; //short нельзя преобразовать в char

        long longVariable = 9265096852021682L;
        System.out.println(longVariable);
        longVariable = intVariable;
        System.out.println(longVariable);


    }

}
