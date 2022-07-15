package OCPI.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionApp implements AutoCloseable{
   static void aMethod (NullPointerException n, int i) throws Exception{ if (i > 5 ) throw n;
    Object obj = Integer.valueOf(5);
   }

   static void rollOut() throws ClassCastException {
   }



    @Override
    public void close() {

    }

    public static void main(String[] args) throws Exception {
//     aMethod(new NullPointerException(), 5);
//        try{
//            aMethod(new NullPointerException(),5);
//        }catch (IOException e){
//            System.out.println("blijft deze code lopen?");
//        }
//
//        System.out.println("jep blijft lopen");

//     try {
//      System.out.println();
//     }catch(RuntimeException e){
//      throw new Exception();
//     }


    }
}
