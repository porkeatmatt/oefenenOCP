package OCPII.optionals;

import java.util.Optional;

public class Main {

    static void unCheckedExceptions(){
        throw new RuntimeException();
    }

    static void checkedExceptions() throws Exception {
        throw new Exception();
    }

    public static void main(String[] args) throws Throwable {
        String s = null;
        Optional opt = Optional.ofNullable(s);
        System.out.println(opt.orElseThrow(RuntimeException::new));
    }
}
