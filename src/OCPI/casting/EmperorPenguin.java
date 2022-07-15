package OCPI.casting;

public class EmperorPenguin extends Penguin {
    public int getHeight(){
        return 8;
    }
    public void printInfo(){
        System.out.println(super.getHeight());
    }

    public static void main(String[] args) {
        EmperorPenguin emperorPenguin = new EmperorPenguin();

    }
}
