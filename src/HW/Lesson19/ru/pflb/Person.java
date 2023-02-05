package HW.Lesson19.ru.pflb;

public class Person {
    public int age; //возраст в годах
    public String name; //строка с ФИО
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() { // возвращает строку с информацией о водителе
        return (name + age);
    }
}