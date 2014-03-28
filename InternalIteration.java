import java.util.*;

public class InternalIteration {

    private static final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

    public static void main(final String args[]) {

        numbers.forEach((Integer n) -> System.out.println(n));
    }
}
