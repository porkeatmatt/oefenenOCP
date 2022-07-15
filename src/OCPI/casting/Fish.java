package OCPI.casting;

public class Fish {
    public static void main(String[] what){
        Primate primate = new Primate();
        if (primate instanceof Primate){
            System.out.println("instance");
        }
    }
}
