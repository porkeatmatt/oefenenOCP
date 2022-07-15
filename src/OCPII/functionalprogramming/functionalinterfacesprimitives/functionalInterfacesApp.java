package OCPII.functionalprogramming.functionalinterfacesprimitives;

import java.util.function.*;

public class functionalInterfacesApp {
    public static void main(String[] args) {
        //aanvaardt double, returnt boolean
        DoublePredicate pred = d -> d > 5.0;
        pred.test(8.0);

        //aangepast get() functie
        LongSupplier sup = () -> 5000000;
        sup.getAsLong();

        //aanvaardt 2 ints, returnt er 1
        IntBinaryOperator operator = (i1, i2) -> i1 + i2;
        operator.applyAsInt(8,9);

        //aanvaardt object (die je zelf bepaalt), returnt double
        ToDoubleFunction<String> funct = Str -> Str.length();
        funct.applyAsDouble("lol");

        //zet doubles om naar int
        DoubleToIntFunction function = d -> (int) (d + 7);
        function.applyAsInt(99);

        //aanvaart een object en een long returnt niets
        ObjLongConsumer<String> consument = (str, d) -> System.out.println(str + d);
    }
}
