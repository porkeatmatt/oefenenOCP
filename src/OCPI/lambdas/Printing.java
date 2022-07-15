package OCPI.lambdas;

import java.util.function.Predicate;

public class Printing {

    Predicate<Integer> predicate;

    public Printing(Predicate<Integer> predicate) {
        this.predicate = s -> true ;
    }

    void doSomething(){
        Printable p = () -> System.out.println("hihi");
    }
    void variables(){
        Predicate<Integer> predicate = a -> {
            int b = 0;
            int c = 2;
            return b ==c;
        };
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
