package OCPII.nest;

public class NestingApp {
    public void aMethod(){
        int alocalvariable;
        InterFaceExample anonclass = new InterFaceExample() {
            @Override
            public void doSomething() {
                System.out.println("this is how we rollin");
            }
        };
        anonclass.doSomething();
    }

    public void anotherOne(InterFaceExample anon) {

    }

    public static void main(String[] args) {
        NestingApp n = new NestingApp();
        n.anotherOne(new InterFaceExample() {
            @Override
            public void doSomething() {

            }
        });
    }
}
