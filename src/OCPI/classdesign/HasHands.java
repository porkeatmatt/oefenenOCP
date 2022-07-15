package OCPI.classdesign;

public interface HasHands extends HasWings {
    default void isAMethod(){
        System.out.println("doSomething");
    }
}
