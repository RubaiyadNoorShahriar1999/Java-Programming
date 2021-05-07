class A {
    public int aData;
}

class B extends A {
    public int bData;
}

class C extends B {
    public int cData;
}

public class InstanceOfExample {
    public static void main(String[] args) {

        A aObject = new A();
        B bObject = new B();
        C cObject = new C();

        System.out.println(aObject instanceof B);
        System.out.println(aObject instanceof C);

        System.out.println(bObject instanceof A);
        System.out.println(bObject instanceof C);

        System.out.println(cObject instanceof A);
        System.out.println(cObject instanceof B);
    }
}