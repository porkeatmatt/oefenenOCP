package OCPII.generics;

import java.util.ArrayList;
import java.util.List;

public class UpperBound {
    public static void main(String[] args) {
        //DNC
        //List<Number> list = new ArrayList<Integer>();

        List<? extends Number> list1 = new ArrayList<Integer>();

        //DNC, je kan geen elementen toevoegen, want java welke elementen
        //er echt mogen toegevoegd worden, Number of een van zijn subklasses?

        //list1.add(5);

        //best alleen bound gebruiken bij parameters in methoden
    }
}
