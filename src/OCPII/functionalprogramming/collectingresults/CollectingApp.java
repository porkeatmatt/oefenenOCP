package OCPII.functionalprogramming.collectingresults;

import java.util.DoubleSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CollectingApp {
    public static void main(String[] args) {
        //berekent average, je geeft er een ToIntFunction aan mee (objecten -> integers)
        //returnt double
        var strings = Stream.of("lions", "tigers", "bears");
        Double result = strings.collect(Collectors.averagingInt(String::length));

        //returnt long
        var strings2 = Stream.of("lions", "tigers", "bears");
        long numberOfElements = strings2.collect(Collectors.counting());

        //summary, kan ook in ints, longs
        var strings3 = Stream.of("lions", "tigers", "bears");
        DoubleSummaryStatistics stats = strings3.collect(Collectors.summarizingDouble((str -> (double) str.length())));
        stats.getAverage();

        //joining()
        //returnt een stream<String>
        //moet je geen parameter aan meegeven => dan plakt hij alles aan mekaar
        //parameter: is wat je ertussen steekt
        var ohMy = Stream.of("lions", "tigers", "bears");
        String result2 = ohMy.collect(Collectors.joining());
        System.out.println(result2); // lions, tigers, bears
    }
}
