package test.Lesson13.TestClass2;

public class TestClass2 {
    static final boolean DEBUG = true;  // Инициализация во время объявления
    static final int value; // Здесь не инициализируются значения
    static {
        value = 10 ;
    }

    public static void main(String[] args) {
        System.out.println(value);

    }
}

//
//// ещЁ сразу после 3 строчки
//final int value2   // Нет инициализации
//{    //Начало блока инициализации
//    value2 = 10 ;  //Инициализация в инициализаторе экземпляра
//        }  //Конец блока инициализации