package test.Lesson15;

public class Boiler {
    public static final int WATER_BOILING_POINT = 100;

    public void boilWater () {
        System.out.println("Кипячу воду! ");
    }
}

class Main1 {
    public static void main(String[] args) {
        System.out.println("Чайник нагревает воду до " +
         Boiler.WATER_BOILING_POINT + " Градусов. "); //Обратитлись к константе по имени класса
        // не создавая объект Boiler
    }
}