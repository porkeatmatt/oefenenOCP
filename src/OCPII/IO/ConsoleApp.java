package OCPII.IO;

import java.io.Console;
import java.io.File;

public class ConsoleApp {
    public static void main(String[] args) {
        Console console = System.console();
        if (console == null) {
            System.err.println("console not available");
        } else {
            console.writer().println("Welcome to Our Zoo!");
            console.format("It has %d animals and employs %d people", 391, 25);
            console.writer().println();
            console.printf("The zoo spans %5.1f acres", 128.91);
        }

        File file1 = new File("c:/Users/32473/Documents");
        String s =  file1.getName();
        System.out.println(s);
    }



}
