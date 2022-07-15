package projectEuler;

import java.util.stream.Stream;

public class Problem1 {
    public static void main(String[] args) {
        int totalCount = Stream.iterate(1, i -> i < 1000, i -> i + 1)
                .filter(i -> i % 5 == 0 | i % 3 == 0)
                .reduce(0, Integer::sum);


        System.out.println(totalCount);
    }
}
