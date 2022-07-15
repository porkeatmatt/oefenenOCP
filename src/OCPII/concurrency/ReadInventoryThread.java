package OCPII.concurrency;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ReadInventoryThread extends Thread{

    AtomicInteger sheepcount = new AtomicInteger(5);
    @Override
    public void run() {
        System.out.println("printing");
    }

    public static void main(String[] args) {

        Runnable r1 = () -> System.out.println("Printing Something");
        Runnable r2 = () -> {
            for(int i = 0; i < 3 ; i++){
                System.out.println("Printing record: " +i);
            }
        };
        Callable<String> c1 = () -> "hihi";


                ExecutorService service = null;
                ExecutorService service2 = Executors.newCachedThreadPool();

        try {
            service = Executors.newSingleThreadExecutor();
            System.out.println("begin");
            service.execute(r1);
            service.execute(r2);
            service.execute(r1);

            Future<String> result = service.submit(c1);
            String s = result.get();

            System.out.println(s);

            System.out.println("end");
        }catch(InterruptedException | ExecutionException e){
            System.out.println("iets fout gelopen");
        }finally{
            if(service !=null) service.shutdown();
        }
        System.out.println("aantal processors: " + Runtime.getRuntime().availableProcessors());



    }
}
