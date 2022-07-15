package quizzingocpII.quiz1;

public class OuterClassMakingInstant {
    enum Food {APPLES, BERRIES;}
    class Inner {
        private int whatev = 2;
        Food returnFavorite(){
            return Food.APPLES;
        }
    }

    public static void main(String[] args) {
       Inner i = new OuterClassMakingInstant().new Inner();
        System.out.println(i.returnFavorite());
    }
}
