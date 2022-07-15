package OCPII.generics;

import java.util.ArrayList;
import java.util.List;

public class Unbounded {
    public static void printList(List<Object> list){
        for (Object x: list){
            System.out.println(x);
        }
    }

    public static void printLikeThis(List<?> list){
        for(Object x: list){
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("lol");
        //dnc, je probeert een List<Object> referentie te refereren naar
        //een List<String> instantie

        //printList(strings);

        //werkt nu wel, want nu maakt de methode een referentie naar een list
        //met gelijk welke elementen
        printLikeThis(strings);

        List<?> elementen = new ArrayList<>();
        //dnc, want hij weet niet wat je kan toevoegen
        //elementen.add("string");
    }
}
