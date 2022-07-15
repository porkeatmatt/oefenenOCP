package OCPII.generics;



public class ConcreteClass extends AbstractClass{
    @Override
    public void doThis() {

    }
    @Override
    public void doThat() {

    }

    @Override
    public void doSomething() {
        System.out.println("hihi");
    }

    public static void main(String[] args) {
        var concreteClass = new ConcreteClass();
        concreteClass.doSomething();
    }
}
