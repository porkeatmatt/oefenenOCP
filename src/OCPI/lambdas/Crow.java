package OCPI.lambdas;

import java.util.function.Predicate;

public class Crow {
    private String color;
    public boolean caw(String name){
        Predicate<String> p = s -> (name + 5) == "name5";
        return p.test("lol");
    }

    public static void main(String[] args) {

    }
}
