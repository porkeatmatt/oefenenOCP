package quizzingocpII;

import java.sql.SQLOutput;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Quiz4 {
    public static void main(String[] args) {

        Stream.generate(() -> "1")
                .limit(10)
                .peek(System.out::println)
                .forEach(System.out::println);

        var stream = LongStream.of(1, 2, 3);
        var emptyOpt = stream.map(n -> n * 10)
         .filter(n -> n < 5).findFirst();
        if(emptyOpt.isPresent()){
            System.out.println("hierna komt er niets?: " + emptyOpt.getAsLong());
        }

       //je probeert longs om te zetten naar ints => dan moet je casten in de parameter van mapToInt
        // LongStream.of(6L, 8L, 10L)
            //.mapToInt(x -> x);


        Predicate<String> predicate = s -> s.length()> 3;
        var stream2 = Stream.iterate("-",
                s -> ! s.isEmpty(), (s) -> s + s);
        var b1 = stream2.noneMatch(predicate);
        //stream heeft al een terminal operation gehad, dus kan niet opnieuw
        //        var b2 = stream2.anyMatch(predicate);
        //System.out.println(b1 + " " + b2);


        Map<Object, Set<Integer>> average = LongStream.of(6L, 8L, 10L)
                .mapToInt(x -> (int) x)
                .boxed()
                .collect(Collectors.groupingBy(x -> x, Collectors.toSet()));

        List<String> whatever = new ArrayList<>();

        var is = IntStream.empty();

        var stream123 = LongStream.of(1, 2, 3);
        var opt1 = stream123.map(n -> n * 10)
                .filter(n -> n < 5).findFirst();

//        opt1.ifPresent(System.out::println);

        Predicate<String> empty = String::isEmpty;
        Predicate<String> notempty = empty.negate();



    }
}
