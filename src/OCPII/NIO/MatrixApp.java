package OCPII.NIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MatrixApp {

    private int aVariable;



    public static void main(String[] args) throws IOException {



        Path p = Path.of("c:/Testing/text.txt");
        Files.move(p, Path.of("c:/Testing/Tomove/text.txt"));

//        Path p1 = Path.of("c:/JavaProgram/packagea/ClassA.java");
//        System.out.println("string van path: " + p1.toString());
//        System.out.println("namecount is: " + p1.getNameCount() );
//        System.out.println("");
//       System.out.println("er zijn " + p1.getNameCount() + " paths aanwezig in deze directory");
//
//        System.out.println(p1.getName(0));
//        System.out.println(p1.getName(1));
//        System.out.println(p1.getName(2));
//
//        Path p2 = p1.subpath(1,3);

//        Path p7 = Path.of("/fish");
//        System.out.println(p7.toAbsolutePath());
//
//        Path path = Path.of("/cats/../panther");
//        Path path2 = Path.of("/food/catFood");
//        System.out.println(path.resolve(path2));

//        var path1 = Path.of("fish.txt");
//        System.out.println(path1.toAbsolutePath());
//        var path2 = Path.of("friendly/birds.txt");
//        System.out.println(path2.toAbsolutePath());
//        System.out.println(path1.relativize(path2));
//        System.out.println(path2.relativize(path1));
//
//
//        System.out.println(Paths.get(".").toRealPath());
//        Files.createDirectory(Paths.get("c:/Testing/CopyMap"));
//        Files.copy(Paths.get("c:/Testing/text.txt"), Paths.get("c:/Testing/CopyMap/text.txt"));

        var path = Path.of("voobeeld", "second", "flexibel");
        System.out.println(path);

//        Path textpath = Path.of("c:/Testing/text.txt");
//
//        try (BufferedReader reader = Files.newBufferedReader(textpath)){
//            String currentline = null;
//            while((currentline = reader.readLine()) != null){
//                System.out.println(currentline);
//            }
//        }


//        List<String> list = Files.readAllLines(textpath);
//        System.out.println("aantal elementen in lijst: " + list.size());
//        list.forEach(s -> System.out.print(s));

//        Path video = Path.of("c:/testing/video");
//
//        BasicFileAttributes data = Files.readAttributes(video, BasicFileAttributes.class);
//        data.isDirectory();
//
//        BasicFileAttributeView view = Files.getFileAttributeView(video, BasicFileAttributeView.class);
//        BasicFileAttributes attributes = view.readAttributes();






//        System.out.println(Files.isSameFile(Path.of("/bestaat niet"),Paths.get("/bestaat ook niet")));

//    try (Stream<Path> s = Files.list(Path.of("c:/Testing"))){
//        s.forEach(System.out::println);
//    }


    }
}
