package HW.Lesson47.Task6;
/*Реализуйте класс Timer, который содержит:
- целочисленное поле seconds - общее число секунд, устанавливается в конструкторе
- статический метод void waitSecond() - метод реализует паузу
одной секунды. Реализовать с помощью цикла.
- метод printTime вывода оставшегося времени в минутах и секундах.
- объектный метод start() - запускает обратный отсчет
и каждую секунды выводит оставшееся количество секунд.



Напишите программу-таймер обратного отсчета в минутах и секундах,

используя созданные класс Timer.
Через аргументы командной строки передается число секунд.


Проверку на наличие аргумента делать не надо.
Нужно проверить, что введенное число больше или равно нуля.
В противном случае выведите сообщение об ошибке
и завершите программу.


Например, для 61 секунды формат вывода:
01:01
01:00
00:59
...
00:01
00:00*/

public class Timer {
    private int seconds;

    public Timer(int seconds) {
        this.seconds = seconds;
    }

    /*метод реализует паузу одной секунды*/
    public static void waitSecond() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
    }

    /*метод printTime вывода оставшегося времени в минутах и секундах.*/
    public void printTime() {
        int minutes = seconds / 60;
        int newSeconds = seconds % 60;
        System.out.printf("%02d:%02d\n", minutes, newSeconds);
    }

    public void start() {

        for (; seconds > 0; seconds--) {
            printTime();
            waitSecond();
        }
        if (seconds == 0) {
            printTime();
        }
    }

    public static void main(String[] args) {
        int seconds = Integer.parseInt(args[0]);
        Timer timer = new Timer(seconds);
        timer.start();

    }
}