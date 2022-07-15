package OCPI.casting;

public class B extends A {

    protected B(int b) {

    }

    public B() {
    }

    void exampleMethod(){
        System.out.println("lol");
    }


    public static void main(String[] args) {
        B b = new B();
        A a = b;
        b.exampleMethod();



    }
}
