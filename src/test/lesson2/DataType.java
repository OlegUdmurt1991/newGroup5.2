package test.lesson2;

import test.lesson1.package1.Test1;

public class DataType {
    public static void main(String[] args) {
        int num =123;

        System.out.println(num);
        Test1 test =new Test1();  // Создание объекта, создали экземплдяр класса
        System.out.println(test);

//        boolean result = true;
//        char capital = 'C' ;
//        byte b = 100;
//        short s = 10_000;
//        int i = 1_00_000 ;
//        long l = 121L;
//
//        float f1 = 123.4f;
//        float f2 = 123.4F;
//        double d1 = 123.4d;
//        double d2 = 123.4D;

//        int i1 =123; // Приметивы не могут использовать иметоды
//        Integer i2 = new Integer(123) ; //// Ссылочные типы данных могут использовать иметоды (Integer является оберткой приметива int )
//        i2.toString();

        Integer i = new Integer(123); // Создание класса обертки
        Double d = new Double(123.4F);
        Boolean b = new Boolean(false);

    }
}
