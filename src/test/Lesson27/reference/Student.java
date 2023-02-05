package test.Lesson27.reference;

public class Student {
    String name;

    public static void main(String[] args) {
        Student peter = new Student();
        Student maxim = new Student();

        peter.name = "Peter";
        System.out.println(peter.name);
        System.out.println(maxim.name);

        maxim.name = "Maxim";
        System.out.println(maxim.name);
    }
}
