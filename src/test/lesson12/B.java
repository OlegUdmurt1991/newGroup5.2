package test.lesson12;

public class B extends A {
    // Конструктор класса
    public B(int b) {
        this.b1 = b;
    }
    //Конструктор класса
    public B() {
        System.out.println("B class. Constructor");
    }
    //Обычная переменная
    private int b1 = printNonStaticVariableB (20) ;
    //Статический блок инициализации
    static {
        System.out.println("B class. Static block 1");
    }
    // Метод для вывода переменных на экран
    private int printNonStaticVariableB (int x) {
        System.out.println("B class. No static perem " + x);
        return x;
    }
}
