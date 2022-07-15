package OCPII.nest;

public class StaticNestedClass {
    public String name = "bob";

    static class Nested{
        private int price = 6;
        // kan wel static fields hebben (niet zoals instance inner class)
        // kan niet aan instance fields van outer class alleen met expliciete referentie naar die member
        private static int something = 7;
        void printSomething(){
            StaticNestedClass nc = new StaticNestedClass();
            System.out.println(nc.name);
        }
    }

    public void instanceMethod(){
        Nested.something += 1 ;
    }

    public static void main(String[] args) {
        // kan geinstantieerd worden zonder verwijzing naar outerclass
        Nested n = new Nested();
        System.out.println(n.price);
    }
}
