package OCPII.IO;

import java.io.*;

public class Exercise {
    public static void main(String[] args) throws IOException {
        File file = new File("c:/Testing/text.txt");
        System.out.println(file.exists());
        //System.out.println(file.toString());

        Console console = System.console();
        Writer w = console.writer();
        String line = "";
        if (console != null) {
            try(w){
                if ((line = console.readLine("Enter your name: ")) != null)
                    w.append(line);
                w.flush();
            }
        } else {
            System.err.println("Console not available");
        }

    }


}
