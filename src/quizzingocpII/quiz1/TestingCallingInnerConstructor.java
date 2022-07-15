package quizzingocpII.quiz1;

public class TestingCallingInnerConstructor {
    class Inner{
        Inner(){
            System.out.println("in inner constructor");
        }
    }
    void aInstanceMethod(){
        //je roept constructor op in zelfde outer class in instance method => ok!
        var i = new Inner();
    }

    static void aStaticMethod(){
        //compileert niet want je roept instance method (constructor) op in een static
        //var i = new Inner();
    }

    public static void main(String[] args) {
        var test = new TestingCallingInnerConstructor();
        test.aInstanceMethod();
    }
}
