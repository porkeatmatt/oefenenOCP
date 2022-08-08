package OCPI.overriding;

public class Snake {
    boolean isLittle(){
        return false;
    }
    public void getSnakeDescription(){
        System.out.println("Is snake little: " + isLittle());
    }
}
class LittleSnake extends Snake{
    boolean isLittle(){
        return true;
    }
    public void getLittleSnakeDescription(){
        System.out.println("Is littlensake little: " + isLittle());
    }


    public static void main(String[] args) {
        LittleSnake ssssssjjj = new LittleSnake();

        ssssssjjj.getSnakeDescription();
        ssssssjjj.getLittleSnakeDescription();
    }
}
