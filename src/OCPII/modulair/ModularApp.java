package OCPII.modulair;

import java.time.*;
import java.util.*;
import sun.misc.Unsafe;

public class ModularApp {
    private List<String> names;
    private LocalDate visitDate;

    public ModularApp(List<String> names, LocalDate visitDate) {
        this.names = names;
        this.visitDate = visitDate;
    }

    public void unsafeMethod(){
        Unsafe unsafe = Unsafe.getUnsafe();
    }
}
