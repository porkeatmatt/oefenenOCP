package OCPI.casting;

public class C extends B{
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a = (B)(I) b;
    }
}
