package HW.Lesson54;

public class Task5 {
    static boolean isInteger(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            /***/
            if (Character.isDigit(sb.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    public static void print(String[] arg){
        if (arg.length == 1) {
            String str = arg[0];
            if (isInteger(str)) {
                System.out.println("Строка является целым числом");
            } else {
                System.out.println("Строка не является целым числом");
            }
        } else {
            System.out.println("Неверное количество аргументов");
        }

    }

    public static void main(String[] args) {
        isInteger(args[0]);
    }
}
