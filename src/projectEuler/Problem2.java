package projectEuler;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Problem2 {
    public static void main(String[] args) {
        List<Integer> fib = new ArrayList<>();
        fib.add(1);
        fib.add(2);

        int i = 1;
        int nextElement = 0;

        for (;nextElement < 4000000; i++){
            nextElement = fib.get(i) + fib.get(i - 1);
            fib.add(nextElement);
        }

        fib.remove(32);

        int sum = fib.stream()
                .filter(i1 -> i1 % 2 == 0)
                .reduce(0, Integer::sum);

        System.out.println(sum);

    }
}
