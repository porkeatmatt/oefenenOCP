package OCPII.collecting;

import java.util.ArrayList;
import java.util.List;

public class RemoveIfTesten {
    public static void main(String[] args) {
        List<String> lijstje = new ArrayList<>();
        lijstje.add("lol");
        lijstje.add("hehe");
        lijstje.add("herewegoagain");

        lijstje.removeIf(element -> element.startsWith("l"));

        List<String> toRemove = new ArrayList<>();
        toRemove.add("lol");

        lijstje.removeAll(toRemove);

        System.out.println(lijstje);
    }
}
