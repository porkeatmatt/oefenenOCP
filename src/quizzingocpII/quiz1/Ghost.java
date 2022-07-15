package quizzingocpII.quiz1;

public class Ghost {
    public static void boo(){
        System.out.println("not scared");
    }
    protected final class Spirit {
        public void boo(){
            System.out.println("booo!");
        }
    }

    public static void main(String[] args) {
        //dit is een anonieme klasse => moet spirit kunnen implementeren => spirit mag niet final zijn
        //var g = new Ghost().new Spirit() {};
        var g = new Ghost().new Spirit();

    }


}
