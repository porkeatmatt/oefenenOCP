package OCPI.classdesign;

import java.io.IOException;

public class StrB {
    private StringBuilder str;

    public StrB(StringBuilder str) {
        this.str = str;
    }

    public StringBuilder getStr() {
        return str;
    }
    public static void doSomething(){
        try{
            int i = 5;
        }catch (ArithmeticException a){
            System.out.println("whoops");
        }finally {
            System.out.println("doet ie zowiezo");
        }
    }

    public static void main(String[] args) {
        doSomething();
    }
}
