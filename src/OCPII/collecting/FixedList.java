package OCPII.collecting;

import java.util.*;

public class FixedList {
    public static void main(String[] args) {
        List<String> lijstje = new ArrayList<>();
        lijstje.add("lol");
        lijstje.add("levels");
        lijstje.add("Donkey Kong");

        String[] stringArray = new String[3];
        stringArray[0] = "a";
        stringArray[1] = "b";
        stringArray[2] = "c";

        //deze laat nog aanpassingen toen met set()
        //dan pas je zowel origineel als kopie aan
        List<String> kopie = Arrays.asList(stringArray);
        stringArray[2] = "z";
        kopie.set(1, "totaal iets anders");
        System.out.println("dit is origineel:");
        for(String s: stringArray){
            System.out.println(s);
        }
        System.out.println("dit is de kopie:");
        System.out.println(kopie);

        //dit runt wel maar geeft exception
        //kopie.add("tocheensproberen");

        //deze laten geen aanpassingen toe met set()
        List<String> nogEenKopie = List.of(stringArray);
        //mag niet
        //nogEenKopie.set(0, "tocheensproberen");

        List<String> kopieVanAndereList = List.copyOf(lijstje);


    }
}
