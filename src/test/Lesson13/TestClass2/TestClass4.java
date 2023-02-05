package test.Lesson13.TestClass2;

public class TestClass4 {

    public static void main(String[] args) {
        final int x; // Нигде не инициализирую X
        final int y;
        System.out.println("Hello");
        y = 10 ;   // Инициализация y непосредственно перед обращением к нему
        System.out.println(y);
    }
}
