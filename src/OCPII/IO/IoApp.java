package OCPII.IO;

import java.io.*;

public class IoApp {
    public static void main(String[] args) throws IOException {
        File file1 = new File("c:/Testing/subFolder/savedObj");

//        try(var fis = new FileReader(file1)){
//            StringBuilder str1 = new StringBuilder();
//            int a;
//            while (fis.read() != -1){
//                str1.append((fis.read()));
//            }
//            System.out.println("this is the content: " + str1);
//        }

        Person p1 = new Person("Matthias", "Andriessen", 29);

        try(var ous = new ObjectOutputStream(
                new FileOutputStream(file1))){
            ous.writeObject(p1);
        }

        try(var ois = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream(file1)
                )
        )){
            while(true){
                System.out.println((Person) ois.readObject());
            }
        }catch (EOFException | ClassNotFoundException e){

        }
        File file2 = new File("c:/Testing/subFolder/textFile.txt");
//
//        String name = "Matthias";
//        int age = 29;
//
//        try (var prtStream = new PrintWriter(
//                new FileWriter(file2)
//        )){
//            prtStream.println("a");
//            prtStream.println("b");
//            prtStream.format("herro my name is %s and im %d years old", name, age);
//        }
        try (var prtStr = new PrintStream(
                new FileOutputStream(file2))){
            prtStr.println("werkt deze ook");
        }



    }
}
