package OCPII.optionals;

import OCPII.comparing.Animal;

import java.util.Optional;

public class OptionalApp {

    public static Optional<Double> average(int...scores){
        if(scores.length == 0) return Optional.empty();
        int sum = 0;
        for (int score: scores){
            sum += score;
        }
        return Optional.of((double) sum / scores.length);
    }

    public static void main(String[] args) {
        System.out.println(average());
        String case1 = "uppercase";
        Optional o1 = Optional.ofNullable(case1);
        o1.ifPresent(s -> System.out.println("er zit iets in"));

        double length = 5.0;

        assert 100.0 == length : "Problem with length";

        System.out.println("deze zou niet mogen uitgevoerd worden");

    }
}
