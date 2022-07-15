package OCPII.generics;

public class GenericMethodExample {
    //declaratie van generic geeft aan dat je generic zal gebruiken
    public <T> void prepare(T t){
        System.out.println("preparing " + t);
    }
    public static <T> T identity(T t){
        return t;
    }

    //dnc
    // public static T noGood(T t) {return t;}

    public static void main(String[] args) {
        var g = new GenericMethodExample();

        g.<String>prepare("heh");
    }
}
