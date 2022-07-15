package OCPII.generics;

import java.util.*;

public class Main{

    static Comparator<Integer> c1 = (o1, o2) -> o2 - o1;

   static void printNames(List list){
       for (int i = 0; i < list.size(); i++){
           String name = (String) list.get(i);
           System.out.println(name);
       }
   }

   static void correctUsageUpperBound (List<? extends A> list){
       System.out.println("correct!");
   }

   static void something(List<? extends Number> list){
       list.forEach(System.out::println);
   }

    public static void doIt(List<? extends Number> l){
        var numbers = new HashSet<Number>();
        Iterator iter = numbers.iterator();
    }


    public <B extends A> void third(){
        List<String> strings = new ArrayList<>();
        strings.add("oei");
        for (var s: strings){
            System.out.println(s);
        }
    }

    <L extends A> L ola(List<? extends L> list){
       return list.get(0);
    }


    public static void main(String[] args) {

       //als je list declareert met generic met Upperbound wordt hij generic
        List<? extends Integer> getalletjes = new ArrayList<>();
        //DNC
//        getalletjes.add(5);

        List<B> lijstje1 = new LinkedList<>();
        List<C> lijstje2 = new ArrayList<>();

        correctUsageUpperBound(lijstje1);
        correctUsageUpperBound(lijstje2);

        //als je list declareert met generic met lower bound kan je wel dingen aan toevoegen
        List<? super Number> nogWatGetalletjes = new ArrayList<>();
        nogWatGetalletjes.add(5.0f);


//        List<Float> floats = new ArrayList<>();
//        floats.add(5.0f);
//        doIt(floats);

        List<Object> objects = new ArrayList<>();

        List<Integer> integers = new ArrayList<>();
        integers.add(666);

        something(integers);

        integers.add(555);

        List<Integer> integers1 = Arrays.asList(2, 8, 5, 7);

        Comparator<Integer> c2 = ((o1, o2) -> o1 - o2);

        integers1 .sort(c2);

        System.out.println(integers1);

        List j = new ArrayList();
        j.add(123);
        j.add("hihi");



    }
}
