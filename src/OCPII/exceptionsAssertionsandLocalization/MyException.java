package OCPII.exceptionsAssertionsandLocalization;

public class MyException extends Exception{
    MyException(){
        //doet hij automatisch
        super();
    }
    MyException(Exception e){
        super(e);
    }
    MyException(String message){
        super(message);
    }
}
