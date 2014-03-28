import java.util.*;

public class Lazy {

    private static final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

    public static void main(final String args[]) {

        // Take only a even numbers, double them and print
        // the first one greater than 5

        for (int n : numbers) {
            if(n % 2 == 1) {
                int n2 = n * 2;
                if (n2 > 5) {
                    System.out.println(n2);
                    break;
                }
            }
        }
    }
}
