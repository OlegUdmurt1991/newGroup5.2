package test.Lesson27.defalts;

public class ClassDefaults {
    static int staticVariable;
    int objectVariable;

    public static void main(String[] args) {
        int localVariable;
        System.out.println(staticVariable + " " + new ClassDefaults().objectVariable);
//        System.out.println(localVariable); //Здесь ошибка, таккак localVariable не проинициализирована(не присвоено значение)

        boolean a = true;
        a = !a;
        a = a && !a;
        a = a ^ !a;
        System.out.println(a);



    }
}
