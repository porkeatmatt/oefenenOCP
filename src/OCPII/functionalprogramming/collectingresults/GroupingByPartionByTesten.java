package OCPII.functionalprogramming.collectingresults;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingByPartionByTesten {
    public static void main(String[] args) {
        //groupingBy splits de elementen en verzamelt die in een Map<K, List<T>>
        //je bepaalt hoe je elementen wilt met een Function die je meegeeft
        //je geeft een function mee => aanvaardt type element en returnt ander type
        var ohMy = Stream.of("lions", "tigers", "bears");
        Map<Integer, List<String>> map = ohMy.collect(
                Collectors.groupingBy(str -> str.length()));
        System.out.println(map); // {5=[lions, bears], 6=[tigers]}

        //overload waarbij je meegeeft specifiek in welke map je alles verzamelt => optioneel
        //en waarbij je elementen verzamelt in sets niet lists
        var ohMy2 = Stream.of("lions", "tigers", "bears");
        TreeMap<Integer, Set<String>> map2 = ohMy2.collect(
                Collectors.groupingBy(
                        String::length,
                        TreeMap::new,
                        Collectors.toSet()));
        System.out.println(map); // {5=[lions, bears], 6=[tigers]}

        //partitioningBy doet hetzelfde maar je maakt maar 2 keys, true en false
        //kent geen overload waarbij je bepaalt welke map je wilt
        var ohMy3 = Stream.of("lions", "tigers", "bears");
        Map<Boolean, Set<String>> map3 = ohMy3.collect(
                Collectors.partitioningBy(
                        s -> s.length() <= 7,
                        Collectors.toSet()));
        System.out.println(map); // {false=[], true=[lions, tigers, bears]}

        var quiz = Stream.of("lions", "tigers", "bears");
        Map<Boolean, Map<Object,Object>> mapQuiz = quiz.collect(
                Collectors.partitioningBy(
                        s -> s.length() <=7,
                        Collectors.toMap(
                                str -> str.charAt(0),
                                str -> str.charAt(1)
                        )
                )
        );

        //hierbij wordt de value vd map het aantal elementen die je onder eenzelfde key verzameld hebt
        var ohMy4 = Stream.of("lions", "tigers", "bears");
        Map<Integer, Long> map4 = ohMy4.collect(
                Collectors.groupingBy(
                        String::length,
                        Collectors.counting()));
        System.out.println(map); // {5=2, 6=1}

        //mapping()
        //hierbij ga je een 2 niveaus dieper
        //in de elementen die je verzameld hebt op basis van hun lengte wil je de eerste letter
        //van het eerste element krijgen
        var ohMy5 = Stream.of("lions", "tigers", "bears");
        Map<Integer, Optional<Character>> map5 = ohMy.collect(
                Collectors.groupingBy(
                        String::length,
                        Collectors.mapping(
                                s -> s.charAt(0),
                                Collectors.minBy((a, b) -> a -b))));
        System.out.println(map); // {5=Optional[b], 6=Optional[t]}
    }
}
