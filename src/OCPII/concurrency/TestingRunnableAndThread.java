package OCPII.concurrency;

public class TestingRunnableAndThread {
    public static void main(String[] args) {
        //lange versie, je maakt een thread Object aan zonder toe te wijzen en geeft een runnable mee aan constructor
        //daarna roep je start() op op dit object
        (new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("eyoo");
            }
        })).start();

        //kortere versie
        (new Thread(() -> System.out.println("yo"))).start();

        //je mag ook een object meegeven van een klassie die runnable implementeert
        (new Thread(new RunnableClass())).start();

        //je kan ook start() rechtstreeks op implementerende klasse oproepen
        (new ThreadClass()).start();
    }
}
