package quizzingocpII;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Quiz3 {

    public static void main(String[] args) {


        double komma = 5.0;
        //impliciete boxing van int naar double
        double d = 5;
        //hier heb je expliciete cast nodig
        int i = (int) komma;

        //laatste lijn verwacht een Stream<String> geen primitieve string
        //Stream.iterate(1, x -> x++)
        //        .limit(5).map(x -> x)
        //        .collect(Collectors.joining());

        //creeert een List waarbij de elementen als elementen als Object worden behandeld
        List<?> l = List.of("mouse", "parrot");
        //dus dit compileert niet
        //l.removeIf(String::isEmpty);
        //hierbij wordt door het gebruik van var type op List<String> gezet
        var v = List.of("hihi", "hoho");
        //nu compileert volgende lijn wel maar throwed hij een exception want je hebt een immutable list
        //v.removeIf(...);


        var greetings = new LinkedList<String>();
        greetings.offer("lol");
        greetings.offer("blijfterin");
        //verwijdert eerste element in queue en returnt element
        greetings.pop();

        Platypus p1 = new Platypus("Paula", 3);
        Platypus p2 = new Platypus("Peter", 5);
        Platypus p3 = new Platypus("Peter", 7);

        List<Platypus> platypuses = Arrays.asList(p1, p2, p3);

        Comparator<Platypus> c1 = Comparator.comparing(Platypus::getName)
                .thenComparing(Comparator.comparing(Platypus::getBeakLength).reversed());

        Collections.sort(platypuses, c1);

//        platypuses.forEach((Platypus p) -> System.out.println(p.getBeakLength()));

        List<Integer> list123 = List.of(8, 16, 2);
        var aCopy = new ArrayList<>(list123);

        List<Integer> list1111 = List.of(8, 12);

        aCopy.removeAll(list1111);

        System.out.println(aCopy);



    }
}
