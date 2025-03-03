package pattern.behavioral.templateMethod;

public class TemplateMethod {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.templateMethod();
        b.templateMethod();
    }
}

abstract class C {
    void templateMethod() {
        System.out.print("1");
        differ();
        System.out.println("3");
    }
    abstract void differ();
}

class A extends C {
    @Override
    void differ() {
        System.out.print("2");
    }
}

class B extends C {
    @Override
    void differ() {
        System.out.print("4");
    }
}
