class A {

}

class B extends A {

}

class C extends B{

}

public class InstanceOfDemo {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        Object c = new C();
        System.out.println(c instanceof B);
    }
}