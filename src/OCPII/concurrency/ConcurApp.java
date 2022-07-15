package OCPII.concurrency;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Stream;

public class ConcurApp {

    public void performTask(CyclicBarrier c){

        try {
            System.out.println("removing lions");
            c.await();
            System.out.println("cleaning");
            c.await();
            System.out.println("calling lions");
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }

    }


    public static void main(String[] args) {
//        ExecutorService service = null;
//        try{
//            service = Executors.newFixedThreadPool(4);
//            ConcurApp manager = new ConcurApp();
//            var c1 = new CyclicBarrier(4, () -> System.out.println("cage cleaned!"));
//            for (int i = 0; i < 4; i++){
//                service.submit(() -> manager.performTask(c1));
//            }
//        }finally {
//            if(service !=null) service.shutdown();
//        }
//
//        List<String> list = new ArrayList<>();
//        list.add("lol");
//        list.add("hihi");
//
//        List<String> synchronisedList = Collections.synchronizedList(list);

//        Stream<String> stream = Stream.of("w", "o", "l", "f").parallel();
//        System.out.println(
//                stream.reduce("",
//                        (s1,c) -> s1+c,
//                        (s2,s3) -> s2 +s3)
//        );

        System.out.println(List.of(1,2,3,4,5,6)
        .parallelStream()
        .reduce(0, (a,b) -> (a - b)));

        System.out.println(List.of("w", "o", "l", "f")
        .parallelStream()
        .reduce("X", String::concat));

    }
}
