import java.util.*;
import java.util.function.*;

public class Behavior {

    private static final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

    public static int sum(List<Integer> numbers, Predicate<Integer> p) {
        int total = 0;

        for (Integer n : numbers) {
            if (p.test(n)) {
                total += n;
            }
        }

        return total;
    }

    public static void main(final String args[]) {
        System.out.println(sum(numbers, n -> true));
        System.out.println(sum(numbers, n -> n % 2 == 1));
        System.out.println(sum(numbers, n -> n > 3));
    }
}
