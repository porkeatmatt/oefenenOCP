package OCPII.functionalprogramming.collectingresults;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToMapTesten {
    public static void main(String[] args) {

        //eerste overload, de function die je meegeeft bepaalt de key + function voor value
        //belangrijk is dat je geen 2 dezelfde keys aanmaakt ==> illegalstateExc
        var ohMy = Stream.of("lions", "tigers", "bears");
        Map<String, Integer> map = ohMy.collect(
                Collectors.toMap(s -> s, String::length));
        System.out.println("eerste overloadmap: " + map);
        //map.forEach((k,v) -> System.out.println(k + "  " + v));

        //nu worden elementen met zelfde keys bij elkaar gevoegd, de Binary operator bepaalt hoe
        var ohMy2 = Stream.of("lions", "tigers", "bears");
        Map<Integer, String> map2 = ohMy2.collect(Collectors.toMap(
                String::length,
                k -> k,
                (s1, s2) -> s1 + "," + s2));
        System.out.println(map.getClass()); // class java.util.HashMap
        map2.forEach((k,v) -> System.out.println(k + "  " + v));

        //dit is een laatste overload waarbij je als laatste argument meegeeft in exact voor map je de
        //resultaten wilt verzamelen
        var ohMy3 = Stream.of("lions", "tigers", "bears");
        TreeMap<Integer, String> map3 = ohMy3.collect(Collectors.toMap(
                String::length,
                k -> k,
                (s1, s2) -> s1 + "," + s2,
                TreeMap::new));
        System.out.println(map); // // {5=lions,bears, 6=tigers}
        System.out.println(map.getClass()); // class java.util.TreeMap

    }
}
