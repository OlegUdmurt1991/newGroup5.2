package HW.Lesson6dot4.First;

public class Half implements Function {
    @Override
    public int evaluate(int a) {
        a = a / 2;
        return a;
    }
}
