package OCPII.IO;

import java.io.*;

public class TestingPrintWriter {
    public static void main(String[] args) throws IOException {
        try (PrintWriter out = new PrintWriter("C:/MoreTesting/testingPrintWriter.txt")) {
            out.write(String.valueOf(5)); // Writer method
            // PrintWriter method, mag je vanalles aan meegeven want hij interpreteert het toch al String
            out.print(5);
            var a = new Person("Matthias","Andriessen", 30);
            out.write(a==null ? "null": a.toString()); // Writer method
            out.print(a); // PrintWriter method
        }


        Console console = System.console();
        if (console != null) {
            String userInput = console.readLine();
            console.writer().println("You entered: " + userInput);
        } else {
            System.err.println("Console not available");
        }
    }

}
