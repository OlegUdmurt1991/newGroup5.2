package test.Lesson29.cast.automatic;

public class AutomaticCastFlots {
    public static void main(String[] args) {
        int intVariable = 59287406;
        float floatVariable = 4280652960355926052596052963065964f;
        double doubleVariable = 28051638406285206524960352460524962601549654029653926525d;

        floatVariable = intVariable;
        doubleVariable = intVariable;
        System.out.println(intVariable);
        System.out.println(floatVariable);
        System.out.println(doubleVariable);
    }


}
