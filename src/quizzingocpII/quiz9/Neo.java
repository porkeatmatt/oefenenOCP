package quizzingocpII.quiz9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Neo {

    public static void main(String[] args) throws IOException {
        //verschil tussen list en walk
//        Files.list(Path.of("c:/Testing"))
//                .forEach(s-> System.out.println(s));
//        Files.walk(Path.of("c:/Testing"))
//            .forEach(s-> System.out.println(s));

//        Files.createDirectories(Path.of("c:/Testing"));

        try (var writer = Files.newBufferedWriter(Path.of("c:/Testing/bestaatnogniet.txt"))){
            writer.write("schrijft hij erbij?");
        }


    }

    public void removeBadFile (Path path) throws IOException {
        if (Files.isDirectory(path)){
            System.out.println(Files.deleteIfExists(path) ? "Success" : "Try again");
        }
    }
}
