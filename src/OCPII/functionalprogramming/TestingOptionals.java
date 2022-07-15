package OCPII.functionalprogramming;

import java.util.Optional;
import java.util.function.Consumer;

public class TestingOptionals {

    public static Optional<Double> average(int...scores){
        if(scores.length == 0) return Optional.empty();
        int sum = 0;
        for (int score: scores) sum += score;
        return Optional.of((double) sum / scores.length);
    }


    public static void main(String[] args) throws Throwable {
        //System.out.println(average(12,15));



        Consumer consumer = s1 -> System.out.println(s1 + " " + s1);
        Optional opt = average(12,15);

        opt.ifPresent(consumer);

        Optional<String> empty = Optional.empty();

        System.out.println(empty.orElse("andere waarde"));
        System.out.println(empty.orElseGet(()-> "orElseGet"));

        opt.orElseThrow(IllegalStateException::new);
    }
}
