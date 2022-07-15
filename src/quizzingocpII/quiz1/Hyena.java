package quizzingocpII.quiz1;

import java.util.function.Predicate;

public class Hyena {
    private int age = 1;

    public static void main(String[] args) {
        var p = new Hyena();
        double height = 10;
        int age = 1;
        //reassigment van local variable mag niet
        //testLaugh(p, p = new Hyena());
        age = 2;
    }

    static void testLaugh(Hyena panda, Predicate<Hyena> joke){
        var r = joke.test(panda) ? "hahaha" : "silence";
        System.out.println(r);
    }
}
