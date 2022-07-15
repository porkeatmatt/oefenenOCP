package OCPII.IO;

import java.io.*;

public class MethodToLearn {
    public static void main(String[] args) {
        File file1 = new File("c:/Testing/ToDelete");
        System.out.println("is deleted?: " + file1.delete());

        file1.exists();

        System.out.println(file1.getAbsolutePath());

        System.out.println(file1.getName());

        file1.isDirectory();
        file1.isFile();

        System.out.println(file1.lastModified());

        //geeft grootte in bytes vd file
        file1.length();

        //geeft list van files in directory, returnt null als hij niets vindt/ je niet bezig bent
        //met een directory
        System.out.println(new File("c:/Testing").listFiles().length);

        System.out.println(new File(file1, "newDirecotry").mkdirs());


    }
    private void echo() throws IOException {
        var o = new FileWriter("new-zoo.txt");
        try (var f = new FileReader("zoo-data.txt");
             var b = new BufferedReader(f); o) {
            o.write(b.readLine());
        }
        o.write("");
    }
}