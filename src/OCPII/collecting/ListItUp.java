package OCPII.collecting;

import OCPI.casting.B;
import OCPII.comparing.Animal;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class ListItUp implements Comparable, Comparator {

    Comparator<Animal> comparator = (Comparator.comparingInt(Animal::getId));

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }

    public static  <E> E aMethod(E e){
        return e;
    }


    public static void main(String[] args) {

//        String[] arrayOfStrings = new String[4];
//
//        arrayOfStrings[0] = "art";
//        arrayOfStrings[1] = "heh";
//        arrayOfStrings[2] = "lol";
//        arrayOfStrings[3] = "ditmagnog";


        List<String> lijstje = new ArrayList<>();
        lijstje.add("lol");
        lijstje.add("levels");
        lijstje.add("Donkey Kong");
        lijstje.add(null);

        Queue<Double> qAnon = new ArrayDeque();
        qAnon.add(5.12);
        qAnon.offer(2d);

        qAnon.peek();
        qAnon.element();

        qAnon.remove();
        qAnon.poll();



        Map<String, Integer> mattie = new TreeMap<>();
        mattie.put("lol", 12);
        mattie.put("zara", 555);
        mattie.put("achterlijken", 91);
        mattie.put("verdomme", null);
        mattie.put("eyo", null);




        System.out.println("Dit is de entryset");
        Set settt = mattie.entrySet();



        BiFunction <Integer,Integer,Integer> mapper1 = (v1,v2) -> v1 > v2 ? v1 : v2;
        BiFunction <Integer, Integer, Integer> mapper2 = (v1,v2) -> null;

        //aangevraagde key heeft een null value dus value wordt ingevuld door nieuwe value
        mattie.merge("eyo", 5, mapper1);
        //key is aanwezig in map dus mapper wordt toegepast op al bestaande value en nieuwe value
        mattie.merge("zara", 666, mapper1);
        //key is nog niet aanwezig in map dus mapper wordt niet toegepast en key+value toegevoegd
        mattie.merge("heheheheh", 6969, mapper1);
        // de mapper return null dus het element wordt verwijdert uit de map
        mattie.merge("lol", 100, mapper2);


        mattie.putIfAbsent("putIfabsentTesten", 9999);

        Set<Integer> testerdetest = new TreeSet<>((o1,o2) -> o2 - o1);


        System.out.println(mattie);

        Set<String> seeet = new HashSet<>();
        seeet.add(null);

//        mattie.forEach((k,v) -> System.out.println(k + " " + v));


//        lijstje.replaceAll(s -> {
//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.append("wevoegenwattoemetStringBuilder");
//            return s + stringBuilder.toString();
//        });

        StringBuilder s3 = new StringBuilder("isdithetbegin");


//        lijstje.forEach(System.out::println);
    }
}
