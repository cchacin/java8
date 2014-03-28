import java.util.*;
import java.io.*;
import java.util.stream.*;

public class Parallelism {

    public static void main(final String[] args) {

        File current = new File(".");

        File[] children = current.listFiles();

        Stream.of(children).forEach(
            file -> System.out.println(file)
        );
    }
}
