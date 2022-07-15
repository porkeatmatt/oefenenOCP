package OCPI.casting;

public class Lemur extends Primate implements HasTail{
    @Override
    public boolean isTailStriped() {
        return false;
    }
    public int age = 10;

    public static void main(String[] args) {
        Primate primate = new Lemur();
        Lemur lemur = (Lemur) primate;
    }
}
