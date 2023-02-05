package HW.Lesson19;

public abstract class Animal {
    String name; //Кличка животного
    String food; //название типа пищи
    int foodCounter; //Количество запасов пищи
    String location; //название страны обитания
    HealthState health; //Состояние здоровья
    int counter; /*Количество особей. Все животные имеют внутреннюю связь с сородичами,
    в переменной содержится общее кол-во осыбей данного вида*/

    public void HealthState() {
    }

    public abstract void makeSound(); // выводит текст, как звучит животное

    public abstract void eat();//выводит текст, что животное ест, уменьшает кол-во еды у животного, также выводит сколько запасов осталось

    public abstract void sleep();

    @Override
    public String toString() {
        return "<Кличка> " + name + '\n'
                + "Страна обитания: " + location + '\n'
                + "Состояние здоровья: " + health + '\n' + "Сколько особей:" + counter;
    }

    Animal(String name) {
        this.name = name;
    }
}