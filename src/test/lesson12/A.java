package test.lesson12;

public class A {
    //Конструктор класса
    public A() {
        System.out.println("A class. Constructor");
    }
//Три обычных блока инициализации
{
    System.out.println("A class. No static block 1");
}
    {
        System.out.println("A class. No static block 2");
    }
    {
        System.out.println("A class. No static block 3");
    }
    // Статический блок инициализации
    static {
        System.out.println("A class. Static block 1");
    }
    static {
        System.out.println("A class. Static block 2");
    }
    //Статическая переменная
    public static String a1 = printStaticVariable("a1");
    //Статический блок инициализации
    static {
        System.out.println("A class. No static block 3");
    }
    // Обычная переменная
    public String a11 = printNonStaticVariable("a11");
    //Статическая переменная
    public static String a2 = printStaticVariable("a2");
    //Обычная переменная
    public String a33 = printNonStaticVariable("a33");
    //Статическая переменная
    public static String a3 = printStaticVariable("a3");
    //Обычная переменная
    public String a22 = printNonStaticVariable("a22");

    //Два метода для вывода переменных на экран
    private static String printStaticVariable (String a) {
        System.out.println("A class. Static perem " + a);
        return a;
    }

    private String printNonStaticVariable (String a) {
        System.out.println("A class. No static perem " + a);
        return a;
    }
}
