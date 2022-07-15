package OCPII.NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;

public class FunctionNio {
    public static void main(String[] args) throws IOException {

        Path toCopy = Path.of("c:/Testing/CopyFolder");
        Path target = Path.of("c:/Testing/ToMove/CopyFolder");

        Path moved = Files.move(toCopy, target);

        BasicFileAttributeView view = Files.getFileAttributeView(toCopy, BasicFileAttributeView.class);
        BasicFileAttributes attr = view.readAttributes();


        }

    }


