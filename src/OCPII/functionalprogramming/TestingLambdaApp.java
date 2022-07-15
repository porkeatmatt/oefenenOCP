package OCPII.functionalprogramming;

import java.util.function.Predicate;

public class TestingLambdaApp {

    //je mag een parameter reassignen
    static Predicate<String> pr1 = t -> {
//        t = "hihi";
        return t.equals("lol");
    };

    static boolean testThePredicate (Predicate<String> predicate){
        return predicate.test("doet er niet toe");
    }

    public static void main(String[] args) {
        String something = "lol";
        //je mag niet something opnieuw gebruiken als parameter van een Lambda
        //Predicate<String> pr = something -> true;

        boolean b = testThePredicate(pr1);
        System.out.println(b);
    }
}
