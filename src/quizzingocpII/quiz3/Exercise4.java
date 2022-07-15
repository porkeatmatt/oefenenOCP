package quizzingocpII.quiz3;

import java.util.ArrayDeque;
import java.util.LinkedList;

public class Exercise4<T> {
    public static void main(String[] args) {


        Double d = 3.14;

        var aQ = new ArrayDeque<String>();
        aQ.offer("aString");
        aQ.offer("anotherOne");
        System.out.println(aQ.pop());
        System.out.println(aQ.poll());



        var greetings = new LinkedList<String>();
        greetings.offer("hello");
        greetings.offer("hi");
        greetings.offer("ola");

        greetings.pop();
        greetings.remove();

        System.out.println(greetings.peek());
    }
}
