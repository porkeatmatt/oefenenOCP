package OCPII.generics;

import OCPII.comparing.Animal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Crate <T> {
    private float f = 5.0f;
    private T contents;

    public  T emptyCrate(){
        return contents;
    }
    public void packCrate(T contents){
        this.contents = contents;
    }
    public void doSomething(List<?> l){
        l.forEach(System.out::println);
    }
    static void needsAnObject (Object o){

    }
    public <I> I aGenericMethod (I i){
        return i;
    }

    public static void main(String[] args) {
        Object o = new Object();
        Object s = "thisIsASttring";


        //mag niet!
//        List<Object> lijstje = new ArrayList<String>();


        List<? super Number> list = new ArrayList<>();
        list.add(14.0f);
        needsAnObject("thisAstring");
    }
}
