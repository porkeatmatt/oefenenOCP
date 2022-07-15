package OCPII.IO;

import java.io.*;

public class IoApp2 {
    public static void main(String[] args) {
        //constructor met String pathname
        File file1 = new File("c:/Testing/subFolder/makeAfile");
        File file2 = new File("c:/Testing");

        //constructor met String parent, String child
        File file3 = new File("c:/Testing", "subFolder/makeAfile");

        //constructor met File parent, String child
        File file4 = new File(file2, "subfolder/makeAfile");

        File iofile = new File("C:/MoreTesting/IO.txt");

        char[] chars = new char[3];
        chars[0] = 'l';
        chars[1] = 'o';
        chars[2] = 'l';

        try(var writer = new BufferedWriter(
               new FileWriter(iofile)
       )){
           writer.write(chars);
       }catch (IOException io){

       }

        char[] chars2 = new char[100];


        try(var reader = new BufferedReader(
                new FileReader(iofile)
        )){
            reader.read(chars2);
            for(char c: chars2){
                System.out.println(c);
            }
        }catch (IOException io){

        }



    }
}
