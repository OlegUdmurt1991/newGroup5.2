package test.Lesson13;

class Data {
    int x = 10;
}

public class TestClass {
    public static void main(String[] args) {
        final Data d = new Data();
        // d = new Data(); // не будет компилироваться потомучто d final
        d.x = 20; // Это сработает потому что мы здесь не меняем d
    }

}