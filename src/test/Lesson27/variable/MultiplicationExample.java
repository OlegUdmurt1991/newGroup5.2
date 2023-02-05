package test.Lesson27.variable;

public class MultiplicationExample {
    public void multiplicationTest() {
        int firstVariable = 1, secondVariable = firstVariable, thirdVariable= secondVariable = 8;
        multiplicate(firstVariable,secondVariable);
    }

    private int multiplicate(final int firstOperand, final int secondOperand) { // ментод который принимает на вход две переменные типа int
//        firstOperand = 10; //не объявляется из за модификатора final
//        secondOperand = 15 ; //не объявляется из за модификатора final
        return firstOperand * secondOperand;
    }
}
