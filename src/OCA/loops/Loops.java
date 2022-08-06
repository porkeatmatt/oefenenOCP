package OCA.loops;

public class Loops {

    public static void main(String[] args) {
        FIRST_CHAR_LOOP: for(int a = 1; a <= 4; a++){
            for (char x = 'a'; x <= 'c'; x++){
                if(a==2 || x =='b'){
                    continue;
                }
                System.out.println(" " + a + x);
            }
        }
    }
}
