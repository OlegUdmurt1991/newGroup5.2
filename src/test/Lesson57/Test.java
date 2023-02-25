package test.Lesson57;

public class Test {

   // void method(String a, int ...b) {}
    //void method(int ...a) {}
   //void method(int a, double b, boolean c, int... d) {}
  // void method(int b, int ...a) {}
   static void method(int ...a) {

   }
void rg(){}


   public static void main(String[] args) {

       method();

       method(3);
       int[] a = {1, 2, 3, 4};  method(a);

       method(3, 4);

    }

}
