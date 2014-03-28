import java.util.*;

public class NotSyntaxSugar {

    public static void main(final String[] args) throws Exception {
        Thread th = new Thread(
            new Runnable() {
                public void run() {
                    System.out.println("Thread");
                }
            }
        );

        th = new Thread(
            new Runnable() {
                public void run() {
                    System.out.println("Thread");
                }
            }
        );

        th = new Thread(
            new Runnable() {
                public void run() {
                    System.out.println("Thread");
                }
            }
        );

        th = new Thread(
            new Runnable() {
                public void run() {
                    System.out.println("Thread");
                }
            }
        );

        th = new Thread(
            new Runnable() {
                public void run() {
                    System.out.println("Thread");
                }
            }
        );

        th = new Thread(
            new Runnable() {
                public void run() {
                    System.out.println("Thread");
                }
            }
        );

        th = new Thread(
            new Runnable() {
                public void run() {
                    System.out.println("Thread");
                }
            }
        );

        th = new Thread(
            new Runnable() {
                public void run() {
                    System.out.println("Thread");
                }
            }
        );

        th.start();
        th.join();

        Thread lambdaThread = new Thread(
            () -> System.out.println("lambdaThread")
        );

        lambdaThread.start();
        lambdaThread.join();
    }

}
