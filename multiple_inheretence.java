
interface first_Parent {
    void method1();
}

interface second_Parent {
    void method2();
}

class Child implements first_Parent, second_Parent {
    public void method1() {
        System.out.println("First method from first parent");
    }
    public void method2() {
        System.out.println("second method from second parent");
    }
}

public class multiple_inheretence {
    public static void main(String[] args) {
        Child c = new Child();
        c.method1();
        c.method2();
    }
}
