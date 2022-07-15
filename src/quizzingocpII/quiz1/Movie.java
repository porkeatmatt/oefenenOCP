package quizzingocpII.quiz1;

public class Movie {
    private int butter = 5;
    private Movie(){}
    protected class Popcorn{
        private Popcorn () {
            System.out.println("in constructor inner class");
        }
            //alle variablen in een inner class moeten als ze STATIC zijn, ook FINAL zijn
            //public static int butter = 10;

        String s = "hehe";

            public void startMovie(){
                System.out.println(butter);
            }
            //static methoden mogen niet in inner class
            //public static final void notAllowed(){}
        }

    public static void main(String[] args) {
        int i = 5;
    }
    }

