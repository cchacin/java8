import java.util.*;
import java.io.*;
import java.util.stream.*;

public class Parallelism {

    public static void processFile(File file) {

        try {
            Thread.sleep(1000);
        } catch(Exception e) {
        }

        System.out.println(file);
    }

    public static void main(final String[] args) {

        File current = new File(".");

        File[] children = current.listFiles();

        Stream.of(children)
              .parallel()
              .forEach(file -> processFile(file)
        );
    }
}
