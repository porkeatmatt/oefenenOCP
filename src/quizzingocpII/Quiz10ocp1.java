package quizzingocpII;

public class Quiz10ocp1 {
    static void aMethod(){

    }
    public static void main(String[] args) {

//        try {
//            System.out.println("A");
//            throw new NullPointerException();
//        }catch (ArithmeticException a){
//            System.out.println("B");
//        }finally{
//            System.out.println("C");
//        }
//        System.out.println("D");

        try{
            System.out.println("A");
            aMethod();
        }catch(Exception e){
            System.out.println("een error!");
        }
    }
}
