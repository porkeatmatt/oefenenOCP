package OCPI.classdesign;

public class Penguin implements  Dances, EatsFish{
    @Override
    public String swingArms() {
        return "swing";
    }

    public static void main(String[] args) {
        EatsFish eatsFish = new Penguin();
        System.out.println(eatsFish.swingArms());
    }
}
