package OCPII.annotations;

public class DepracatingExample {
    @Deprecated
    static void doSomething(){
        System.out.println("sus");
    }

    public static void main(String[] args) {
        doSomething();
    }
}
