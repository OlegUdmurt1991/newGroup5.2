package HW.Lesson4dot4.First;

public class Square implements Function{
    @Override
    public int evaluate(int a) {
        a = a * a;
        return a;
    }
}
