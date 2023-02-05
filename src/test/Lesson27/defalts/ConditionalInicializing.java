package test.Lesson27.defalts;

public class ConditionalInicializing {
    public static void main(String[] args) {
        int laterInitialized;
        laterInitialized = 10;
        System.out.println(laterInitialized); //здесь работает так как логика линейная


        int conditionalInitialized;
        boolean condition = true;
        if (condition) //если убрать if то норм сработает печать
            conditionalInitialized = 5;
        else conditionalInitialized = 7; //или если добавить else, то тоже сработает вывод на экран
        System.out.println(conditionalInitialized);//Здесьь не работает так как логика НЕ ЛИНЕЙНАЯ

    }
}
