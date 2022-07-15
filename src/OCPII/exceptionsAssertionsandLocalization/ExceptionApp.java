package OCPII.exceptionsAssertionsandLocalization;

public class ExceptionApp {
    static void aMethodCheckedExc() throws Exception{
        throw new Exception();
    }

    static void aMethodRuntimeExc(){
        throw new RuntimeException();
    }

    public static void main(String[] args) {


    }
}
