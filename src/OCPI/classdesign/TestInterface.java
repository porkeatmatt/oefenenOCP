package OCPI.classdesign;

public interface TestInterface {
    void anAbstractMethod();
    default void doSomething(){
        System.out.println("musthavebody");
    }
}
