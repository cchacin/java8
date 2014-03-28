import java.util.*;
import java.io.*;

public class Parallelism {

    public static void main(final String[] args) {

        File current = new File(".");

        File[] children = current.listFiles();

        for(File child : children) {
            System.out.println(child);
        }
    }
}
