package OCPII.collecting;

import java.util.*;

public class MapTesting {
    public static void main(String[] args) {
        Map<String, Integer> mattie = new TreeMap<>();
        mattie.put("lol", 12);
        mattie.put("zara", 555);
        mattie.put("achterlijken", 91);

        //bestaat niet!
        //mattie.add()

        Set<Map.Entry<String, Integer>> setOfEntries = mattie.entrySet();
        mattie.forEach((k,v) -> System.out.println(k + " " + v));
        System.out.println(mattie.get("zara"));
        System.out.println(mattie.getOrDefault("bestaatniet", 666));

        mattie.keySet();
        Collection<Integer> c = mattie.values();
        //c.forEach(System.out::print);

        mattie.replace("lol", 13);
        mattie.replace("replaceIetsDatNogNietBestaat", 25555);
        mattie.replaceAll((string, integer) -> {
            integer = integer + 1000;
            return integer;
        });

        System.out.println("aangepast Map");
        mattie.forEach((k,v) -> System.out.println(k + "  " + v));



    }
}
