package test.Lesson13.metods;

public class DoubleBad extends Bed{
// Невозможно переопределить getNumberOfLegs, так как final в классе Bed

//    @Override   // Это переопредиление метода, но только если в родительском классе нет слова final в методе
//    public int getNumberOfLegs() {
//        return 15;
//    }
}
