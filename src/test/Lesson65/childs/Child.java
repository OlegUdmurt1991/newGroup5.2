package test.Lesson65.childs;


import test.Lesson65.parents.GrandParent;
import test.Lesson65.parents.Parent;

public class Child extends Parent {
    Child() {
        id = "212";
    }

    public static void main(String[] args) {
        Child c = new Child();
        Parent p = new Parent();

        System.out.println(c.id);
        p.printId();

    }
}
