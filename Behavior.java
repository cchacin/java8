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

    public static int sumOdd(List<Integer> numbers) {
        int total = 0;

        for (Integer n : numbers) {
            if(n % 2 == 1) {
                total += n;
            }
        }

        return total;
    }

    public static void main(final String args[]) {
        System.out.println(sumAll(numbers));
        System.out.println(sumOdd(numbers));
    }
}
