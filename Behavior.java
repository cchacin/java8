import java.util.*;

public class Behavior {

    private static final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

    public static int sumAll(List<Integer> numbers) {
        int total = 0;

        for (Integer n : numbers) {
            total += n;
        }

        return total;
    }

    public static void main(final String args[]) {

    }
}
