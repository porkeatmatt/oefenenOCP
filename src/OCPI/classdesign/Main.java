package OCPI.classdesign;

public class Main {
    public static void main(String[] args) {

        StrB s = new StrB(new StringBuilder().append("a"));
        s.getStr().append("b");
        System.out.println(s.getStr());
    }
}
