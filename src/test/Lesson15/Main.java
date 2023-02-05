package test.Lesson15;

import test.Lesson15.enums.DayOfWeek;

public class Main {
    public static void main(String[] args) {
        DayOfWeek firstDay = DayOfWeek.MONDAY; // Обращение к элементу enum DayOfWeek (enum это типо класса)
        String monday = firstDay.toString(); // Пример вызова метода класса object

        //Специальные методы enum
        DayOfWeek allDays[] = DayOfWeek.values(); //Получить массив элементов(Т.е. получили все значения из enum)
        DayOfWeek dayByName = DayOfWeek.valueOf("TUESDAY"); //Получить элемент по его имени (dayByName b secondDay одинаковые для дальнейшего сравнения)
        DayOfWeek secondDay = DayOfWeek.valueOf("TUESDAY"); //Получить элемент по его имени (Создаем переменую secondDay и в нее с помощью valueOf кладем значение "TUESDAY")
        int position = dayByName.ordinal(); //Получить порядковый номер элемента (нумерация с 0)
        System.out.println(position); //Вторник это второй день недели, но вывод на консоль: 1 (так как позиция нумеруется с 0)


        //Пример сравнения элементов
        System.out.println(secondDay == dayByName); //Какой будет вывод консоли?(true) (почему труе)
        System.out.println(secondDay.equals(dayByName)); //Какой будет вывод консоли?(true)
        DayOfWeek nullVallue = null;
        System.out.println(nullVallue == dayByName); //Какой вывод будет в консоли? (false)
        System.out.println(nullVallue.equals(dayByName)); //Какой вывод будет в консоли? (NullPointerExeption)



    }
}
