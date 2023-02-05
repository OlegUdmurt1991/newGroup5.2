package test.less10;


import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Numbers {
    BigInteger numberOne = new BigInteger("926196315615426105242685140165242965146681401659050865180515") ;
    BigInteger numberTwo = new BigInteger("296051196542926035965249603129863541805416505911650495450849") ;
    BigDecimal numberThree = new BigDecimal("290526845096541846550165841014514.056452656205684506560510560111165") ;
    BigDecimal numberFour = new BigDecimal("240652529605296052906524065629.259085429603526566565262365506556") ;

    public void plus() {
        BigInteger resultValuePlus = numberOne.add(numberTwo);
        System.out.println("Сложение: " + resultValuePlus);
    }
    public void minus() {
        BigInteger resultValueMinus = numberOne.subtract(numberTwo);
        System.out.println("Вычитание: " + resultValueMinus);
    }
    public void multiplication() {
        BigDecimal resultValueMultiplication =numberFour.multiply(numberThree);
        System.out.println("Умножение: " + resultValueMultiplication);
    }
public void division () {
        BigDecimal resultValueDivision = numberThree.divide(numberFour, 60, RoundingMode.DOWN);
    System.out.println("Деление: " + resultValueDivision);
}

}


