package OCPII.nest;

public class LocalClass {
    void anInstanceMethod(){
        final int width = 20;
        // geen access modifier toegelaten, mogen ook niet static zijn
        class MyLocalClass{
            //mag geen static field declareren
            final String aLocalVariable = "kek";

            public void doSomething(){
                //kunnen aan alle members van outer class
                System.out.println("in de local class met width: " + width);
                //kunnen aan local variables alleen als ze final of effectively final zijn
                System.out.println(aLocalVariable);
            }
        }
        MyLocalClass mlc = new MyLocalClass();
        mlc.doSomething();
    }

    public static void main(String[] args) {
        LocalClass lc = new LocalClass();
        lc.anInstanceMethod();
    }
}
