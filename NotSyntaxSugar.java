import java.util.*;

public class NotSyntaxSugar {

    public static void main(final String[] args) {
        Thread th = new Thread(
            new Runnable() {
                public void run() {
                    System.out.println("Thread");
                }
            }
        );
    }

}
