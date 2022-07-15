package OCPII.functionalprogramming;

import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class PrimitiveStreamTesting {
    public static void main(String[] args) {
        //mogen integers, shorts, bytes, chars zijn
        IntStream ints = IntStream.of(1,2,3);

        //floats en doubles
        DoubleStream doubles = DoubleStream.generate(Math::random).limit(3);

        //longs
        LongStream longs;

        //returnt altijd OptionalDouble!
        OptionalDouble o =  ints.average();
        System.out.println(o.getAsDouble());

        //maakt stream met wrapperKlasse

        IntStream ints2 = IntStream.of(1,2,3);
        Stream<Integer> wrapperStream = ints2.boxed();

        //returnt optionals van onderliggend type, zelfde met max
        //OptionalInt => primitives , Optional<Integer> => wrapper klasse
        IntStream ints3 = IntStream.of(1,2,3);
        OptionalInt minimum = ints3.min();

        //returnt altijd primitive
        double d = doubles.sum();
        System.out.println("som is: " + d);


        //als je van een stream met een soort elementen naar stream gaat met hetzelfde soort elementen gebruik je
        //map
        IntStream testingMap = IntStream.of(1, 2, 7, 8);
        IntStream converted = testingMap.map(i -> i + 2);

        //van stream<R> naar een intstream
        Stream<String> strings = Stream.of("lala", "heh");
        IntStream lengths = strings.mapToInt(String::length);

        //van primitieve stream naar stream<R>
        IntStream againInts = IntStream.of(1, 2, 8);
        Stream<String> lordOfTheStrings = againInts.mapToObj(i -> ((Integer) i).toString());

        //flatmap
        var integerList = new ArrayList<Integer>();
        IntStream ints4 = integerList.stream()
                .flatMapToInt(x -> IntStream.of(x));

        //stats
        LongStream longs2 = LongStream.of(5, 7, 10, 18);
        LongSummaryStatistics stats = longs2.summaryStatistics();
        stats.getMin();
        stats.getAverage();
        stats.getSum();
        stats.getCount();


    }
}
